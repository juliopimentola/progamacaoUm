package listaSwitch;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cardápio:");
        System.out.println("1 - Cachorro-quente");
        System.out.println("2 - Hambúrguer");
        System.out.println("3 - Pizza");
        System.out.println("4 - Refrigerante");
        System.out.println("5 - Suco");
        System.out.print("Digite o código do produto: ");
        int n = sc.nextInt();
        
        switch (n) {
        
        case 1:
            System.out.println("Cachorro-quente");
        break;
        
        case 2:
            System.out.println("Hambúrguer");
        break;
        
        case 3:
            System.out.println("Pizza");
        break;
        
        case 4:
            System.out.println("Refrigerante");
        break;
        
        case 5:
            System.out.println("Suco");
        break;
        
        default:
            System.out.println("Produto inválido.");
    }
		
		sc.close();

	}

}
