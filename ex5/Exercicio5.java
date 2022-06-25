package ex5;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner le = new Scanner(System.in);

		System.out.println("Digite a palavra que quer que seja invertida:");
		String palavra = le.next();

		String inverso = "";

		for (int i = palavra.length() - 1; i >= 0; i--) {

			inverso += palavra.charAt(i);

		}

		System.out.println(inverso);

	}

}
