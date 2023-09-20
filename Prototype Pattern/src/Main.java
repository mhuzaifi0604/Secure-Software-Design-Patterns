// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BurgerCache.loadCache();

        Prototype clonedVegBurger = (Prototype) BurgerCache.getBurger("VegBurger");
        System.out.println("Burger Details: " + clonedVegBurger.getName() + ", " + clonedVegBurger.getDescription());

        Prototype clonedChickenBurger = (Prototype) BurgerCache.getBurger("Chicken Burger");
        System.out.println("Burger Details: " + clonedChickenBurger.getName() + ", " + clonedChickenBurger.getDescription());
    }
}