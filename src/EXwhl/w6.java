package EXwhl;

import java.util.Scanner;

public class w6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de início: ");
        int inicio = scanner.nextInt();

        System.out.print("Digite o número de finalização: ");
        int fim = scanner.nextInt();

        int contador = inicio;

        do {
            System.out.println(contador);
            contador++;
        } while (contador <= fim);

        scanner.close();
    }
}
