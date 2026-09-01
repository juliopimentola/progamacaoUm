package listaIF;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura");
		int t = sc.nextInt();
		
		if (t >= 30) {
			System.out.println("Está calor"); 
		} else {
			System.out.println("A temperatura está agradável");
		}
		sc.close();

	}

}
