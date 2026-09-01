package listaScannerDois;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int totalAlunos = sc.nextInt();
		int grupos = sc.nextInt();

		int divisaoInteira = totalAlunos / grupos;
		double divisaoReal = (double) totalAlunos / grupos;

		System.out.println("Divisão inteira: " + divisaoInteira);
		System.out.println("Divisão real: " + divisaoReal);

		sc.close();
	}
}