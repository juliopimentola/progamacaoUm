package listaExercicios1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nomeProduto = sc.nextLine();
		int codigo = sc.nextInt();
		double preco = sc.nextDouble();
		int quantEstoque = sc.nextInt();
		
		System.out.println(nomeProduto);
		System.out.println(codigo);
		System.out.println(preco);
		System.out.println(quantEstoque);
		
		sc.close();
	}

}
