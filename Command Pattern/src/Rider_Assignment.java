public class Rider_Assignment implements Command_Execution {
    private Restaurant order;
    public Rider_Assignment(Restaurant order_placed){
        this.order = order_placed;
    }

    @Override
    public void execute(String rider_name){
        order.Rider_assignment(rider_name);
    }
}