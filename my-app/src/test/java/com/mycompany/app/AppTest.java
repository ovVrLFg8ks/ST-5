package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AppTest {

    private static final double delta = 0.00007;
	
	@Test
    public void testSqrt0() {
        Sqrt sqrt = new Sqrt(0.0);
        assertEquals(0.0, sqrt.calc(), delta);
    }

    @Test
    public void testSqrt1() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(1.0, sqrt.calc(), delta);
    }
	
	@Test
    public void testSqrt_2() {
        Sqrt sqrt = new Sqrt(2.0);
        assertEquals(1.414213, sqrt.calc(), delta);
    }
	
	@Test
    public void testSqrt_3() {
        Sqrt sqrt = new Sqrt(3.0);
        assertEquals(1.73205, sqrt.calc(), delta);
    }
	
	@Test
    public void testSqrt_4() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(2.0, sqrt.calc(), delta);
    }
	
	@Test
    public void testSqrt_5() {
        Sqrt sqrt = new Sqrt(5.0);
        assertEquals(2.23607, sqrt.calc(), delta);
    }
	
	@Test
    public void testSqrt_1000000() {
        Sqrt sqrt = new Sqrt(1000000.0);
        assertEquals(1000.0, sqrt.calc(), delta);
    }
	
	@Test
    public void testAvg_same() {
        Sqrt sqrt = new Sqrt(0);
        assertEquals(2.0, sqrt.average(2, 2), delta);
    }
	
	@Test
    public void testAvg_symmetric() {
        Sqrt sqrt = new Sqrt(0);
        assertEquals(0.0, sqrt.average(-19, 19), delta);
    }
	
	@Test
    public void testAvg_common() {
        Sqrt sqrt = new Sqrt(0);
        assertEquals(234.5, sqrt.average(234, 235), delta);
    }
	
	@Test
    public void testGood_ok() {
        Sqrt sqrt = new Sqrt(0);
        assertTrue(sqrt.good(2.0, 4.0));
    }
	
	@Test
    public void testGood_bad() {
        Sqrt sqrt = new Sqrt(0);
        assertFalse(sqrt.good(2.0, 3.0));
    }

    @Test
    public void testImprove() {
        Sqrt sqrt = new Sqrt(0);
        assertEquals(2.0, sqrt.improve(2.0, 4.0), delta);
    }
	
    @Test
    public void testIter() {
        Sqrt sqrt = new Sqrt(0);
        assertEquals(2.0, sqrt.iter(2.0, 4.0), delta);
    }
}
