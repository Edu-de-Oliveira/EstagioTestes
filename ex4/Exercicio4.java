package ex4;

public class Exercicio4 {

	public static void main(String[] args) {

		float[] faturamentoMensal = new float[] { (float) 67836.43, (float) 36678.66, (float) 29229.88,
				(float) 27165.48, (float) 19849.53 };

		float[] porcentagem = new float[5];

		float total = 0;

		for (int i = 0; i < 5; i++) {

			total += faturamentoMensal[i];

		}

		for (int i = 0; i < 5; i++) {

			porcentagem[i] = (faturamentoMensal[i] / total) * 100;

		}


		System.out.println("percentual de participação de SP: " + porcentagem[0] + "%");
		System.out.println("percentual de participação de RJ: " + porcentagem[1] + "%");
		System.out.println("percentual de participação de MG: " + porcentagem[2] + "%");
		System.out.println("percentual de participaçãode ES: " + porcentagem[3] + "%");
		System.out.println("percentual de participação de Outros: " + porcentagem[4] + "%");

	}

}
