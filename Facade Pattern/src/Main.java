// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Mall_Management manager = new Mall_Management("Apple", 50, true,
               "huzaifi0604", "20i0604",
               "Large Pizza", 1000
               );

       manager.Print_Department_Details();
       manager.Print_Auth_Details();
       manager.print_order();
       manager.handle_payment();
    }
}