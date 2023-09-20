// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PlanFactory plans = new PlanFactory();

        DomesticPlan plan1 = plans.getplan("domestic");
        plan1.calculateBill(100);
        DomesticPlan plan2 = plans.getplan("commercial");
        plan2.calculateBill(200);
        DomesticPlan plan3 = plans.getplan("institutional");
        plan3.calculateBill(300);
    }
}