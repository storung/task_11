package controller;

import model.Sentence;
import model.SentenceIsCompleteException;
import view.ConsolOutputColor;
import view.MainView;
import view.MessStack;

/**
 * Main [task1] Controller
 */
public class MainController {

    private InputController input;
    private MainView view;

    public MainController(InputController input, MainView view) {
        this.input = input;
        this.view = view;
    }

    public void Start(){


        Sentence sentence = new Sentence();

        view.display(MessStack.GREETING);

        for (String pattern :
                sentence.getPatterns()) {
            view.display("\t" + pattern);
        }

        view.display(MessStack.GREETING1);

        for (int i = 0; i < sentence.getPatterns().length; i++) {

            view.display(MessStack.NEXT_WORD);

            Boolean isCorrect = false;
            while (!isCorrect){

                try {
                    isCorrect = sentence.setWord(input.getInput());
                }
                catch (SentenceIsCompleteException e){
                    // Critical error in model
                    throw new RuntimeException(e);

                }
                if (!isCorrect){
                    view.display(MessStack.FORMAT_EXCEPTION);
                }
            }

        }

        view.display(MessStack.GOOD_BYE);
        view.display(sentence.getText(), ConsolOutputColor.ANSI_BLUE);

    }
}
