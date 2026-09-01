package listaScannerDois;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double quilometros = sc.nextDouble();
		double metros = quilometros * 1000;

		System.out.println("Distância em metros: " + metros + " m");

		sc.close();
	}
}