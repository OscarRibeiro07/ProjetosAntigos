package ContaComTitular;

public class TestaContaComTitular {
	public static void main(String[] args) {
		ContaComTitular c = new ContaComTitular(123, 456);
		Titular t1 = new Titular();
		Titular t2 = new Titular();
		t1.setNome("Oscar");
		t2.setNome("Rafael Medeiros");
		t1.setDataNascimento("2007-12-03");
		// a referencia de nome titular tem que ser inserida no set titular da conta
		c.setTitular(t1);
		// como pode ve, ele transformou o oscar em rafael, pois é a ultima referencia o correto seria
		// criar uma conta c2 e inserir o rafael no set titular
		c.setTitular(t2);
		
		
		System.out.println("Titular teste1:\n"+c.getNomeTitular().nome+" "+ t1.getDataNascimento() +"\nTitular teste2:\n"+ c.getNomeTitular().nome);
		System.out.println("---------------");
		//Jeito correto
		Titular t3 = new Titular();
		ContaComTitular c3 = new ContaComTitular(123, 457);
		Titular t4 = new Titular();
		ContaComTitular c4 = new ContaComTitular(123, 457);
		// lembre de atribuir o titular a conta
		t3.setNome("Maicon");
		c3.setTitular(t3);
		t4.setNome("Joao");
		c4.setTitular(t4);
		System.out.println("Titular teste3:\n"+  c3.getNomeTitular().nome+"\n"+"Titular teste4:\n"+  c4.getNomeTitular().nome);
		
		
	}
}
