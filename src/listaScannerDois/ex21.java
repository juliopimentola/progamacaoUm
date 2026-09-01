package listaScannerDois;

import java.util.Scanner;

public class ex21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nome = sc.nextLine();
		double salarioBase = sc.nextDouble();
		double valorHoraExtra = sc.nextDouble();
		int horasExtras = sc.nextInt();

		double valorHorasExtras = horasExtras * valorHoraExtra;
		double salarioFinal = salarioBase + valorHorasExtras;

		System.out.println("Nome: " + nome);
		System.out.println("Salário base: R$ " + salarioBase);
		System.out.println("Valor das horas extras: R$ " + valorHorasExtras);
		System.out.println("Salário final: R$ " + salarioFinal);

		sc.close();
	}
}