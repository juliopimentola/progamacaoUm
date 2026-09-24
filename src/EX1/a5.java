package EX1;


import java.util.Scanner;

public class a5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] valores = new double[10];

        double soma = 0;
        double maior;
        double menor;

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            valores[i] = scanner.nextDouble();
        }

        maior = valores[0];
        menor = valores[0];
        for (int i = 0; i < valores.length; i++) {

            soma += valores[i];

            if (valores[i] > maior) {
                maior = valores[i];
            }

            if (valores[i] < menor) {
                menor = valores[i];
            }
        }

        double media = soma / valores.length;

        int acimaDaMedia = 0;

        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > media) {
                acimaDaMedia++;
            }
        }
        System.out.println("\nValores:");

        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + " ");
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

