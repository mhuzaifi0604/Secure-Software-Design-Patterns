public class PlanFactory {
    public DomesticPlan getplan(String plan){
        if(plan == null){
            return null;
        } else if (plan.equalsIgnoreCase("domestic")) {
            return new Domestic();
        } else if (plan.equalsIgnoreCase("commercial")) {
            return new Commercial();
        } else if (plan.equalsIgnoreCase("institutional")) {
            return new Institutional();
        }
        return null;
    }
}
