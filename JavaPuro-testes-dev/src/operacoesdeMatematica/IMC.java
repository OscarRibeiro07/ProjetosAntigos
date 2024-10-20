package operacoesdeMatematica;

/**
 * Calcula peso de massa corporal
 */
public class IMC {

	public static void main(String[] args) {

		double pesoEmQuiloGramas = 80;
		double alturaEmMetros = 1.76;
		double imc = pesoEmQuiloGramas / (alturaEmMetros * alturaEmMetros);

		System.out.println("Seu imc é: " + imc);

		if (imc <= 19) {
			System.out.println("Esta a baixo do peso ideal");
		} else if (imc <= 25) {
			System.out.println("Esta no peso ideal");
		} else if (imc >= 30) {
			System.out.println("Esta a cima do peso");
		} else  {
			System.out.println("Esta muito a cima do peso");
		}
	}
}
