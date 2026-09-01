package listaIF;

import java.util.Scanner;

public class ex13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota de 0 a 100: ");
        double nota = scanner.nextDouble();

        if (nota >= 90) {
            System.out.println("Excelente");
        } else if (nota >= 70) {
            System.out.println("Bom");
        } else if (nota >= 50) {
            System.out.println("Regular");
        } else {
            System.out.println("Insuficiente");
        }

        scanner.close();
    }
}