package aplicacao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * 4 - Escreva um programa que pergunte o nome e a idade de um indivíduo e
		 * imprima (aproximadamente) quantos dias de vida ele possui.
		 */

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Qual é o seu nome? ");
			String nome = sc.nextLine();

			System.out.print("Qual é a sua idade? ");
			int idade = sc.nextInt();

			System.out.printf("%s tem %d dias de vida.", nome, (idade * 365));
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

}
