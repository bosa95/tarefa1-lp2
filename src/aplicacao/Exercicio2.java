package aplicacao;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * 2 - Considerando um programa iniciado pelas instruções: a = 1; b = 2; c = 3;
		 * 
		 * Complete-o de modo que, ao final do programa, o conteúdo de A seja 3, de B
		 * seja 1 e de C seja 2. Use apenas atribuições entre variáveis.
		 */
		
		int a = 1, b =2, c = 3, aux = 0;
		
		aux = a;
		a = c;
		c = b;
		b = aux;
		
		System.out.printf("A: %d, B: %d, C: %d.", a, b, c);

	}

}
