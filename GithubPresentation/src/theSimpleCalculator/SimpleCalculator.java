package theSimpleCalculator;

public class SimpleCalculator implements CalculatorInterface {
	// create calculator
	public SimpleCalculator() {
	}

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

	@Override
	public int subtract(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}

	@Override
	public int divide(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 / num2;
	}

	@Override
	public int multiply(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}
}