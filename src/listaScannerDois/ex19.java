package listaScannerDois;

import java.util.Scanner;

public class ex19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double saldo = sc.nextDouble();

		String situacao = (saldo > 0)
				? "Saldo positivo"
				: "Saldo negativo";

		System.out.println("Saldo: R$ " + saldo);
		System.out.println("Situação: " + situacao);

		sc.close();
	}
}