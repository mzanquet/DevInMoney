package devinmoney.banco;

import java.time.LocalDate;
import java.util.ArrayList;

import devinmoney.conta.Agencia;
import devinmoney.conta.Conta;
//import devinmoney.conta.ContaInvestimento;
//import devinmoney.conta.ContaPoupanca;
//import devinmoney.conta.TipoInvestimento;

public class BancoTeste {
	
	
	public static void main(String[] args) {
		
//		Conta conta = new Conta();
//		
//		conta.setNome("monique");
//		conta.setCpf("101.482.689-60");
//		conta.setRendaMensal(2000);
//		conta.setNumeroConta(2);
//		conta.setAgencia(Agencia.SAO_JOSE);
//		conta.setSaldo(200);
//		
//		
//		conta.deposito(1000, LocalDate.of(2022, 02, 05));
//
//		
//		conta.consultaSaldo(conta);
		
		Conta conta1 = new Conta();
		
		conta1.setNome("monique");
		conta1.setCpf("101.482.689-60");
		conta1.setRendaMensal(2000);
		conta1.setNumeroConta(2);
		conta1.setNumeroAgencia("001");
		conta1.setSaldo(200);
		
		
		conta1.deposito(1000, LocalDate.now());
		conta1.deposito(1000, LocalDate.now());
		
		conta1.deposito(2000, LocalDate.now() );
		
		conta1.deposito(2000, LocalDate.now() );
		
		conta1.emiteExtrato(conta1);
		
		conta1.deposito(2000, LocalDate.now() );
		
		conta1.saque(500, LocalDate.now());
		
	}
		
}
	
//		System.out.println("********* Teste banco *********");
//		
////		ContaPoupanca cp1 = new ContaPoupanca(null, null, 0, null, 0);
////		ContaInvestimento cp1 = new ContaInvestimento(null, null, 0, null, 0, 0, null);
//		cp1.setCpf("10148268960");
//		cp1.setNome("Monique");
//		cp1.setAgencia(Agencia.FLORIANOPOLIS);
//		cp1.setNumeroConta(1);
//		cp1.setRendaMensal(1000.00);
//		cp1.setSaldo(0);
//		
//		cp1.setInvestimento(TipoInvestimento.FUNDO_IMOBILIARIO);
//		
//		cp1.deposito(8000);
//		
//		switch (cp1.getInvestimento()) {
//		
//		case FUNDO_IMOBILIARIO:
//			if (cp1.calculaNovoSaldo(0.10)) {
//				System.out.println("Rendimento aplicado, novo saldo é de = " + cp1.getSaldo());
//			} else {
//				System.out.println("Hoje não é dia de rendimento, saldo não atualizado.");
//			}
//			break;
//			
//		case ACOES:
//			if (cp1.calculaNovoSaldo(0.20)) {
//				System.out.println("Rendimento aplicado, novo saldo é de = " + cp1.getSaldo());
//			} else {
//				System.out.println("Hoje não é dia de rendimento, saldo não atualizado.");
//			}
//			break;
//		case OURO:
//			if (cp1.calculaNovoSaldo(0.40)) {
//				System.out.println("Rendimento aplicado, novo saldo é de = " + cp1.getSaldo());
//			} else {
//				System.out.println("Hoje não é dia de rendimento, saldo não atualizado.");
//			}
//			break;
//		default:
//			break;
//		}
//		
//		System.out.println(cp1);

//		}
//		if (cp1.setInvestimento(TipoInvestimento.FUNDO_IMOBILIARIO)) {
//			if (cp1.calculaNovoSaldo(0.10)) {
//				System.out.println("Rendimento aplicado, novo saldo é de = " + cp1.getSaldo());
//			} else {
//				System.out.println("Hoje não é dia de rendimento, saldo não atualizado.");
//			}
//		} else if (cp1.setInvestimento(TipoInvestimento.ACOES)) {
//			if (cp1.calculaNovoSaldo(0.20)) {
//				System.out.println("Rendimento aplicado, novo saldo é de = " + cp1.getSaldo());
//			} else {
//				System.out.println("Hoje não é dia de rendimento, saldo não atualizado.");
//			}
//		} else if (cp1.setInvestimento(TipoInvestimento.OURO)) {
//			if (cp1.calculaNovoSaldo(0.40)) {
//				System.out.println("Rendimento aplicado, novo saldo é de = " + cp1.getSaldo());
//			} else {
//				System.out.println("Hoje não é dia de rendimento, saldo não atualizado.");
//			}
//		} else { 
//			System.out.println("Não consegui");
//		}
		
		
//	if (cp1.calculaNovoSaldo(0.022)) {
//		System.out.println("Rendimento aplicado, novo saldo é de = " + cp1.getSaldo());
//	} else {
//		System.out.println("Hoje não é dia de rendimento, saldo não atualizado.");
//	}

		
//		ContaCorrente cc1 = new ContaCorrente(null, null, 0, null, 0);
//		cc1.setCpf("10148268960");
//		cc1.setNome("Monique");
////		conta1.setNumeroAgencia("001");
//		cc1.setNumeroConta(1);
//		cc1.setRendaMensal(1000.00);
//		cc1.setSaldo(0);
//		
//		ContaCorrente cc2 = new ContaCorrente(null, null, 0, null, 0);
//		cc2.setCpf("101482689602");
//		cc2.setNome("Monique2");
////		conta1.setNumeroAgencia("001");
//		cc2.setNumeroConta(2);
//		cc2.setRendaMensal(1000.00);
//		cc2.setSaldo(0);	
//		
//		cc2.deposito(50);
//		
//		cc2.saque(50);
//		
//		cc2.saque(30);
//		
//		cc2.saque(100);
//		
//		cc1.deposito(50);
//		
//		cc1.saque(50);
//		
//		cc1.saque(30);
//		
//		cc1.saque(1000);
//		
//		cc1.transferencia(cc2, 1000);
//		
//		
//		System.out.println(cc1);
//		System.out.println(cc2);
//		
//		
//		Conta conta1 = new Conta();
//		conta1.setCpf("10148268960");
//		conta1.setNome("Monique");
////		conta1.setNumeroAgencia("001");
//		conta1.setNumeroConta(1);
//		conta1.setRendaMensal(100.00);
//		conta1.setSaldo(0);
//		
//		Conta conta2 = new Conta();
//		conta2.setCpf("10148268962");
//		conta2.setNome("Monique2");
////		conta1.setNumeroAgencia("001");
//		conta2.setNumeroConta(2);
//		conta2.setRendaMensal(100.00);
//		conta2.setSaldo(0);
//		
//		conta1.deposito(50);
//		
//		conta1.deposito(50);
//		
//		conta1.saque(50);
//		
//		conta1.saque(30);
//		
//		conta1.saque(40);
//		
//		conta2.deposito(30);
//		
//		conta1.transferencia(conta2, 10);
//		
//		
//		System.out.println(conta1);
//		System.out.println(conta2);
//	}
//	
//	public void adicionaListaContas() {
//		if (contasBancarias.size() > 0) {
//			for (Conta conta: contasBancarias) {
//					System.out.println(conta);
//			}
//		} else {
