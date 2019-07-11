public class Mobile {
    private String name;
    private String color;
    private String brand;


    Mobile(String name, String color, String brand) {
        this.name = name;
        this.color = color;
        this.brand = brand;
    }
    public void sendMessage(String message){
        System.out.println("Message : "+message);
    }

    public void getBasicInformation(){
        System.out.printf("name: %s, color: %s, brand: %s\n",name,color,brand);
    }
}
