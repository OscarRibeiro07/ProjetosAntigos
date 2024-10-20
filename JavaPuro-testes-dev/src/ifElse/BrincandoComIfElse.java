package ifElse;

import java.util.Scanner;

public class BrincandoComIfElse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira sua idade");
		int idade =sc.nextInt();
		if(idade  <=13) {
			System.out.println("É uma criça");
		} else if (idade <=18) {
			System.out.println("É um adolecente");
		} else{
			System.out.println("É um adulto");
			
		}
	}
}
