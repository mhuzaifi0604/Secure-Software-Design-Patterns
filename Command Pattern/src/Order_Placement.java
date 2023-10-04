public class Order_Placement implements Command_Execution {
    private Restaurant order;
    public Order_Placement(Restaurant order_placed){
        this.order = order_placed;
    }

    @Override
    public void execute(String meal){
        order.order_placement(meal);
    }
}
