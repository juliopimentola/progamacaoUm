package listaScannerDois;

import java.util.Scanner;

public class ex18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double media = sc.nextDouble();

		String resultado = (media >= 7)
				? "Aprovado"
				: "Reprovado";

		System.out.println(resultado);

		sc.close();
	}
}