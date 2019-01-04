package Home;

abstract class Calculator2 {
	int left;
	int right;

	public void setO(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public abstract void sum();

	public abstract void avg();

	public void run() {
		sum();
		avg();

	}
}

class CalculatorDecoPlus2 extends Calculator2 {
	public void sum() {
		System.out.println("+ sum() = " + (this.left + this.right));
	}

	public void avg() {
		System.out.println("+ avg() = " + (this.left + this.right) / 2);
	}
}

class CalculatorDecoMinus2 extends Calculator2 {
	public void sum() {
		System.out.println("- sum() = " + (this.left + this.right));
	}

	public void avg() {
		System.out.println("- avg() = " + (this.left + this.right) / 2);
	}
}

public class CalculatorDemo2 {
	public static void main(String[] args) {
		CalculatorDecoPlus2 c1 = new CalculatorDecoPlus2();
		c1.setO(30, 40);
		c1.sum();
		c1.avg();

		CalculatorDecoMinus2 c2 = new CalculatorDecoMinus2();
		c2.setO(50, 130);
		c2.sum();
		c2.avg();

	}
}
