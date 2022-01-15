package entities;

public class EmployeeSection8Exercise2 {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		double netSalary = grossSalary - tax;
		return netSalary;
	}
	
	public void increaseSalary(double percentage) {
		double percentageSalary = percentage/100 * grossSalary;
		grossSalary += percentageSalary;		
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	}
}
