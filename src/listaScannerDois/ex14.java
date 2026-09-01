package listaScannerDois;

import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean chovendo = sc.nextBoolean();
		boolean guardaChuva = sc.nextBoolean();
		boolean carroDisponivel = sc.nextBoolean();

		System.out.println(chovendo && guardaChuva);
		System.out.println(guardaChuva || carroDisponivel);
		System.out.println(!chovendo);
		System.out.println(chovendo && (guardaChuva || carroDisponivel));
		System.out.println(!(chovendo && guardaChuva));

		sc.close();
	}
}