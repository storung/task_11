package view;

/**
 * Contains variants of answers to the user
 */
public enum MessStack {

    GREETING("Введите последовательно слова: "),
    GREETING1("Не забывайте после каждого ввенного слова нажимать \"Enter\"."),
    NEXT_WORD("Введите слово:"),
    FORMAT_EXCEPTION("Введено неверное слово, повторите попытку..."),
    GOOD_BYE("Вы справились с заданием, поздравляю!\nВведенная фраза:");


    private String message;

    MessStack(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
