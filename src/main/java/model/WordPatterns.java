package model;

/**
 * Contains patterns to control correctness of the input
 */

public enum WordPatterns {

    WORD_1("Hello"),
    WORD_2("world!");

    private String text;

    WordPatterns(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
