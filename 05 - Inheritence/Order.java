public class Order {

    String orderID;
    String date;

    public Order(String orderID, String date) {

        this.orderID = orderID;
        this.date = date;
    }

    void getOrderStatus(){
        System.out.println("Order ID: "+orderID);
        System.out.println("Date: "+date);
    }

}

class ShippedOrder extends Order{
    int trackingNumber;

    public ShippedOrder(String orderID, String date, int trackingNumber) {
        super(orderID, date);
        this.trackingNumber = trackingNumber;
    }

    @Override
    void getOrderStatus(){
        super.getOrderStatus();
        System.out.println("Delivery date: "+trackingNumber);
    }

}

class DeliverOrder extends ShippedOrder{

    String deliveryDate;

    public DeliverOrder(String orderID, String date, int trackingNumber, String deliveryDate) {
        super(orderID, date, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    void getOrderStatus(){
        super.getOrderStatus();
        System.out.println("Delivery date: "+deliveryDate);
    }
}

class Ord{
    public static void main(String[] args) {
        DeliverOrder D=new DeliverOrder("41A51","03-04-2025",123456789,"05-04-2025");

        D.getOrderStatus();
    }
}