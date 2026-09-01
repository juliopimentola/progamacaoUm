package listaScannerDois;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double distancia = sc.nextDouble();
		double litros = sc.nextDouble();

		double consumoMedio = distancia / litros;
		double litrosPara100Km = 100 / consumoMedio;

		System.out.println("Consumo médio: " + consumoMedio + " km/L");
		System.out.println("Litros para 100 km: " + litrosPara100Km + " L");

		sc.close();
	}
}