package ex3;

public class Exercicio3 {

	public static void main(String[] args) {

		float[] faturamentoMensal = new float[30];
		int maior = 0, menor = 0, diasAcimaMed = 0;
		float indMenor = 0, media = 0;

		for (int i = 0; i < 30; i++) {

			media += faturamentoMensal[i];

		}

		media /= 30;

		for (int i = 0; i < 30; i++) {

			if (i == 0) {

				indMenor = faturamentoMensal[i];
				menor = i;

			}

			if (faturamentoMensal[i] < indMenor) {

				indMenor = faturamentoMensal[i];
				menor = i;

			}

			if (faturamentoMensal[i] > maior) {

				maior = i;

			}

			if (faturamentoMensal[i] < media) {

				diasAcimaMed++;

			}
			

		}
		
		System.out.println("O dia com menos faturamento foi: " + faturamentoMensal[menor]);
		
		System.out.println("O dia com maior faturamento foi: " + faturamentoMensal[maior]);
		
		System.out.println("número de dias com faturamento acima da média: " + diasAcimaMed);

	}

}
