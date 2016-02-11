/**
 *   File Name: Info.java<br>
 *
 *   Mallapre, Christian<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Feb 10, 2016
 *
 */

package com.sqa.CM.util.helper;

import java.util.Arrays;

/**
 * Info //ADDD (description of class)
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
public class Info {
	public static void display2DInfo(Object[][] objects) {
	}

	public static void displayInfo(Object obj) {
		System.out.println("The object is of type: " + obj.getClass().getSimpleName());
		System.out.println("\tThe number of modifiers are: " + obj.getClass().getModifiers());
		System.out.println("\tThe fields are: " + Arrays.deepToString(obj.getClass().getFields()));
		System.out.println("\tThe methods are: " + Arrays.deepToString(obj.getClass().getDeclaredMethods()));
		System.out.println("\tValue of object: " + obj.toString());
	}

	public static void displayInfo(Object obj1, Object obj2, Object... objN) {
	}

	public static void displayInfo(Object[] obj) {
		for (Object object : obj) {
			displayInfo(object);
		}
	}

	public static String get2DInfo(Object[][] objects) {
		// TODO implement method to get 2d info
		return null;
	}

	public static String getInfo(Object obj) {
		// TODO implement method to get info
		return null;
	}
}
