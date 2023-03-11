package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		/*
		 * 6 - Faça um programa que calcule a quantidade necessária de latas de tinta
		 * para pintar uma parede. O programa pergunta a medidas de largura e altura da
		 * parede em metros e imprime o resultado (em latas de tinta). Considere que o
		 * consumo de tinta é de 300 ml por metro quadrado e a quantidade de tinta por
		 * lata é de 2 litros.
		 */
		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Informe a largura da parede em metros: ");
			double largura = sc.nextDouble();
			System.out.println();
			System.out.print("Informe a altura da parede em metros: ");
			double altura = sc.nextDouble();
			System.out.println();
			double area = largura * altura;

			System.out.println("A área da parede é de " + area + " metros quadrados.");

			System.out.printf("A quantidade de latas de tinta necessária para pintar a parede é de %.2f.", area * 0.3);
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

}
