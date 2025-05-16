import dev.augusto.Fatorial;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class FactorialCalculatorTest {

    @Test
    public void Test_Calculate_Positive_Number(){
        //Arrange
        int number = 5;


        Fatorial calculator = new Fatorial(number);


        assertEquals(number, calculator.GetNumber());
        assertEquals(120, calculator.GetResult());
    }

    @Test
    public void Test_Calculate_Negative_Number(){
        //Arrange
        int number = -5;


        Fatorial calculator = new Fatorial(number);


        assertEquals(number, calculator.GetNumber());
        assertEquals(number, calculator.GetResult());
    }
}



