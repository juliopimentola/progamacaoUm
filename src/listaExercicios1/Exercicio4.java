package listaExercicios1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nome = "Mateus";
		double nota1 = 7.5, nota2 = 8;
		
		System.out.println("Aluno" + nome);
		System.out.println("Nota 1: " + nota1);
		System.out.println("Notas 2: " + nota2);
		System.out.println("Média: " +  ((nota1+nota2)/2));
		
		
		sc.close();
	}

}
