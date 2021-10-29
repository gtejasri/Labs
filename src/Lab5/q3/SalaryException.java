package Lab5.q3;

import com.cg.eis.exception.EmployeeException;


public class SalaryException {
	void checkSalary(int salary) throws EmployeeException {
		if (salary < 3000) {
			throw new EmployeeException("Salary should be above 3000");
		}
	}

	public static void main(String[] args) {
		SalaryException obj = new SalaryException();
		try {
			obj.checkSalary(2000);
		} catch (EmployeeException ie) {
			System.out.println(ie.getMessage());
		}

	}
}