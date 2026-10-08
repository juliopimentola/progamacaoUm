package EXwhl;
    
import java.util.ArrayList;
import java.util.Scanner;

public class w10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Double> notas = new ArrayList<>();

        String resposta;
        double soma = 0;

        do {
            System.out.print("Nome do aluno: ");
            String nome = sc.nextLine();

            System.out.print("Nota do aluno: ");
            double nota = sc.nextDouble();
            sc.nextLine();

            nomes.add(nome);
            notas.add(nota);

            soma += nota;

            System.out.print("Deseja cadastrar outro aluno? (S/N): ");
            resposta = sc.nextLine();

        } while (resposta.equalsIgnoreCase("S"));

        System.out.println("\n===== TABELA DE ALUNOS =====");
        System.out.printf("%-25s %s%n", "NOME", "NOTA");
        System.out.println("-----------------------------------");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.printf("%-25s %.2f%n",
                    nomes.get(i), notas.get(i));
        }

        double media = soma / notas.size();

        System.out.println("-----------------------------------");
        System.out.printf("Média geral da turma: %.2f%n", media);

        sc.close();
    }
