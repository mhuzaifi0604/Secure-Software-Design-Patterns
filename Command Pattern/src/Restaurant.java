public class Restaurant {
    public void order_placement(String meal){
        System.out.println("User wants some " + meal);
    }
    public void Rider_assignment(String Rider_name){
        System.out.println("Restaurant assigned user's meal to " + Rider_name);
    }
    public void Meal_Delivery(String Rider_name){
        System.out.println(Rider_name + " Delivered meal to the user.");
    }
    public void Cancel_Order(String meal){
        System.out.println("User Cancelled the meal : " + meal);
    }

}
