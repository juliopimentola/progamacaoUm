package listaIF;

import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois numero");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		if (n1 > n2) {
			System.out.println("O primeiro número é maior"); 
		} else {
			System.out.println("O segundo número é maior");
		}
		sc.close();

	}

}
