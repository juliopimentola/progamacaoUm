package listaScannerDois;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double nota = sc.nextDouble();

		int notaInteira = (int) nota;
		double notaDouble = (double) notaInteira;

		System.out.println("Nota original: " + nota);
		System.out.println("Nota inteira: " + notaInteira);
		System.out.println("Nota convertida para double: " + notaDouble);

		sc.close();
	}
}