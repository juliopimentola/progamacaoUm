package EX1;

import java.util.Scanner;

public class a3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] alunos = new String[8];

        for (int i = 0; i < alunos.length; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            alunos[i] = scanner.nextLine();
        }

        System.out.print("\nDigite o nome do aluno que deseja pesquisar: ");
        String nomePesquisa = scanner.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < alunos.length; i++) {

            if (alunos[i].equalsIgnoreCase(nomePesquisa)) {
                System.out.println("Aluno encontrado na posição: " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Aluno não encontrado.");
        }

        scanner.close();
    }
}

