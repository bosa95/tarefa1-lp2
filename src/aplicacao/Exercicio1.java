package aplicacao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		/*
		 * 1 - Escreva um programa que leia três números e os imprima na ordem inversa
		 * da que foram digitados.
		 */

		try (Scanner sc = new Scanner(System.in)) {

			int[] vetor = new int[3];

			for (int i = 0; i < vetor.length; i++) {
				System.out.print("Informe o " + (i + 1) + "º número: ");
				vetor[i] = sc.nextInt();
			}

			System.out.println();

			for (int num : vetor) {
				System.out.print("|" + num);
			}

			System.out.println("|");

			for (int i = vetor.length - 1; i >= 0; i--) {
				System.out.print("|" + vetor[i]);
			}

			System.out.println("|");

		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

}
