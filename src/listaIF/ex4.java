package listaIF;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int n = sc.nextInt();
		
		if (n % 5 == 0) {
			System.out.println("O número é múltiplo de 5."); 
		}
		sc.close();

	}

}
