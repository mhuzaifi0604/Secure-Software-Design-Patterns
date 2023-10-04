public class Cancel_Order implements Command_Execution {
    private Restaurant order;
    public Cancel_Order(Restaurant order_placed){
        this.order = order_placed;
    }

    @Override
    public void execute(String meal){
        order.Cancel_Order(meal);
    }
}