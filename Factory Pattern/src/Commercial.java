public class Commercial implements DomesticPlan {
    @Override
    public void Plan(){
        System.out.println("Inside Commercial Plan");
    }

    public void calculateBill(int units){
        double price  = rate * units;
        System.out.println("Total Price for Commercial Plan: " + price);
    }
}