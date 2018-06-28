package model;

/**
 * Contains a complex sentence of the added words.
 * Serve to control addition of new words.
 */

public class Sentence {

    private StringBuilder value;

    private WordPatterns[] patterns;

    private int position;
    private int maxPosition;

    private String[] strPatterns;

    public Sentence() {
        patterns = WordPatterns.values();
        position = 0;
        maxPosition = patterns.length-1;

        value = new StringBuilder();
    }

    /**
     * Copies the original array of word patterns
     * @return String[] - array of word patterns
     */
    public String[] getPatterns(){

        int quantity = patterns.length;
        strPatterns = new String[quantity];
        for (int i = 0; i < quantity; i++) {
            strPatterns[i] = patterns[i].getText();
        }

        return strPatterns;
    }

    /**
     * Add word to sentence. Controls the correctness of the word
     * @param text
     * @return false - text doesn't match the pattern
     * @throws SentenceIsCompleteException
     */
    public boolean setWord(String text) throws SentenceIsCompleteException {

        if (position > maxPosition){
            throw new SentenceIsCompleteException();
        }

        if (!patterns[position].getText().equals(text)){
            return false;
        }

        value.append(text);

        if (position++ != maxPosition){
            value.append(" ");
        }

        return true;
    }

    public String getText() {
        return value.toString();
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
