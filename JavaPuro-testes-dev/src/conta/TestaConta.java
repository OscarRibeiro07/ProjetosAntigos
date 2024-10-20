package conta;

public class TestaConta {
	public static void main(String[] args) {
		Conta c = new Conta(123, 456);
		Conta c2 = new Conta(123, 3456);
		c.setNomeTitular("Willson Martinez");
		c.depositaValor(100);
		System.out.println("CONTA \n"+"Titular: " + c.getNomeTitular() +"\n"+ "Saldo: "+c.mostraSaldo());
		c.transfre(c2, 1254);
		c.transfre(c2, 40);
		
 		System.out.println("------------");
		c2.setNomeTitular("Joao Ferreira");
		System.out.println("CONTA \n"+"Titular: " + c2.getNomeTitular() +"\n"+ "Saldo: "+c2.mostraSaldo());
		
		
		

	}
}
