package listaScannerDois;

import java.util.Scanner;

public class ex22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String produto = sc.nextLine();
		double valorUnitario = sc.nextDouble();
		int quantidade = sc.nextInt();
		int parcelas = sc.nextInt();

		double valorTotal = valorUnitario * quantidade;
		double valorParcela = valorTotal / parcelas;

		System.out.println("Produto: " + produto);
		System.out.println("Valor unitário: R$ " + valorUnitario);
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Valor total: R$ " + valorTotal);
		System.out.println("Quantidade de parcelas: " + parcelas);
		System.out.println("Valor de cada parcela: R$ " + valorParcela);

		sc.close();
	}
}