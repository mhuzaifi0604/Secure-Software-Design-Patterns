public class Caller {
    public static void main(String[] args) {
        Main object = Main.get_instance(); // calling the new object
        // logging variables from class on console
        System.out.print("Logging name: " + object.name + "\n");
        System.out.print("Logging Age: "+ object.age + "\n");
        // Logging message on console
        object.print("My 1st Java Code\n");
        // craeting copy of object
        Main object2 = Main.get_instance();
        System.out.print("Logging name: " + object2.name + "\n");
        System.out.print("Logging Age: "+ object2.age + "\n");
        object2.print("2nd Object Copy");
    }
}
