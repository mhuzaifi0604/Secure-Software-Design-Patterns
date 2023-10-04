public class Port_Adapter implements Laptop {
    Advance_Laptop_Converter converter;
    public Port_Adapter(String USBType){
        if(USBType.equalsIgnoreCase("Type-C")){
            converter = new Type_C_Port();
        }
    }
    @Override
    public void connect(String USBType){
        if(USBType.equalsIgnoreCase("Type-C")){
            converter.connecttoTypeC(USBType);
        }
    }
}
