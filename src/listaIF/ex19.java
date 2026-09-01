package listaIF;

import java.util.Scanner;

public class ex19 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Digite o sexo (homem ou mulher): ");
        String sexo = scanner.nextLine();

        if (idade < 0) {
            System.out.println("Ninguém pode ter idade menor que zero!");
        } else if (idade <= 12) {
            System.out.println("É uma criança.");
        } else if (idade <= 17) {
            System.out.println("É um adolescente.");
        } else {
            if (sexo.equals("homem")) {
                if (idade <= 64) {
                    System.out.println("É um homem adulto.");
                } else {
                    System.out.println("É um homem idoso.");
                }
            } else if (sexo.equals("mulher")) {
                if (idade <= 62) {
                    System.out.println("É uma mulher adulta.");
                } else {
                    System.out.println("É uma mulher idosa.");
                }
            } else {
                System.out.println("Sexo inválido.");
            }
        }

        scanner.close();
    }
}