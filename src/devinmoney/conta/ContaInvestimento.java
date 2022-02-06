package devinmoney.conta;

import java.time.LocalDate;
import java.util.Calendar;

public class ContaInvestimento extends Conta {
	
	private int anoRendimento;
	TipoInvestimento investimento;	

	
	public ContaInvestimento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContaInvestimento(String nome, String cpf, double rendaMensal, String numeroAgencia, double saldo) {
		super(nome, cpf, rendaMensal, numeroAgencia, saldo);
	}

	
	public boolean calculaNovoSaldo (double taxaRendimento) {
		Calendar hoje = Calendar.getInstance();
		
		if (anoRendimento == hoje.get(Calendar.DAY_OF_YEAR)) {
			this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
			return true;
		}
		return false;
	}



	@Override
	public void deposito(double valor, LocalDate data) {
		// TODO Auto-generated method stub
		super.deposito(valor, data);
	}


	@Override
	public void saque(double valor, LocalDate data) {
		// TODO Auto-generated method stub
		super.saque(valor, data);
	}


	@Override
	public void transferencia(Conta contaDestino, Double valor, LocalDate data) {
		// TODO Auto-generated method stub
		super.transferencia(contaDestino, valor, data);
	}


	@Override
	public String toString() {
		return "ContaInvestimento [anoRendimento=" + anoRendimento + ", investimento=" + investimento + ", nome=" + nome
				+ ", cpf=" + cpf + ", rendaMensal=" + rendaMensal + ", numeroConta=" + numeroConta + ", numeroAgencia="
				+ numeroAgencia + ", saldo=" + saldo + "]";
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
	public void setNumeroAgencia(String agenciaAtual) {
		// TODO Auto-generated method stub
		super.setNumeroAgencia(agenciaAtual);
	}

	@Override
	public String getNumeroAgencia() {
		// TODO Auto-generated method stub
		return super.getNumeroAgencia();
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



	public int getAnoRendimento() {
		return anoRendimento;
	}



	public void setAnoRendimento(int anoRendimento) {
		this.anoRendimento = anoRendimento;
	}



	public TipoInvestimento getInvestimento() {
		return investimento;
	}



	public boolean setInvestimento(TipoInvestimento investimento) {
		this.investimento = investimento;
		return false;
	}



	@Override
	public boolean consultaSaldo(Conta conta) {
		// TODO Auto-generated method stub
		return super.consultaSaldo(conta);
	}

	
	

}
