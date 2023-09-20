public class VegBurger extends Prototype{
    public VegBurger(){
        setName("VegBurger");
        setDescription("Price: 150");
    }
    @Override
    public void prepare(){
        System.out.println("Inside VegBurger::Prepare Method");
    }
}