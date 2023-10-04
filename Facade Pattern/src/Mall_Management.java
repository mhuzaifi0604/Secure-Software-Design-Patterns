import javax.accessibility.AccessibleValue;

public class Mall_Management {
    private Product_Catalogue product;
    private User_Authentication auth;
    private Order_Processing_System order;
    private Payment_Processing payment;

    public Mall_Management(
            String Detail, int Price , boolean availability,
            String username, String password,
            String Order_name,
            int price
    ){
        product = new Product_Catalogue(Detail, Price, availability);
        auth = new User_Authentication(username, password);
        order = new Order_Processing_System(Order_name);
        payment = new Payment_Processing(price);

    }
    public void Print_Department_Details(){
        product.Department_Details();
    }
    public void Print_Auth_Details(){
        auth.Authenticate();
    }
    public void print_order(){
        order.View_Order();
    }
    public void handle_payment(){
        payment.View_Payment();
    }
}
