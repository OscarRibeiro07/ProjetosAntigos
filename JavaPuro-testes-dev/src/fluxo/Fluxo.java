package fluxo;

public class Fluxo {
	public static void main(String[] args) {
		// fluxo de execucao
		// debug
		
		System.out.println("Inicia main");
		metodo1();
		System.out.println("Finaliza main");
	}

	private static void metodo1() {
		System.out.println("Inicia metodo2");
		metodo3();
		System.out.println("Finaliza metodo2");
	}

	private static void metodo3() {
		System.out.println("Inicia metodo3");
		for (int i = 1; i <=5; i++) {
			System.out.println(i);
		}
		System.out.println("Finaliza metodo3");
		
	}
}
