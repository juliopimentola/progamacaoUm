package listaIF;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a sua idade?");
		int i = sc.nextInt();
		
		if (i >= 60) {
			System.out.println("Cliente possui direito ao desconto."); 
		}
		sc.close();
		

	}

}
