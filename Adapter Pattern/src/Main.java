// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Type_A_Port converter = new Type_A_Port();

        converter.connect("Type-A");
        converter.connect("Type-C");
        converter.connect("Type-B");
    }
}