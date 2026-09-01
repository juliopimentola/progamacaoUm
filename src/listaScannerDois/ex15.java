package listaScannerDois;

import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String produto = sc.nextLine();
		double preco = sc.nextDouble();
		int estoque = sc.nextInt();

		System.out.println("=========================");
		System.out.println("Produto: " + produto);
		System.out.println("Preço: R$ " + preco);
		System.out.println("Estoque: " + estoque + " unidades");
		System.out.println("=========================");

		sc.close();
	}
}