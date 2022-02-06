package devinmoney.conta;

public enum TipoInvestimento {
	
	FUNDO_IMOBILIARIO(0.10), ACOES(0.20), OURO(0.40);
	
	Double taxaRendimento;
	
	
	public Double getTaxaRendimento() {
		return taxaRendimento;
	}


	public void setTaxaRendimento(Double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}


	TipoInvestimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}


	
	

}
