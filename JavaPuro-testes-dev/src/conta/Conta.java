package conta;

public class Conta {

	private String nomeTitular;
	private int conta;
	private int agencia;
	private double saldo;
	
	
	
	 public Conta(int conta, int agencia) {
		this.conta = conta;
		this.agencia = agencia;
	}
	 
	 void sacaValor(double valor) {
		 saldo-=valor;
		 
	 }
	 

	public double depositaValor(double valor) {
		 saldo+=valor;
		 System.out.println("Valor depositado " + valor);
		 return valor;
	}
	
	public double transfre(Conta destino, double valor) {
		if(this.saldo >=valor) {
			this.sacaValor(valor);
			
			destino.depositaValor(valor);
			System.out.println(this.nomeTitular + ", Sua tranferencia de "+valor+ " foi concluida");
		}else{
			System.out.println(this.nomeTitular +  ", Não é possivel transferir pois o saldo não é suficiente \nO seu saldo atual é de: "
		+ this.saldo + " e você tentou transferir " +valor);
		}return valor ;
		
	}
	
	
	
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public int getConta() {
		return conta;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	
	public double mostraSaldo() {
		return saldo;
	}
	
	
}
