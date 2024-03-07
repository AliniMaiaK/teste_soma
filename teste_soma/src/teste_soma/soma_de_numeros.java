package teste_soma;

public class soma_de_numeros {

	public static void main(String[] args) {
		int INDICE = 13, SOMA = 0, k = 0;
		
		while (k < INDICE) {
			k = k + 1;
			SOMA = SOMA + k;
		}
		
	   System.out.println(SOMA);		
	}

}
