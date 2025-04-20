import java.util.*;
interface MedicalRecord {
    void addRecord(String record);
    List<String> viewRecords();
}
abstract class Patient {
    protected String patientId;
    protected String name;
    protected int age;
    private String diagnosis;
    private List<String> medicalHistory;
    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalHistory = new ArrayList<>();
    }
    public abstract double calculateBill();
    public String getPatientDetails() {
        return "ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
    public String getDiagnosis() {
        return diagnosis;
    }
    protected void addToHistory(String record) {
        medicalHistory.add(record);
    }
    protected List<String> getHistory() {
        return medicalHistory;
    }
}
class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double roomChargePerDay;
    public InPatient(String patientId, String name, int age, int daysAdmitted, double roomChargePerDay) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.roomChargePerDay = roomChargePerDay;
    }
    public double calculateBill() {
        return daysAdmitted * roomChargePerDay + 500; // 500 for fixed doctor charges
    }
    public void addRecord(String record) {
        addToHistory("InPatient: " + record);
    }
    public List<String> viewRecords() {
        return getHistory();
    }
}
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }
    public double calculateBill() {
        return consultationFee;
    }
    public void addRecord(String record) {
        addToHistory("OutPatient: " + record);
    }
    public List<String> viewRecords() {
        return getHistory();
    }
}
public class HospitalPatientManagement {
    public static void displayPatientBilling(Patient patient) {
        System.out.println(patient.getPatientDetails());
        System.out.println("Diagnosis: " + patient.getDiagnosis());
        System.out.println("Total Bill: ₹" + patient.calculateBill());
        System.out.println("Medical Records:");
        if (patient instanceof MedicalRecord) {
            MedicalRecord mr = (MedicalRecord) patient;
            for (String rec : mr.viewRecords()) {
                System.out.println("- " + rec);
            }
        }
        System.out.println("------------------------\n");
    }
    public static void main(String[] args) {
        Patient p1 = new InPatient("001", "Korai", 31, 6, 2500);
        p1.setDiagnosis("Appendicitis");
        ((MedicalRecord) p1).addRecord("Admitted to general ward");
        ((MedicalRecord) p1).addRecord("Underwent surgery");

        Patient p2 = new OutPatient("002", "Kanishkar", 29, 350);
        p2.setDiagnosis("Flu");
        ((MedicalRecord) p2).addRecord("Consulted Dr. Raghavan");

        displayPatientBilling(p1);
        displayPatientBilling(p2);
    }
}
