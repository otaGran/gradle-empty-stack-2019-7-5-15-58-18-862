public class iPhone extends Mobile {


    public iPhone(String name, String color, String brand) {
        super(name, color, brand);
    }

    public void call(String message){
        System.out.println("<iPhone>Message : "+message);
    }
}
