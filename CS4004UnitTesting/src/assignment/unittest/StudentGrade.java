package assignment.unittest;

public class StudentGrade {
	public char convertMark(int mark) {
		if (mark >= 85) {
			return 'A';
		} else if (mark < 85 && mark >= 70) {
			return 'B';
		} else if (mark < 70 && mark >= 55) {
			return 'C';
		} else if (mark < 55 && mark >= 40) {
			return 'D';
		} else if (mark < 40 && mark >= 25) {
			return 'E';
		} else if (mark < 25) {
			return 'F';
		}
		return ' ';
	}
}
