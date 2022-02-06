package devinmoney.transacoes;

import java.time.LocalDate;

public class Transacao {
	
	private static int contadorTransacoes = 1;
	
	double valor;
	LocalDate data;
	private int numeroConta;
	
	public Transacao(int numeroConta, int numeroContaDestino,  double valor, LocalDate data) {
		super();
		this.setNumeroConta(numeroConta);
		this.setNumeroConta(numeroContaDestino);
		this.valor = valor;
		this.data = data;
		
	}
	
	public double processe(double saldo) {
		return saldo;
		
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Transacao [valor=" + valor + ", data=" + data + "]";
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	
	
}
