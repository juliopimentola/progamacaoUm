package listaScannerDois;

import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean possuiCNH = sc.nextBoolean();
		boolean possuiCarro = sc.nextBoolean();
		boolean possuiDinheiro = sc.nextBoolean();

		System.out.println(possuiCNH && possuiCarro); 
		System.out.println(possuiCarro || possuiDinheiro); 
		System.out.println(!possuiCNH); 
		System.out.println(possuiCNH && possuiDinheiro);
		System.out.println(!(possuiCarro || possuiDinheiro));
		sc.close();
	}
}