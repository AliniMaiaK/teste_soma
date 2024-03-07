# Teste técnico SOMA

🔑Objetivo do teste é criar um trecho de código em Java que inicializa em três variáveis: INDICE com o valor 13, SOMA com o valor 0 e K com o valor 0.
  Em seguida, há um loop enquanto, onde a condição é que a variável K seja menor que o valor de INDICE. Dentro do loop, 
  a variável K é incrementada em 1 a cada iteração (K = K + 1) e o valor de K é somado à variável SOMA (SOMA = SOMA + K).

  O loop continuará executando enquanto K for menor que INDICE. Quando K atingir o valor de INDICE, o loop será interrompido.
  Após o loop, o valor da variável SOMA é impresso na tela.

  No caso específico deste código, o loop está somando todos os números de 1 até 13 e armazenando o resultado na variável SOMA. 
  Ao final do processamento, o valor de SOMA será 91, que é a soma de todos os números de 1 até 13.🔑:
  

## 🚩Código do Teste, feito em linguagem Java:

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

Resultado: 91.

✅Linguagem que foi usada.

- JAVA

✅

👊🏻🤘🏻 Desafios que tive:
Em qual linguagem resolveria esse teste.

Autor: Alini krugeer



