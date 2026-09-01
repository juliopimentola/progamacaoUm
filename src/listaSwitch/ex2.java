package listaSwitch;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
	 Scanner sc = new Scanner (System.in);
	 
	 System.out.println("Dígite o primeiro número");
	 int n1 = sc.nextInt();
	 
	 System.out.println("Dígite o segundo número");
	 int n2 = sc.nextInt();
	 
     System.out.println("Escolha a operação:");
     System.out.println("1 - Soma");
     System.out.println("2 - Subtração");
     System.out.println("3 - Multiplicação");
     System.out.println("4 - Divisão");
     System.out.print("Opção: ");
     int operacao = sc.nextInt();
     
     switch (operacao) {
     
     case (1):
    	 System.out.println("O resultado da soma é: "+(n1 + n2) );
     break;
     
     case (2):
    	 System.out.println("O resultado da subtração é: "+(n1 - n2) );
     break;
     
     case (3):
    	 System.out.println("O resultado da multiplicação é: "+(n1 * n2) );
     break;
     
     case (4):
    	 if (n2 == 0) {
    		 System.out.println("Impossivel realizar multiplicações por 0");
    		 break;
    	 }
    	 System.out.println("O resultado da divisão é: "+(n1 / n2) );
     break;
     
     default:
    	 System.out.println("Operação inválida");
     }
	 
	 sc.close();

	}

}
