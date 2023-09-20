public class Institutional implements DomesticPlan {
    @Override
    public void Plan(){
        System.out.println("Inside Institutional Plan");
    }

    public void calculateBill(int units){
        double price  = rate * units;
        System.out.println("Total Price for Institutional Plan: " + price);
    }
}