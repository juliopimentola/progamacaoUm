package listaExercicios1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int idade = sc.nextInt();
		double altura = sc.nextDouble();
		double peso = sc.nextDouble();
		sc.nextLine();

		String nome = sc.nextLine();

		boolean matricula = sc.nextBoolean();
		char sexo = sc.next().charAt(0);

		System.out.println(idade);
		System.out.println(altura);
		System.out.println(peso);
		System.out.println(nome);
		System.out.println(matricula);
		System.out.println(sexo);

		sc.close();
	}

}
