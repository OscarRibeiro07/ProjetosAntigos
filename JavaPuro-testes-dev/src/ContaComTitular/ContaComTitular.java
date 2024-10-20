package ContaComTitular;

import conta.Conta;

public class ContaComTitular {

	public Titular titular;
	private int conta;
	private int agencia;
	private double saldo;
	
	
	
	 public ContaComTitular(int conta, int agencia) {
		this.conta = conta;
		this.agencia = agencia;
	}
	 
	 void sacaValor(double valor) {
		 saldo-=valor;
		 
	 }
	 

	double depositaValor(double valor) {
		 saldo+=valor;
		 System.out.println("Valor depositado " + valor);
		 return valor;
	}
	
	double transfre(Conta destino, double valor) {
		if(this.saldo >=valor) {
			this.sacaValor(valor);
			
			destino.depositaValor(valor);
			System.out.println(this.titular + ", Sua tranferencia de "+valor+ " foi concluida");
		}else{
			System.out.println(this.titular +  ", Não é possivel transferir pois o saldo não é suficiente \nO seu saldo atual é de: "
		+ this.saldo + " e você tentou transferir " +valor);
		}return valor ;
		
	}
	
	
	public Titular getNomeTitular() {
		return titular;
	}
	public int getConta() {
		return conta;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setTitular(Titular titular) {
		this.titular = titular;
	}
	
	public double mostraSaldo() {
		return saldo;
	}
	
	
}
