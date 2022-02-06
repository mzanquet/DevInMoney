package devinmoney.banco;

import java.time.LocalDate;

import devinmoney.conta.Conta;

public class Banco {

	public void alteraConta (Conta conta, String nomeAnterior, String nomeAtual, double rendaMensalAnterior, 
			double rendaMensalAtual, int numeroContaAnterior, int numeroContaAtual, String agenciaAnterior, 
			String agenciaAtual, double SaldoAnterior, double saldoAtual) {
		
		conta.setNome(nomeAtual);
		conta.setRendaMensal(rendaMensalAtual);
		conta.setNumeroConta(numeroContaAtual);
		conta.setNumeroAgencia(agenciaAtual);
		conta.setSaldo(saldoAtual);
	}
	
    public void adicionaTransacaoDebito(Conta conta, LocalDate data, int valor) {
    	conta.deposito(valor, data);
    }

    public void adicionaTransacaoCredito(Conta conta, LocalDate data, int valor) {
    	conta.saque(valor, data);
    }	
    
    public void adicionaTransacaoCredito(Conta conta, Conta contaDestino, double valor, LocalDate data) {
    	conta.transferencia(contaDestino, valor, data);
    }	
	

}
