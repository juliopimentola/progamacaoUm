package listaScannerDois;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nome = sc.nextLine();
		int idade = sc.nextInt();
		sc.nextLine();
		String curso = sc.nextLine();
		double altura = sc.nextDouble();
		double mediaFinal = sc.nextDouble();
		boolean matriculado = sc.nextBoolean();

		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Curso: " + curso);
		System.out.println("Altura: " + altura);
		System.out.println("Média Final: " + mediaFinal);
		System.out.println("Matriculado: " + matriculado);

		sc.close();
	}
}