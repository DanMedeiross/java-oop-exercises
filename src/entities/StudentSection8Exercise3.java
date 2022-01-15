package entities;

public class StudentSection8Exercise3 {
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public double finalGrade() {
		double finalGrade = grade1 + grade2 + grade3;
		return finalGrade;
	}
	
	public double missingPoints() {
		if (finalGrade() < 60.0) {
			double missingPoints = 60.0 - finalGrade();
			return missingPoints;
		} else {
			return 0.0;
		}
	}
}