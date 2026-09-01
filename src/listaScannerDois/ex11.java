package listaScannerDois;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int temperatura = sc.nextInt();

		System.out.println(temperatura > 25);
		System.out.println(temperatura <= 30);
		System.out.println(temperatura == 20);
		System.out.println(temperatura != 30);

		sc.close();
	}
}