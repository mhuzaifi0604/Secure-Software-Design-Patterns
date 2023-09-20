public class Domestic implements DomesticPlan {
    @Override
    public void Plan(){
        System.out.println("Inside Domestic Plan");
    }

    public void calculateBill(int units){
        double price  = rate * units;
        System.out.println("Total Price for Domestic Plan: " + price);
    }
}
