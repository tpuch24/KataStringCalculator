import static org.junit.Assert.*;
import org.junit.Test;

public class StingCalculatorTest {
	
	@Test
	public void nullForEmptyStringTest()
	{
		//given
		StringCalculator sc = new StringCalculator();
		//when
		int result = sc.add("");
		//then
		assertEquals(result,0);
	}
	
	@Test
	public void value1ForANumberParameterStringTest()
	{
		//given
		StringCalculator sc = new StringCalculator();
		//when
		int result = sc.add("1");
		//then
		assertEquals(result,1);
	}

}
