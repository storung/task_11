
import model.Sentence;
import org.junit.Assert;
import org.junit.Test;

public class ModelTest {

    @Test
    public void doTest() throws Exception{

        Sentence sentence = new Sentence();

        String[] patterns = sentence.getPatterns();
        Assert.assertNotNull("null patterns list", patterns);
        Assert.assertTrue("patterns list is empty", patterns.length>0);

        for (int i = 0; i < patterns.length; i++) {
            String text =  patterns[i];
            Assert.assertNotNull(String.format("null value in %d position of patterns list", i), text);
            Assert.assertFalse(String.format("empty value in %d position of patterns list", i), text == "");

            /*fist adding test - text doesn't match pattern*/
            Boolean isMatch = true;
            String testText = "";
            while (isMatch){
                testText += "testText";
                if (!testText.equals(text)){
                    isMatch = false;
                }
            }
            Assert.assertFalse("Class Sentence doesn't control the correctness of the input: adding wrong text", sentence.setWord(testText));

            /*second adding test, adding the correct text*/
            Assert.assertTrue("Class Sentence doesn't control the correctness of the input: adding correct text", sentence.setWord(text));
        }

        Assert.assertNotNull("summary text is null value", sentence.getText());
        Assert.assertFalse("summary text is empty", sentence.getText() == "");

    }

}
