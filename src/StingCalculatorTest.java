import static org.junit.Assert.*;
import org.junit.Test;

public class StingCalculatorTest {
	
	@Test
	public void emptyStringTest()
	{
		//given
		StringCalculator sc = new StringCalculator();
		//when
		String result = sc.calculator("");
		//then
		assertEquals(result,"");
	}
	

}
