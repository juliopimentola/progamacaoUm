package EXwhl;

import java.util.Scanner;

public class w14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = scanner.nextInt();

        int soma = 0;

        for (int numero = 1; numero <= n; numero++) {
            soma += numero;
        }

        System.out.println("Soma: " + soma);

        scanner.close();
    }
}
