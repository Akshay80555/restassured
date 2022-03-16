package resttesting;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class Diffjunitandtesting {
	@Before
	public void Bt()
	{
		String name = "Alok";
		String sname = "pandey";
		
		Assert.assertEquals(sname, name);
		
	}
	@Test
	public void testcase1()
	{
		System.out.println("This is the first methord");
	}
	
	@After
	public void At()
	{
		System.out.println("This is the after methord");
	}
	
}


