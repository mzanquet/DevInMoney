package devinmoney.conta;

import java.time.LocalDate;

public class ContaCorrente extends Conta {

	private double chequeEspecial;

	
	
	public ContaCorrente(String nome, String cpf, double rendaMensal, String numeroAgencia, double saldo) {
		super(nome, cpf, rendaMensal, numeroAgencia, saldo);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void deposito(double valor, LocalDate data) {
		// TODO Auto-generated method stub
		super.deposito(valor, data);
	}

	
	public void saque(double valor) {
		double chequeEspecial = rendaMensal;
		double saldoComChequeEspecial = this.getSaldo() + chequeEspecial;
		if (saldoComChequeEspecial > 0) {
			saldo -= valor;
			System.out.println("Valor do saldo atual: " + saldo);
		} else {
			System.out.println("Saque não realizado, saldo negativo.");
		}
	}

	
	public void transferencia(Conta contaDestino, double valor) {
		double chequeEspecial = rendaMensal;
		double saldoComChequeEspecial = this.getSaldo() + chequeEspecial;
		if (saldoComChequeEspecial > valor) {
			saldo -= valor;
			
			contaDestino.saldo = contaDestino.getSaldo() + valor;
			
			System.out.println("Transferência realizada com sucesso. Valor atual do saldo: " + saldo);
		} else {
			System.out.println("Não foi possível realizar a transferência.");
		}
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return super.getNome();
	}

	@Override
	public void setNome(String nome) {
		// TODO Auto-generated method stub
		super.setNome(nome);
	}

	@Override
	public String getCpf() {
		// TODO Auto-generated method stub
		return super.getCpf();
	}

	@Override
	public void setCpf(String cpf) {
		// TODO Auto-generated method stub
		super.setCpf(cpf);
	}

	@Override
	public double getRendaMensal() {
		// TODO Auto-generated method stub
		return super.getRendaMensal();
	}

	@Override
	public void setRendaMensal(double rendaMensal) {
		// TODO Auto-generated method stub
		super.setRendaMensal(rendaMensal);
	}

	@Override
	public int getNumeroConta() {
		// TODO Auto-generated method stub
		return super.getNumeroConta();
	}

	@Override
	public void setNumeroConta(int numeroConta) {
		// TODO Auto-generated method stub
		super.setNumeroConta(numeroConta);
	}

	@Override
	public String getNumeroAgencia() {
		// TODO Auto-generated method stub
		return super.getNumeroAgencia();
	}

	@Override
	public void setNumeroAgencia(String numeroAgencia) {
		// TODO Auto-generated method stub
		super.setNumeroAgencia(numeroAgencia);
	}

	@Override
	public double getSaldo() {
		// TODO Auto-generated method stub
		return super.getSaldo();
	}

	@Override
	public void setSaldo(double saldo) {
		// TODO Auto-generated method stub
		super.setSaldo(saldo);
	}

	@Override
	public String toString() {
		return "ContaCorrente [chequeEspecial=" + chequeEspecial + ", nome=" + nome + ", cpf=" + cpf + ", rendaMensal="
				+ rendaMensal + ", numeroConta=" + numeroConta + ", numeroAgencia=" + numeroAgencia + ", saldo=" + saldo
				+ "]";
	}

	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	@Override
	public void alteraConta(Conta conta, String nomeAnterior, String nomeAtual, double rendaMensalAnterior,
			double rendaMensalAtual, int numeroContaAnterior, int numeroContaAtual, String agenciaAnterior,
			String agenciaAtual, double SaldoAnterior, double saldoAtual) {
		// TODO Auto-generated method stub
		super.alteraConta(conta, nomeAnterior, nomeAtual, rendaMensalAnterior, rendaMensalAtual, numeroContaAnterior,
				numeroContaAtual, agenciaAnterior, agenciaAtual, SaldoAnterior, saldoAtual);
	}

	@Override
	public boolean consultaSaldo(Conta conta) {
		// TODO Auto-generated method stub
		return super.consultaSaldo(conta);
	}
	
	

}
