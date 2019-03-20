/**
 * Created by Vamsee Vennu on 3/20/2019.
 */
public class HelloWorld {

    private String message = "Hello World";

    public HelloWorld(String message) {
        this.message = message;
    }



    public String getMessage() {
        return message;
    }

    public void setMessage(String aMessage) {
        message = aMessage;
    }

    public static void main(String[] args)
    {
        HelloWorld goodbye = new HelloWorld("GoodMorning");
        System.out.println(goodbye.getMessage());

    }
}