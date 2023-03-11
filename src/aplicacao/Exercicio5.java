package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*
		 * 5 - Escreva um programa que pergunte qual o raio de um círculo e imprima a
		 * sua área.
		 */

		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Informe o raio do círculo: ");
			double raio = sc.nextDouble();

			System.out.println();

			System.out.printf("A área desse círculo é: %.3f", (Math.PI * Math.pow(raio, 2)));

		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

}
