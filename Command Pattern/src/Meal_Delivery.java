public class Meal_Delivery implements Command_Execution {
    private Restaurant order;
    public Meal_Delivery(Restaurant order_placed){
        this.order = order_placed;
    }

    @Override
    public void execute(String rider_name){
        order.Meal_Delivery(rider_name);
    }
}