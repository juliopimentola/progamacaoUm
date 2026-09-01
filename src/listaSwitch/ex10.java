package listaSwitch;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o código do curso:");
		System.out.println("1 - Informática");
		System.out.println("2 - Administração");
		System.out.println("3 - Engenharia");
		int curso = sc.nextInt();

		System.out.println("Digite o código da disciplina:");
		int disciplina = sc.nextInt();

		switch (curso) {

		case 1:
			switch (disciplina) {
			case 1:
				System.out.println("Programação");
				break;
			case 2:
				System.out.println("Banco de Dados");
				break;
			case 3:
				System.out.println("Redes");
				break;
			default:
				System.out.println("Disciplina inválida");
			}
			break;

		case 2:
			switch (disciplina) {
			case 1:
				System.out.println("Marketing");
				break;
			case 2:
				System.out.println("Economia");
				break;
			case 3:
				System.out.println("Contabilidade");
				break;
			default:
				System.out.println("Disciplina inválida");
			}
			break;

		case 3:
			switch (disciplina) {
			case 1:
				System.out.println("Cálculo");
				break;
			case 2:
				System.out.println("Física");
				break;
			case 3:
				System.out.println("Desenho Técnico");
				break;
			default:
				System.out.println("Disciplina inválida");
			}
			break;

		default:
			System.out.println("Curso inválido");
		}

		sc.close();
	}
}