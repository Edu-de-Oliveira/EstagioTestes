package ex2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner le = new Scanner(System.in);

		int a = 1, b = 0, aux = 0;

		System.out.println("Digite o n�mero que quer verificar se pertence a sequ�ncia de Fibonacci:");
		int numEscolhido = le.nextInt();

		while (a != numEscolhido) {

			aux = a;

			a = a + b;

			b = aux;

			if (a == numEscolhido || numEscolhido == 0) {

				System.out.println("O n�mero pertence na sequ�ncia de Fibonacci");

				break;

			}

			if (a > numEscolhido && numEscolhido != 0) {

				System.out.println("O n�mero n�o pertence na sequ�ncia de Fibonacci");

				break;

			}

		}

	}

}
