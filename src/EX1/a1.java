package EX1;

import java.util.Scanner;

public class a1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[5];
        double soma = 0;

     
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        System.out.println("\nNotas informadas:");

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Aluno " + (i + 1) + ": " + notas[i]);
            soma += notas[i];
        }

        double media = soma / notas.length;

        System.out.println("\nMédia da turma: " + media);

        scanner.close();
    }
}
