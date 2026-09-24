package EXwhl;

import java.util.Scanner;

public class w5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        int soma = 0;

        while (numero >= 0) {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                soma += numero;
            }
        }

        System.out.println("Soma = " + soma);

        scanner.close();
    }
}
