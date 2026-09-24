package EX1;

import java.util.Scanner;

public class a5freach {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] valores = new double[10];

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            valores[i] = scanner.nextDouble();
        }

        double soma = 0;
        double maior = valores[0];
        double menor = valores[0];

        for (double valor : valores) {

            soma += valor;

            if (valor > maior) {
                maior = valor;
            }

            if (valor < menor) {
                menor = valor;
            }
        }

        double media = soma / valores.length;

        int acimaDaMedia = 0;

        for (double valor : valores) {
            if (valor > media) {
                acimaDaMedia++;
            }
        }

        System.out.println("\nValores:");

        for (double valor : valores) {
            System.out.print(valor + " ");
        }

        System.out.println("\n");

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Quantidade acima da média: " + acimaDaMedia);


        scanner.close();
    }
}
