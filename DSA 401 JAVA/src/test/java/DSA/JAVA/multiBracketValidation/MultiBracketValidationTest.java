package DSA.JAVA.multiBracketValidation;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    @Test
    public void testMultiBracketValidationSingleFail(){
        MultiBracketValidation testS = new MultiBracketValidation();
        assertFalse(testS.multiBracketValidation("(]("));
    }

    @Test
    public void testMultiBracketValidationMultipleFails(){
        MultiBracketValidation testS = new MultiBracketValidation();
        assertFalse(testS.multiBracketValidation("[({}]"));
        assertFalse(testS.multiBracketValidation("{(})"));
    }

}