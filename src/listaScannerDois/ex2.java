package listaScannerDois;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String marca = sc.nextLine();
		String modelo = sc.nextLine();
		int ano = sc.nextInt();
		sc.nextLine();
		String cor = sc.nextLine();
		double valor = sc.nextDouble();
		boolean automatico = sc.nextBoolean();

		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano: " + ano);
		System.out.println("Cor: " + cor);
		System.out.println("Valor: R$ " + valor);
		System.out.println("Automático: " + automatico);

		sc.close();
	}
}