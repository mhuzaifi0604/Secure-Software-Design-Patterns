import java.awt.*;

public class Menu_Invoker {
    private Command_Execution place_order;
    private Command_Execution assign_rider;
    private Command_Execution deliver_meal;
    private Command_Execution cancel_order;

    public Menu_Invoker(Command_Execution placement,
                        Command_Execution Assigning,
                        Command_Execution Delivery,
                        Command_Execution Cancellation){
        this.place_order = placement;
        this.assign_rider = Assigning;
        this.deliver_meal = Delivery;
        this.cancel_order = Cancellation;
    }

    public void click_order(String meal){
        place_order.execute(meal);
    }
    public void click_rider_assignment(String rider_name){
        assign_rider.execute(rider_name);
    }
    public void click_delivery(String rider_name){
        deliver_meal.execute(rider_name);
    }
    public void click_cancel(String meal){
        cancel_order.execute(meal);
    }
}
