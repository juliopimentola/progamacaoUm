package listaExercicios1;

public class Exercicio11 {

	public static void main(String[] args) {
		
		String nomeAluno = "Manuel Campos";
		int nota = 6;
		int frequencia = 75;
		
		String resultado = (nota >= 6 && frequencia >= 75) ? "Aprovado" : "Reprovado";

        System.out.println("Aluno: " + nomeAluno);
        System.out.println("Resultado: " + resultado);

	}

}
