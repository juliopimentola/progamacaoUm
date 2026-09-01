package listaIF;

import java.util.Scanner;

public class ex16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a média final: ");
        double media = scanner.nextDouble();

        if (media >= 7.0) {
            System.out.println("Aluno aprovado!");

            if (media >= 9.5) {
                System.out.println("Aluno aprovado com distinção!");
            }
        }

        scanner.close();
    }
}