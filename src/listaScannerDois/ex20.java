package listaScannerDois;

import java.util.Scanner;

public class ex20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int idade = sc.nextInt();

		String atendimento = (idade >= 60)
				? "Atendimento preferencial"
				: "Atendimento comum";

		System.out.println("Idade: " + idade + " anos");
		System.out.println("Tipo de atendimento: " + atendimento);

		sc.close();
	}
}