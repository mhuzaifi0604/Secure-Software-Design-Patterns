// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Restaurant rest = new Restaurant();
        Command_Execution click_order = new Order_Placement(rest);
        Command_Execution rider_assignment = new Rider_Assignment(rest);
        Command_Execution click_delivery = new Meal_Delivery(rest);
        Command_Execution click_cancel = new Cancel_Order(rest);

        Menu_Invoker menu = new Menu_Invoker(
                click_order,
                rider_assignment,
                click_delivery,
                click_cancel
        );

        menu.click_order("Cheese Burger");
        menu.click_rider_assignment("Musaab");
        menu.click_delivery("Musaab");
        menu.click_cancel("Cheese Burger");
    }
}