package listaExercicios1;

public class Exercicio14 {

	public static void main(String[] args) {
		String nome = "Carlos Silva";
		double salario = 3000.00;
		int tempoEmpresa = 6;

		double bonus = tempoEmpresa >= 5 ? 500.00 : 0.00;
		double salarioFinal = salario + bonus;

		System.out.println("Nome:" + nome);
		System.out.println("Salário: " + salario);
		System.out.println("Bônus: " + bonus);
		System.out.println("Salário Final: " + salarioFinal);
	}

}
