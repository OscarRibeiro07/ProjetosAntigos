package ArraySimples;

import java.util.Arrays;

public class ArrayFutebol {
	public static void main(String[] args) {
		// o arrays inicia em zero
		String[] times = { "Flamengo", "Vitoria", "Bota_fogo" };
		System.out.println(times[2]);
		// Alterando posicao do array
		times[2] = times[0];
		// modo diferentes de alterar
		times[2] = "Flamengo";
		System.out.println(times[2]);
		System.out.println("-----------");

		// outra forma de se inicializar
		int[] pontosOrdenados = new int[3];
		pontosOrdenados[0] = 5;
		pontosOrdenados[1] = 3;
		pontosOrdenados[2] = 9;

		System.out.println("Tamanho do array times " + times.length);
		System.out.println("Tamanho do array pontosOrdenados " + pontosOrdenados.length);
		System.out.println("-------");
		System.out.println("Pegando dados do array times\n" + Arrays.toString(times));
		System.out.println("Pegando dados do array pontos ordenados\n" + Arrays.toString(pontosOrdenados));

		System.out.println("---------");
		int posicao = Arrays.binarySearch(times, "Flamengo");
		System.out.println("Posicao do time inserido: " + posicao + "\ntime da posicao inserida: " + times[0]);
		System.out.println("---------");
		// pegangando da primeira posicao ate a ultima
		String[] paises = { "Brasil", "Espanha", "Franca, Guine" };
		Arrays.sort(paises, 0, paises.length);
		System.out.println("Pegando dados do array pontos ordenados\n" + Arrays.toString(paises));
		System.out.println("---------");
		Double valores[] = {132.3, 3234.34};
		//pegando o valor da posicao 0 
		System.out.println(valores[0].doubleValue());

	}
}
