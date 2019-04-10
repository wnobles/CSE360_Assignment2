package cse360assign2;

public class Main {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println(calc.getTotal());
		calc.add(3);
		System.out.println(calc.getTotal());
		calc.subtract(2);
		System.out.println(calc.getTotal());
		calc.multiply(4);
		System.out.println(calc.getTotal());
		calc.divide(5);
		System.out.println(calc.getTotal());
		System.out.println(calc.getHistory());
	}

}
