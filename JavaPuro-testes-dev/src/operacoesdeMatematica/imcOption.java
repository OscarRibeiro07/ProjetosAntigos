package operacoesdeMatematica;

import javax.swing.JOptionPane;

public class imcOption {
	public static void main(String[] args) {
		String peso = JOptionPane.showInputDialog("Qual seu peso em quilo gramas");

		double pesoEmQuiloGramas = Double.parseDouble(peso);
		String altura = JOptionPane.showInputDialog("Qual sua altura em metros");
		double alturaEmMetros =  Double.parseDouble(altura);
		
		double imc = pesoEmQuiloGramas / (alturaEmMetros * alturaEmMetros);
		String msg = (imc >=20 && imc <= 25) ? "Peso ideal":"Fora do peso ideal";
		msg = "Seu imc é: " + imc +" "+ msg;
		JOptionPane.showMessageDialog(null, msg);
		

		
	}
}
