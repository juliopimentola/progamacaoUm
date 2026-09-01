package listaIF;

import java.util.Scanner;

public class ex17 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Usuário: ");
        String usuario = scanner.nextLine();

        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        if (!usuario.equals("admin")) {
            System.out.println("Usuário inexistente.");
        } else {
            if (senha.equals("1234")) {
                System.out.println("Acesso permitido.");
            } else {
                System.out.println("Senha incorreta.");
            }
        }

        scanner.close();
    }
}