package com.plineexp.TriangleMaven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TriangleTest1 {

	Triangle triangle1 = new Triangle();
	/*@Test
	public void test1() {
			assertEquals("Echecs, ce triangle n'est pas Equilatéral",
					"Equilateral", triangle1.TriangleType(5, 5, 4)
				    );
		}
*/

	
	@Test
	public void Test2() {assertEquals("Isocèle", triangle1.TriangleType(5, 5, 4)
					);
	}

	@Test
	public void Test3() {
			assertEquals("Equilateral", triangle1.TriangleType(7, 7, 7)
					);
	} 

	@Test
	public void Test5() {
		assertEquals("Scalene", triangle1.TriangleType(5, 7, 3)
				);
	 }



	/*@Test
	/void Test7() {
			assertEquals("Equilateral", triangle1.TriangleType(10.5, 6.7, 7.1)
					);
	} */
}
