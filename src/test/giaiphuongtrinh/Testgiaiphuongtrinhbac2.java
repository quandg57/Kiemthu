package test.giaiphuongtrinh;

import static org.junit.Assert.*;
import main.giaiphuongtrinh.giaiphuongtrinhbac2;

import org.junit.BeforeClass;
import org.junit.Test;

public class Testgiaiphuongtrinhbac2 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@Test
	public void testvonghiem() {
		giaiphuongtrinhbac2 g1 = new giaiphuongtrinhbac2(0, 0, 1);
		assertEquals("vo nghiem",g1.tinhnghiem());
	}
	@Test
	public void test1nghiem() {
		giaiphuongtrinhbac2 g2 = new giaiphuongtrinhbac2(0, 1, 0);
		assertEquals("0.0",g2.tinhnghiem());
	}
	@Test
	public void testvosonghiem() {
		giaiphuongtrinhbac2 g3 = new giaiphuongtrinhbac2(0, 0, 0);
		assertEquals("vo so nghiem", g3.tinhnghiem());
	}
	@Test
	public void testmotnghiem() {
		giaiphuongtrinhbac2 g4 = new giaiphuongtrinhbac2(1, 2, 1);
		assertEquals("-1.0", g4.tinhnghiem());
	}
	@Test
	public void testhainghiem() {
		giaiphuongtrinhbac2 g5 = new giaiphuongtrinhbac2(1, 5, 6);
		assertEquals("-3.0 -2.0",g5.tinhnghiem());
	}
	@Test
	public void testvonghiem1() {
		giaiphuongtrinhbac2 g6 = new giaiphuongtrinhbac2(1, 2, 3);
		assertEquals("vo nghiem",g6.tinhnghiem());
	}
	@Test
	public void testvonghiem2() {
		giaiphuongtrinhbac2 g6 = new giaiphuongtrinhbac2(90, 4, 90);
		assertEquals("vo nghiem",g6.tinhnghiem());
	}
	
}
