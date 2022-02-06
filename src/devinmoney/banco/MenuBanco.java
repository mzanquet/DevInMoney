package devinmoney.banco;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import devinmoney.conta.Conta;
import devinmoney.conta.ContaCorrente;
import devinmoney.conta.ContaInvestimento;
import devinmoney.conta.ContaPoupanca;
import devinmoney.transacoes.Transacao;

public class MenuBanco {
	
	static Scanner teclado = new Scanner(System.in);
	static ArrayList<Conta> contasBancarias;
	static ArrayList<Transacao> transacoes;
	
	public static void main(String[] args) {
		contasBancarias = new ArrayList<Conta>();
		transacoes = new ArrayList<Transacao>();
		operacoesMenuPrinciapal();
	}
	
	public static void operacoesMenuPrinciapal() {
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("----------------------------- SISTEMA BANCO ----------------------------------");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("************ Digite um n�mero para acessar a opera��o desejada ***************");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("       1. Abrir conta          ");
		System.out.println("       2. Dep�sito             ");
		System.out.println("       3. Saque                ");
		System.out.println("       4. Transfer�ncia        ");
		System.out.println("       5. Lista de contas      ");
		System.out.println("       6. Extrato              ");
		System.out.println("       7. Sair                 ");
		
		int operacao = teclado.nextInt();
		
		switch(operacao) {
		case 1:
			adicionaConta();
			break;
		case 2:
			adicionaDeposito();
			break;
		case 3:
			adicionaSaque();
			break;			
		case 4:
			adicionaTransferencia();
			break;			
		case 5:
			adicionaListaContas();
			break;	
		case 6:
			adicionaExtrato();
			break;	
		case 7:
			System.out.println("At� breve!");
			System.exit(0);
			
		default:
			System.out.println("Op��o inv�lida!");
			operacoesMenuPrinciapal();
			break;
		}
	}
	
	
	public static int menuConta(Scanner teclado) {
		System.out.println("Selecione um tipo de conta: ");
		System.out.println("1. Conta corrente");
		System.out.println("2. Conta poupan�a");
		System.out.println("3. Conta investimento");
		
		int opcao;
		do {
			System.out.println("Digite um n�mero da lista para selecionar desejada");
			opcao = teclado.nextInt();
		} while (opcao < 1 || opcao > 3);
		return opcao;
	}
	
	public static Conta adicionaConta() {
		
		Conta conta = null;
		int opcao = menuConta(teclado);
		
		if (opcao == 1) {
			System.out.println(" Nome: ");
			String nome = teclado.next();
			System.out.println(" Cpf: ");
			String cpf = teclado.next();		
			System.out.println(" Renda Mensal: ");
			double rendaMensal = teclado.nextDouble();		
			System.out.println(" N�mero da agencia: ");
			String numeroAgencia = teclado.next();			
			System.out.println(" Saldo inicial: ");
			double saldo = teclado.nextDouble();			
			conta = new ContaCorrente(nome, cpf, rendaMensal, numeroAgencia, saldo);
			
			contasBancarias.add(conta);
			System.out.println("Conta criada com sucesso!");
		
		} else if (opcao ==2 ){ 			
			System.out.println(" Nome: ");
			String nome = teclado.next();		
			System.out.println(" Cpf: ");
			String cpf = teclado.next();		
			System.out.println(" Renda Mensal: ");
			double rendaMensal = teclado.nextDouble();			
			System.out.println(" N�mero da agencia: ");
			String numeroAgencia = teclado.next();
			System.out.println(" Digite a quantidade de meses para simular o rendimento da aplica��o:");
			int mesRendimento = teclado.nextInt();
			System.out.println(" Digite o valor que deseja simular: ");
	        double valorSimulado = teclado.nextDouble();
	        int valorSimuladoInt;
	        valorSimuladoInt = (int)mesRendimento;
			double calculoRendimento = (valorSimulado * ((1 + (1/100))^mesRendimento));
			System.out.println(" O montante da poupan�a no per�odo simulado �: " + calculoRendimento);
			System.out.println(" Digite o valor novamente para guardar o valor na poupan�a: ");
			double saldo = teclado.nextDouble();
			conta = new ContaPoupanca(nome, cpf, rendaMensal, numeroAgencia, saldo);
			
			contasBancarias.add(conta);
			System.out.println("Conta criada com sucesso!");
			
		} else {
			
			System.out.println(" Nome: ");
			String nome = teclado.next();
			System.out.println(" Cpf: ");
			String cpf = teclado.next();		
			System.out.println(" Renda Mensal: ");
			double rendaMensal = teclado.nextDouble();
			System.out.println(" N�mero da agencia: ");
			String numeroAgencia = teclado.next();
			System.out.println(" Tipo de investimento");
			String investimento = teclado.next();
			System.out.println(" Digite a quantidade de anos para simular o rendimento da aplica��o:");
			int anoRendimento = teclado.nextInt();
			System.out.println(" Digite o valor que deseja simular: ");
	        double valorSimulado = teclado.nextDouble();
	        int valorSimuladoInt;
	        valorSimuladoInt = (int) anoRendimento;
			double calculoRendimento = (valorSimulado * ((1 + (1/5))^anoRendimento));
			System.out.println(" O montante do valor do investimento no per�odo simulado �: " + calculoRendimento);
			System.out.println(" Digite o valor novamente para confirmar o investimento: ");
			double saldo = teclado.nextDouble();
			conta = new ContaInvestimento(nome, cpf, rendaMensal, numeroAgencia, saldo);
			
			contasBancarias.add(conta);
			System.out.println("Conta criada com sucesso!");
			
		}
		operacoesMenuPrinciapal();
		return conta;
	}
		


//		Conta conta = new Conta(nome, cpf, rendaMensal, numeroAgencia, saldo);
//		
//		contasBancarias.add(conta);
//		System.out.println("Conta criada com sucesso!");

	
	
	private static Conta buscaConta(int numeroConta) {
		Conta conta = null;
		if(contasBancarias.size() > 0) {
			for (Conta c: contasBancarias) {
				if (c.getNumeroConta() == numeroConta);
				conta = c;	
			}
		}
		
		return conta;
	}
	
	public static void adicionaDeposito() {
        System.out.print("\nPor favor, digite o n�mero da conta origem: ");
        int numeroConta = teclado.nextInt();
        System.out.print("\nPor favor, digite o n�mero da conta destino: ");
        int numeroContaDestino = teclado.nextInt();
        
        Conta conta = buscaConta(numeroConta);
        
        if (conta != null) {
        	System.out.println("Digite o valor do dep�sito: ");
        	double valor = teclado.nextDouble();
        	conta.adicionaDeposito(valor);
        	System.out.println("Valor depositado com sucesso!");
    		Transacao transacao = new Transacao(numeroConta, numeroContaDestino, valor, LocalDate.now());
            transacoes.add(transacao);
        } else {
        	System.out.println("Conta n�o existe!");
        }
        operacoesMenuPrinciapal();
		
	}
	
	
	public static void adicionaSaque() {
        System.out.print("\nPor favor, digite o n�mero da conta origem: ");
        int numeroConta = teclado.nextInt();
        System.out.print("\nPor favor, digite o n�mero da conta destino: ");
        int numeroContaDestino = teclado.nextInt();
        
        Conta conta = buscaConta(numeroConta);
        
        if (conta != null) {
        	System.out.println("Digite o valor para saque: ");
        	double valor = teclado.nextDouble();
        	conta.adicionaSaque(valor);
        	System.out.println("Saque realizado com sucesso!");
    		Transacao transacao = new Transacao(numeroConta, numeroContaDestino, valor, LocalDate.now());
            transacoes.add(transacao);
        } else {
        	System.out.println("Conta n�o existe!");
        }
        operacoesMenuPrinciapal();
		
	}
	

	
	public static void adicionaTransferencia() {
        System.out.print("\nPor favor, digite o n�mero da conta origem: ");
        int numeroContaOrigem = teclado.nextInt();
        
        Conta contaOrigem = buscaConta(numeroContaOrigem);
        
        if (contaOrigem != null) {
        	System.out.println("N�mero da conta destino: ");
        	int numeroContaDestino = teclado.nextInt();
        	
        	Conta contaDestino = buscaConta(numeroContaDestino);
        	
        	if (contaDestino != null) {
        		System.out.println("Valor da transfer�ncia: ");
        		double valor = teclado.nextDouble();
        		
        		contaDestino.adicionaTransferencia(contaDestino, valor);
        		Transacao transacao = new Transacao(numeroContaOrigem, numeroContaDestino, valor, LocalDate.now());
                transacoes.add(transacao);
        	}
        }
        operacoesMenuPrinciapal();		
	}
	
	public static void adicionaListaContas() {
		if (contasBancarias.size() > 0) {
			for (Conta conta: contasBancarias) {
				System.out.println(conta);
			}
		} else {
			System.out.println("Conta n�o existe!");
		}
		operacoesMenuPrinciapal();
		
	}
	
	public static void adicionaExtrato() {
		if (transacoes.size() > 0) {
			for (Transacao transacao: transacoes) {
				System.out.println(transacao);
			}
		} else {
			System.out.println("Nenhuma transa��o efetuada!");
		}
		operacoesMenuPrinciapal();
		
	}
	
	
	public void atualizaSaldoPoupanca(Conta conta) {
		if (((ContaPoupanca) conta).calculaNovoSaldo(0.022)) {
			System.out.println("Rendimento aplicado, novo saldo � de = " + conta.getSaldo());
		} else {
			System.out.println("Hoje n�o � dia de rendimento, saldo n�o atualizado.");
		}
	}
	
	
	
	public void atualizaSaldoInvestimento(Conta conta) {
	switch (((ContaInvestimento) conta).getInvestimento()) {
	
	case FUNDO_IMOBILIARIO:
		if (((ContaInvestimento) conta).calculaNovoSaldo(0.10)) {
			System.out.println("Rendimento aplicado, novo saldo � de = " + ((ContaInvestimento) conta).getSaldo());
		} else {
			System.out.println("Hoje n�o � dia de rendimento, saldo n�o atualizado.");
		}
		break;
		
	case ACOES:
		if (((ContaInvestimento) conta).calculaNovoSaldo(0.20)) {
			System.out.println("Rendimento aplicado, novo saldo � de = " + ((ContaInvestimento) conta).getSaldo());
		} else {
			System.out.println("Hoje n�o � dia de rendimento, saldo n�o atualizado.");
		}
		break;
	case OURO:
		if (((ContaInvestimento) conta).calculaNovoSaldo(0.40)) {
			System.out.println("Rendimento aplicado, novo saldo � de = " + ((ContaInvestimento) conta).getSaldo());
		} else {
			System.out.println("Hoje n�o � dia de rendimento, saldo n�o atualizado.");
		}
		break;
	default:
		break;
	}
	
	System.out.println(((ContaInvestimento) conta));

	}

	
		

}
