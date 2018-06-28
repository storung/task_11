import controller.InputController;
import controller.MainController;
import view.MainView;

public class Main {

    public static void main(String[] args) {

        MainController controller = new MainController(
                new InputController(),
                new MainView());

        controller.Start();


    }

}
