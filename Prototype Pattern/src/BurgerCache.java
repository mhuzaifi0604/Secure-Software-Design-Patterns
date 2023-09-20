import java.util.Hashtable;
public class BurgerCache {
    private static Hashtable<String, Prototype>prototypeMap = new Hashtable<String, Prototype>();

    public static Prototype getBurger(String BurgerID){
        Prototype cachedBurger = prototypeMap.get(BurgerID);
        return (Prototype) cachedBurger.clone();
    }

    public static void loadCache(){
        ChickenBurger CB = new ChickenBurger();
        CB.setName("Chicken Burger");
        prototypeMap.put(CB.getName(), CB);

        VegBurger VB = new VegBurger();
        VB.setName("VegBurger");
        prototypeMap.put(VB.getName(), VB);
    }
}
