package JenkinsProDemo.com.pack;

import static org.junit.Assert.assertEquals;

import java.util.logging.Logger;

import org.junit.Before;
import org.junit.Test;

public class ValidateAllTestCase {

	private final static Logger LOG = Logger.getLogger(ValidateAllTestCase.class.getName());
	private App obj=null;
	
	@Before
	public void init() {
		obj=new App();
	}
	
	@Test
	public void getFullName() {
		LOG.info("inside the getFullName()");
		assertEquals("SANJEEV", obj.getFullName("sanjeev"));
	}
	
	@Test
	public void addTwoNumber() {
		LOG.info("inside the addTwoNumber()");
		assertEquals(5, obj.addNum(3, 2));
	}
	
	
	
	
	
}
