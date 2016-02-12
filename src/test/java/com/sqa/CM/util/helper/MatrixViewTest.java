/**
 *   File Name: MatrixViewTest.java<br>
 *
 *   Mallapre, Christian<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Feb 11, 2016
 *
 */

package com.sqa.CM.util.helper;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * MatrixViewTest //ADDD (description of class)
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
public class MatrixViewTest {

	public int addNumber(int num1, int num2) {
		int total = num1 + num2;
		return total;
	}

	@Test
	public void addNumberTest() {
		int expect = 40;
		int total = addNumber(22, 28);
		Assert.assertSame(expect, total);
		if (true) {
			System.out.println("Success");
		}
	}

	/**
	 * Test method for
	 * {@link com.sqa.CM.util.helper.Info#display2DInfo(java.lang.Object[][])}.
	 */
	@Test
	@Ignore
	public void testDisplay2DInfo() {
		Object[][] my2DMatrix = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };
		Info.display2DInfo(my2DMatrix);
	}

	/**
	 * Test method for
	 * {@link com.sqa.CM.util.helper.Info#get2DInfo(java.lang.Object[][])}.
	 */
	@Test
	@Ignore
	public void testGet2DInfo() {
		Object[][] my2DMatrix = { { 'A', 'B', 'C', 'D', 'E' }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 },
				{ 16, 17, 18, 19, 20 }, { 21, 22, 23, 24, 25 } };
		Info.display2DInfo(my2DMatrix);
	}

}
