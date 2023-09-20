// Declaring the Main class
public class Main {
    String name = new String("");
    int age = 0;
    // Creating a new object/ instance using private constructor
    private static Main instance = new Main();
    // Creating a Private Constructor
    private Main(){
        // Printing on console
        System.out.println("Private Constructor Got Called");
        name = "Huzaifa";
        age =20;
    }
    // Creating fucntion to return the instance creayed above
    public static Main get_instance(){
        return instance;
    }
    // Function to print message on console.
    public void print(String message){
        System.out.print("Message: " + message);
    }
}