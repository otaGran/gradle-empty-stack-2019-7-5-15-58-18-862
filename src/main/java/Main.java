public class Main {
    public static void main(String args[]){
        Person person = new Person("ffff");
        Mobile mobile = new iPhone("beans","white","apple");
        person.setMobile(mobile);
        person.sendMessage("sss");

    }
}
