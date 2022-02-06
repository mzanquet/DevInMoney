package devinmoney.conta;

public enum Agencia {
	
	FLORIANOPOLIS("001"), SAO_JOSE("002");
	
	String numeroAgencia;


	Agencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public String getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	
	public static Agencia getAgenciaBynumeroAgencia(String numeroAgencia) {
		for(Agencia agencia : Agencia.values()) {
			if(agencia.getNumeroAgencia().equalsIgnoreCase(numeroAgencia))
				return agencia;
		}
		throw new IllegalArgumentException("Número da agência " + numeroAgencia + " não é válido!");
	}
	
	

}
