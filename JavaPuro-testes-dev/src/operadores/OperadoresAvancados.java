package operadores;

public class OperadoresAvancados {

	public static void main(String[] args) {
		
		// AND(&&) OR(||) NOT(!)
		int x = 20;
		System.out.println("X maior que 21 ou 25?");
		System.out.println(x >21 || x >= 25);
		System.out.println("-----------");
		int y = 24;
		System.out.println("Y maior que 21 ou igual a 25?");
		System.out.println(y >21 || y <= 25);
		System.out.println("-----------");
		int r =11;
		System.out.println("R esta entre 1 e 10");
		System.out.println((r >=1) && ( r <= 10));
		int t =10;
		System.out.println("R esta entre 1 e 10");
		System.out.println((t >=1) && ( t <= 10));
		System.out.println("-----------");
		int n =10;
		System.out.println("N é  1 ou N é menor igual a 10");
		System.out.println((n ==1) || ( n <= 10));
		int m =30;
		System.out.println("N é menor igual a 1 ou menor igual a 30");
		System.out.println((m <=1) || (m  <=29));
		System.out.println("-----------");
		int a =30;
		System.out.println("Se a for igual, inverte a resposta");
		System.out.println(!(a <=29));
		int b = 29;
		System.out.println("Se a for igual, inverte a resposta");
		System.out.println(!(b <=29));
		

	}
}
