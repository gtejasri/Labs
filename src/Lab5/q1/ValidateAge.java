package Lab5.q1;

class InvalidException extends Exception {
	public InvalidException(String s) {
		super(s);
	}

}

public class ValidateAge {

	void checkAge(int age) throws InvalidException {
		if (age < 15) {
			throw new InvalidException("Age of a person should be above 15");
		}
	}

	public static void main(String[] args) {
		ValidateAge obj = new ValidateAge();
		try {
			obj.checkAge(14);
		} catch (InvalidException ie) {
			// System.out.println("Not Eligible");
			System.out.println(ie.getMessage());
		}

	}
}
