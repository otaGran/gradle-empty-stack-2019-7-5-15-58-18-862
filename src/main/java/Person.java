public class Person {
    private String name;
    private Mobile mobile;

    public Person(String name) {
        this.name = name;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    public void sendMessage(String message){
        mobile.sendMessage(message);
    }

}
