package listaScannerDois;

import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String funcionario = sc.nextLine();
		String cargo = sc.nextLine();
		double salario = sc.nextDouble();

		System.out.println("*************************");
		System.out.println("Funcionário: " + funcionario);
		System.out.println("Cargo: " + cargo);
		System.out.println("Salário: R$ " + salario);
		System.out.println("*************************");

		sc.close();
	}
}