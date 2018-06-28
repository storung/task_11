package view;

/**
 *  Contains output methods to interact with the user
 */
public class MainView {

    public void display(MessStack messStack, ConsolOutputColor color){
        display(messStack.getMessage(), color);
    }

    public void display(MessStack messStack){
        display(messStack.getMessage());
    }

    public void display(String message, ConsolOutputColor color){
        display(color + message);
    }

    public void display(String message){
        System.out.println( message);
    }

}
