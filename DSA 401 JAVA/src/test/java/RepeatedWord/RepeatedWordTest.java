package RepeatedWord;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedWordTest {

    @Test
    public void repeatedWord() {
        String phrase = "wakka flakka flame likes to wakka";
        String paragraphPunc = "Ring, a ding, dong, wam, bam, up, down, waffle, wow!!!, wam"	;
        String unique = "dog cat waffle duck pig";

        assertEquals("wakka", RepeatedWord.repeatedWord(phrase));
        assertEquals("wam", RepeatedWord.repeatedWord(paragraphPunc));
        assertEquals("no repeats, nice vocabulary!", RepeatedWord.repeatedWord(unique));
    }
}