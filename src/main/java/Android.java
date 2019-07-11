public class Android extends Mobile {
    final int MESSAGELENGTHLIMIT = 5;
    public Android(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public void sendMessage(String message) {
        if(message.length()>MESSAGELENGTHLIMIT)
            System.out.println("<Andriod> Message cannot be sent");
        else
        System.out.println("<Andriod>Message : "+message);
    }
}
