package test;

import main.BalancedBrackets;
import org.junit.Test;

import static main.BalancedBrackets.hasBalancedBrackets;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here


    //TODO1: test of [] two brackets
    @Test
    public void openAndCloseBracketsReturnsTrue(){
        //BalancedBrackets obj=new BalancedBrackets();
        assertEquals(true,hasBalancedBrackets("[]"));
    }
    //TODO2: test [LaunchCode]
    @Test
    public void bracketAtFirstAndBracketAtEndReturnsTrue(){
        String spec="return true if we enter an open bracket at the" +
                " first sentence and close bracket at the end ";
        assertEquals(spec,true,hasBalancedBrackets("[LaunchCode]"));
    }
    //TODO3: Launch[Code]
    @Test
    public void twoBracketInTheLast(){
        String spec="return true if we enter an open bracket at the" +
                " middle sentence and close bracket at the end ";
        assertEquals(true,hasBalancedBrackets("Launch[Code]"));
    }
    //TODO4:[]LaunchCode
    @Test
    public void twoOpenBracketReturnsTrue(){
        String spec="return true if we enter two brackets at the first";
        assertEquals(true,hasBalancedBrackets("[]LaunchCode"));
    }
    //TODO5:""
    @Test
    public void emptyStringBracketReturnsTrue(){
        String spec="return true if empty string";
        assertEquals(true,hasBalancedBrackets(""));
    }
    //TODO6:IF TWO same closed  BRACKETs
    @Test
    public void twoClosedBracketReturnsFalse(){
        String spec="return FALSE if same brackets";
        assertEquals(spec,false,hasBalancedBrackets("]]"));
    }
    //TODO7:if two open same brackets
    @Test
    public void twoOpenBracketReturnsFalse(){
        String spec="return FALSE if same open brackets";
        assertEquals(spec,false,hasBalancedBrackets("hel[["));
    }
    //TODO8:if sequence of  brackets  [][][]
    @Test
    public void sequenceBracketsReturnsTrue(){
        String spec="return true if there a sequence of brackets";
        assertEquals(spec,true,hasBalancedBrackets("[][][]"));
    }
    //TODO8:if reverse  brackets  ][
    @Test
    public void reverseBracketsReturnsFalse(){
        String spec="return false if reverse brackets";
        assertEquals(spec,false,hasBalancedBrackets("]["));
    }
    //TODO9:sequence of brackets[[]][]
    @Test
    public void sequenceOfBrackets(){
        String spec="return true there same open and close  brackets";
        assertEquals(spec,true,hasBalancedBrackets("[[]][]"));
    }
    //TODO10:single open brackets[
    @Test
    public void singleOpenBracket(){
        String spec="return false of single open bracket";
        assertEquals(spec,false,hasBalancedBrackets("["));
    }
    //TODO11:single close bracket
    @Test
    public void singleClosedBracket(){
        String spec="return false of single close bracket";
        assertEquals(spec,false,hasBalancedBrackets("]"));
    }
    //TODO12:two bracket at the end
    @Test
    public void twoBracketAtTheEnd(){
        String spec="return true of two brackets at the end";
        assertEquals(spec,true,hasBalancedBrackets("launch code[]"));
    }
}
