package EXwhl;

import java.util.Scanner;

public class w8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int contador = 1;
        int soma = 0;
        int numero;

        do {
            System.out.print("Digite o " + contador + "º número: ");
            numero = scanner.nextInt();

            soma += numero;
            contador++;

        } while (contador <= 5);

        System.out.println("Soma = " + soma);

        scanner.close();
    }
}
