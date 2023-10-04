public class Payment_Processing {
    private int amount;
    public Payment_Processing(int price) {
        this.amount = price;
    }

    public void View_Payment(){
        System.out.println("User Payed " + amount + " Rupees");
    }
}
