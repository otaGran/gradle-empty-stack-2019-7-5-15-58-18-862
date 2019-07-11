public class iPhone extends Mobile {

    final int MESSAGELENGTHLIMIT = 5;
    public iPhone(String name, String color, String brand) {
        super(name, color, brand);
    }

    public void sendMessage(String message){
        if(message.length() > MESSAGELENGTHLIMIT)
            System.out.println("<iPhone> Message cannot be sent");
        else
            System.out.println("<iPhone>Message : "+message);
    }
}
