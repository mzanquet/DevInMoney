package devinmoney.conta;

import java.time.LocalDate;

public abstract class Conta {
	
	static int contadorContas = 1;
	
	public String nome;
	String cpf;
	public double rendaMensal;
	public int numeroConta;
	public String numeroAgencia;
	public double saldo;
	public double saldoAtual;
	
    
	public Conta() {
		
	}
	
	public Conta(String nome, String cpf, double rendaMensal, String numeroAgencia, double saldo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rendaMensal = rendaMensal;
		this.numeroConta = contadorContas;
		this.numeroAgencia = numeroAgencia;
		this.saldo = saldo;

		contadorContas +=1;
	}
	

	public void deposito(double valor, LocalDate data) {
		if (valor > 0) {
			saldo += valor;
			System.out.println("Valor depositado com sucesso, " + valor);
		} else {
			System.out.println("Um valor negativo não pode ser depositado");
		}
	
	}
		
	
	public void saque(double valor, LocalDate data) {
		if (valor > 0) {
			if ((valor) <= saldo) {
				saldo -= valor;
				System.out.println("Valor do saldo atual: " + saldo);
			}
		} else {
			System.out.println("Saque não realizado, saldo negativo.");
		}
		
		
	}
	
	public void transferencia(Conta contaDestino, Double valor, LocalDate data) {
		if (valor > 0 && this.getSaldo() >= valor) {
			setSaldo(getSaldo() - valor);
			
			contaDestino.saldo = contaDestino.getSaldo() + valor;
			
			System.out.println("Transferência realizado com sucesso!");
		} else {
			System.out.println("Não foi possível realizar a transferência!");
		}		
	}
	
	public boolean consultaSaldo(Conta conta) {
		boolean existe = true;
		if (existe) {
			conta.saldo = conta.getSaldo();
			System.out.println("Saldo conta: " + saldo);
			return true;
		}
		
		return false;	
	}
	
	public void alteraConta(Conta conta, String nomeAnterior, String nomeAtual, double rendaMensalAnterior, 
			double rendaMensalAtual, int numeroContaAnterior, int numeroContaAtual, String agenciaAnterior, 
			String agenciaAtual, double SaldoAnterior, double saldoAtual) {
		
		conta.setNome(nomeAtual);
		conta.setRendaMensal(rendaMensalAtual);
		conta.setNumeroConta(numeroContaAtual);
		conta.setNumeroAgencia(agenciaAtual);
		conta.setSaldo(saldoAtual);
	}
	

	
	@Override
	public String toString() {
		return "Conta [nome=" + nome + ", cpf=" + cpf + ", rendaMensal=" + rendaMensal + ", numeroConta=" + numeroConta
				+ ", numeroAgencia=" + numeroAgencia + ", saldo=" + saldo + "]";
	}
	public static int getContadorConta() {
		return contadorContas;
	}
	public static void setContadorConta(int contadorConta) {
		Conta.contadorContas = contadorConta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getRendaMensal() {
		return rendaMensal;
	}
	public void setRendaMensal(double rendaMensal) {
		this.rendaMensal = rendaMensal;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getNumeroAgencia() {
		return numeroAgencia;
	}
	public void setNumeroAgencia(String agenciaAtual) {
		this.numeroAgencia = agenciaAtual;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void adicionaTransferencia(Conta contaDestino, double valor) {
		// TODO Auto-generated method stub
		
	}

	public void adicionaSaque(double valorSaque) {
		// TODO Auto-generated method stub
		
	}

	public double adicionaDeposito(double valorDeposito) {
		return valorDeposito;
		// TODO Auto-generated method stub
		
	}

}
