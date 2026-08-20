package listaExercicios2;

public class ex17 {

	public static void main(String[] args) {
		
		int estoque = 3;

        String situacao = (estoque < 5)
                ? "Estoque baixo"
                : "Estoque suficiente";

        System.out.println(situacao);

	}

}
