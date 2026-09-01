package listaIF;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int n = sc.nextInt();
		
		if (n >= 0) {
			System.out.println("Numero positivo"); 
		}
		sc.close();

	}

}
