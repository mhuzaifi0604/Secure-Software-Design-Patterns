public class ChickenBurger extends Prototype{
    public ChickenBurger(){
        setName("Chicken Burger");
        setDescription("Price: 250");
    }
    @Override
    public void prepare(){
        System.out.println("Inside Chicken Burger::Prepare Method");
    }
}