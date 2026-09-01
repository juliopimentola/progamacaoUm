package listaScannerDois;

import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		int divisaoInteira = x / y;
		double divisaoReal = (double) x / y;

		System.out.println("Divisão inteira: " + divisaoInteira);
		System.out.println("Divisão real: " + divisaoReal);

		sc.close();
	}
}