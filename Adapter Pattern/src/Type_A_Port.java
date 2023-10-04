public class Type_A_Port implements Laptop{
    Port_Adapter adapter;
    @Override
    public void connect(String USBType){
        if(USBType.equalsIgnoreCase("Type-A")) {
            System.out.println(("\nConnecting to " + USBType + " Port in Old Laptop\n"));
        }else if(USBType.equalsIgnoreCase("Type-C")){
            adapter = new Port_Adapter(USBType);
            adapter.connect(USBType);
        }else{
            System.out.println("Invalid Port type\n" + "Conversion to " + USBType + " Not Possible.");
        }
    }
}
