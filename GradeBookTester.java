import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	private GradeBook gbk1;
	private GradeBook gbk2;
	@BeforeEach
	void setUp() throws Exception {
	
		gbk1 = new GradeBook(5);
		gbk1.addScore(87.4);
		gbk1.addScore(90.7);
		gbk1.addScore(91.58);
		gbk1.addScore(78.5);
		
	    gbk2 = new GradeBook(5);
	    gbk2.addScore(79.9);
	    gbk2.addScore(100);
	    gbk2.addScore(90.6);
	    gbk2.addScore(67.11);
	    gbk2.addScore(83.67);
	}

	@AfterEach
	void tearDown() throws Exception {
		gbk1 = null;
		gbk2 = null;
	}

	@Test
	void testAddScore() {

		
		//check toString
		assertTrue(gbk1.toString().equals("87.4 90.7 91.58 78.5 "));
		assertTrue(gbk2.toString().equals("79.9 100.0 90.6 67.11 83.67 "));
		System.out.println(gbk2.toString());
		//check size
		assertEquals(gbk1.getScoreSize(),4);
		assertEquals(gbk2.getScoreSize(),5);


			}

	@Test
	void testSum() {
		assertEquals(gbk1.sum(),348.18,0.00001);
		assertEquals(gbk2.sum(),421.28,0.00001);
	}

	@Test
	void testMinimum() {
		assertTrue(gbk1.minimum()==78.5);
		assertEquals(gbk2.minimum(), 67.11);
	}

	@Test
	void testFinalScore() {
		assertEquals(gbk1.finalScore(), 269.68);
		assertEquals(gbk2.finalScore(),354.17);

	}

    //I don't see the document say to have testToString and testgetScosize methods?

}
