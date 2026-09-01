package listaIF;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a sua média:");
		double m = sc.nextDouble();
		
		if (m >= 7) {
			System.out.println("Aluno aprovado!"); 
		}
		sc.close();

	}

}
