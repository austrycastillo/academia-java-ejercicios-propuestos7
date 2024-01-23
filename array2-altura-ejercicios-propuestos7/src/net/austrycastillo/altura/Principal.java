package net.austrycastillo.altura;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Programa Java para leer la altura de N personas y calcular la altura media.
		 * Calcular cuántas personas tienen una altura superior a la media y cuántas
		 * tienen una altura inferior a la media. El valor de N se pide por teclado y
		 * debe ser entero positivo
		 */
		Scanner sc = new Scanner(System.in);
		int i, N;// declaramos las variables a usar
		int contMas = 0, contMenos = 0;
		double media = 0;
		// Leer el número de personas
		System.out.print("Número de personas: ");
		N = sc.nextInt();
		// Se crea el array de tamaño N
		double[] alto = new double[N];

		// Leer alturas
		System.out.println("Lectura de la altura de las personas: ");
		for (i = 0; i < N; i++) {
			System.out.print("persona " + (i + 1) + " = ");
			alto[i] = sc.nextDouble();
			media = media + alto[i];
		}

		// Calcular la media
		media = media / N;

		// recorremos el array para ver cuantos hay más altos
		// que la media y cuantos más bajos
		for (i = 0; i < alto.length; i++) {
			if (alto[i] > media) {
				contMas++;
			} else if (alto[i] < media) {
				contMenos++;
			}
		}

		// Mostrar resultados
		System.out.println("Estatura media: " + media);
		System.out.println("Personas con estatura superior a la media: " + contMas);
		System.out.println("Personas con estatura inferior a la media: " + contMenos);
	}

}
