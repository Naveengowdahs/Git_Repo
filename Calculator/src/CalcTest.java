import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CalcTest {

	Calculator c;
	
	
	@Before
	public void setup()
	{ 
		c = new Calculator();
    }
	
	
	
	@Test
	public void testMethod(){
		double res;
		res = c.add(10, 20);
		assertSame(30, res);
		
	}
	
	
	
	
	@Test
	public void testAdd() {

	 c = new Calculator();
     assertNotSame(10,c.add(10.5, 20.5));
     assertSame(10,c.sub(30, 20));
     //assertSame(100,c.add(10, 10));
	}
	@Test
	public void testMul() {
		 c = new Calculator();
		 assertSame(100,c.mul(10, 10));
	}
	@Test 
	public void testsub()
	{
		c = new Calculator();
		assertSame(15, c.sub(20, 5));
	}

}
