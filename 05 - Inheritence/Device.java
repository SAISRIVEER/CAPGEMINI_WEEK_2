public class Device {
    String deviceID;
    String status;

    public Device(String deviceID, String status) {
        this.deviceID = deviceID;
        this.status = status;
    }

    void Display(){
        System.out.println("\nDevice ID: "+deviceID);
        System.out.println("Status: "+status);
    }

}

class Thermostat extends Device{
    String temperatureSettings;

    public Thermostat(String deviceID, String status, String temperatureSettings) {
        super(deviceID, status);
        this.temperatureSettings = temperatureSettings;
    }

    @Override
    void Display(){
        super.Display();
        System.out.println("Temperature Settings: "+temperatureSettings);
    }
}

class Dev{
    public static void main(String[] args) {
        Device d=new Device("716!f","working");
        Thermostat t=new Thermostat("$@#1","Working","Settings");

        d.Display();
        t.Display();
    }



}