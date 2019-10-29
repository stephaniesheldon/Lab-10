import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
public class RecursionTest {
	@Test
	public void testFactorial() {
		Recursion recursion = new Recursion();
		int expected = recursion.factorial(10);
		int actual = 3628800;
		Assert.assertEquals(expected, actual);
	}
	
	//TODO: GENERATE AND COMPLETE TESTS FOR ALL METHODS IN THE RECURSION CLASS.

	@Test
	public void testFibbonacci(){
		Recursion fib = new Recursion();
		int testNumber = 11;
		int expected = 89;
		int actual = fib.fibonacci(testNumber);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testcircledSquared(){
		Recursion area = new Recursion();
		double squareLength = 2;
		int depth = 3;
		
		double expected = 9.141;
		double actual = area.circledSquared(true, squareLength, depth);
		
		assertEquals(expected, actual,0.001);
		
		double radius = 4;
		
		expected = 107.398;
		actual = area.circledSquared(false, radius, depth);
		
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testNnaryTree(){
		Recursion ntree = new Recursion();
		int branchingFactor = 5;
		int height = 4;
		int expected = 156;
		int actual = ntree.nnaryTreeSize(branchingFactor, height);
		
		assertEquals(expected, actual);
	}
}

