package assignment.unittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentGradeTest {

	@Test
	void testGradeA() {
		StudentGrade studentgrade = new StudentGrade();
		int mark = 95;
		char actual = studentgrade.convertMark(mark);
		
		char expected = 'A';
		
		assertEquals(expected, actual, "Grade is not correct");
	}
	
	@Test
	void testGradeB() {
		StudentGrade studentgrade = new StudentGrade();
		int mark = 78;
		char actual = studentgrade.convertMark(mark);
		
		char expected = 'B';
		
		assertEquals(expected, actual, "Grade is not correct");
	}
	
	@Test
	void testGradeC() {
		StudentGrade studentgrade = new StudentGrade();
		int mark = 55;
		char actual = studentgrade.convertMark(mark);
		
		char expected = 'C';
		
		assertEquals(expected, actual, "Grade is not correct");
	}
	
	@Test
	void testGradeD() {
		StudentGrade studentgrade = new StudentGrade();
		int mark = 40;
		char actual = studentgrade.convertMark(mark);
		
		char expected = 'D';
		
		assertEquals(expected, actual, "Grade is not correct");
	}
	
	@Test
	void testGradeE() {
		StudentGrade studentgrade = new StudentGrade();
		int mark = 34;
		char actual = studentgrade.convertMark(mark);
		
		char expected = 'E';
		
		assertEquals(expected, actual, "Grade is not correct");
	}
	
	@Test
	void testGradeF() {
		StudentGrade studentgrade = new StudentGrade();
		int mark = 4;
		char actual = studentgrade.convertMark(mark);
		
		char expected = 'F';
		
		assertEquals(expected, actual, "Grade is not correct");
	}
}
