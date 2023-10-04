public class Order_Processing_System {
    private String Order;

    public Order_Processing_System(String Order){
        this.Order = Order;
    }
    public void View_Order(){
        System.out.println("viewing Order: " + Order);
    }
}
