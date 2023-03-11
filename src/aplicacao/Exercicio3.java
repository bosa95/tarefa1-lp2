package aplicacao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * 3 - Escreva um programa para simular uma pequena conversa do computador com o
		 * usuário. O programa deve seguir os passos:
		 * 
		 * a) inicialmente escreve "Olá eu sou o Nº 1, como é seu nome?";
		 * 
		 * b) em seguida espera que o usuário digite seu nome;
		 * 
		 * c) por fim escreve: "Bem-vindo ao clube (nome)".
		 */

		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("Olá eu sou o Nº 1, como é seu nome? ");
			String nome = sc.nextLine();

			System.out.printf("Bem-vindo ao clube, %s.", nome);

		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

}
