package listaScannerDois;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double temperatura = sc.nextDouble();

		int temperaturaInteira = (int) temperatura;
		double temperaturaDouble = (double) temperaturaInteira;

		System.out.println("Temperatura original: " + temperatura);
		System.out.println("Temperatura inteira: " + temperaturaInteira);
		System.out.println("Temperatura convertida para double: " + temperaturaDouble);

		sc.close();
	}
}
