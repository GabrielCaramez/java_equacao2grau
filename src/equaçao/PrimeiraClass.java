package equaçao;

public class PrimeiraClass {
	public static void solvePrimeiraClass(double a, double b, double c) {
		double delta = b * b - 4 * a * c;
		if (delta > 0) {
			double root1 = (-b + Math.sqrt(delta)) / (2 * a);
			double root2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("As raizes são: " + root1 + " e " + root2);
		} else if (delta == 0) {
			double root = -b / (2 * a);
			System.out.println("A raiz é: " + root);
		} else {
			System.out.println("A equação não tem raizes reais. ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 1;
		double b = -3;
		double c = 2;
		solvePrimeiraClass(a, b, c);

	}

}
