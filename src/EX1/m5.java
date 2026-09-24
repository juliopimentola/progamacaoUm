package EX1;

import java.util.Scanner;

public class m5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[][] notas = new double[5][4];

        
        for (int i = 0; i < notas.length; i++) {

            System.out.println("\nAluno " + (i + 1));

            for (int j = 0; j < notas[i].length; j++) {

                System.out.print("Digite a nota da avaliação "
                        + (j + 1) + ": ");

                notas[i][j] = scanner.nextDouble();
            }
        }

        double maiorMedia = -1;
        double menorMedia = 11;

        int alunoMaiorMedia = 0;
        int alunoMenorMedia = 0;

        double somaGeral = 0;

        int alunosAprovados = 0;

       
        System.out.println("\nNotas e médias:");

        for (int i = 0; i < notas.length; i++) {

            double somaAluno = 0;

            
            System.out.print("Aluno " + (i + 1) + ": ");

            for (int j = 0; j < notas[i].length; j++) {

                System.out.print(notas[i][j] + " ");

                somaAluno += notas[i][j];
                somaGeral += notas[i][j];
            }

            double mediaAluno = somaAluno / notas[i].length;

            System.out.println("- Média: " + mediaAluno);

           
            if (mediaAluno > maiorMedia) {
                maiorMedia = mediaAluno;
                alunoMaiorMedia = i + 1;
            }

            if (mediaAluno < menorMedia) {
                menorMedia = mediaAluno;
                alunoMenorMedia = i + 1;
            }
            if (mediaAluno >= 7.0) {
                alunosAprovados++;
            }
        }

        double mediaTurma =
                somaGeral / (notas.length * notas[0].length);

        System.out.println("\nMaior média: Aluno "
                + alunoMaiorMedia + " - " + maiorMedia);

        System.out.println("Menor média: Aluno "
                + alunoMenorMedia + " - " + menorMedia);

        System.out.println("Média da turma: " + mediaTurma);

        System.out.println("Alunos aprovados: "
                + alunosAprovados);

        scanner.close();
    }
}

