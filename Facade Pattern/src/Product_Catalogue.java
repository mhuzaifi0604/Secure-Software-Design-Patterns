public class Product_Catalogue {
    private String Detail;
    private int price;
    private boolean availability;

    public Product_Catalogue(String Detail, int price, boolean available){
        this.availability = available;
        this.Detail = Detail;
        this.price = price;
    }
    public void Department_Details(){
        System.out.println("This is Product Catalogue Management Department\n");
        System.out.println("Printing Product Details\n " +
                "Name: " + Detail + ", Price: " + price + " available: " + availability);
    }
}
