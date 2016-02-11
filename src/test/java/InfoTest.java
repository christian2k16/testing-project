import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *   File Name: InfoTest.java<br>
 *
 *   Mallapre, Christian<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Feb 10, 2016
 *
 */

/**
 * InfoTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Mallapre, Christian
 * @version 1.0.0
 * @since 1.0
 *
 */
public class InfoTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Runs Before the Class executes - @BeforeClass");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Runs After the Class executes - @AfterClass");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("\tDo setup for Test Method - @Before");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("\tDo Tear Down for Test Method - @After");
	}

	/**
	 * Test method for
	 * {@link src.main.java.com.sqa.CM.util.helper.Info#display2DInfo(java.lang.Object[][])}
	 * .
	 */
	@Test
	public void testDisplay2DInfo() {
		System.out.println("\t\tTest for Display2DInfo - @Test");
	}

	/**
	 * Test method for
	 * {@link src.main.java.com.sqa.CM.util.helper.Info#displayInfo(java.lang.Object)}
	 * .
	 */
	@Test
	public void testDisplayInfoObject() {
		System.out.println("\t\tTest for DisplayInfoObject - @Test");
	}

	/**
	 * Test method for
	 * {@link src.main.java.com.sqa.CM.util.helper.Info#displayInfo(java.lang.Object[])}
	 * .
	 */
	@Test
	public void testDisplayInfoObjectArray() {
		System.out.println("\t\tTest for DisplayInfoObjectArray - @Test");
	}

	/**
	 * Test method for
	 * {@link src.main.java.com.sqa.CM.util.helper.Info#displayInfo(java.lang.Object, java.lang.Object, java.lang.Object[])}
	 * .
	 */
	@Test
	public void testDisplayInfoObjectObjectObjectArray() {
		System.out.println("\t\tTest for DisplayInfoObjectObjectObjectArray - @Test");
	}

	/**
	 * Test method for
	 * {@link src.main.java.com.sqa.CM.util.helper.Info#get2DInfo(java.lang.Object[][])}
	 * .
	 */
	@Test
	public void testGet2DInfo() {
		System.out.println("\t\tTest for Get2DInfo - @Test");
	}

	/**
	 * Test method for
	 * {@link src.main.java.com.sqa.CM.util.helper.Info#getInfo(java.lang.Object)}
	 * .
	 */
	@Test
	public void testGetInfo() {
		System.out.println("\t\tTest for GetInfo - @Test");
	}

}
