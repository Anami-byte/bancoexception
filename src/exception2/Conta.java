package exception2;

public class Conta {
	float saldo;
	float saque;
	float limite;
	
	public Conta(float saldo, float saque, float limite) throws TesteException {
		if (saque<=saldo && saque<=limite) {
			this.saldo = saldo;
			this.saque = saque;
			this.limite = limite;			
		}else if(saque>limite) {
			throw new TesteException ("The amount exceeds withdraw limit");
		}else {
			throw new TesteException("Not enough balance");
		}
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float getSaque() {
		return saque;
	}

	public void setSaque(float saque) {
		this.saque = saque;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	@Override
	public String toString() {
		return String.valueOf(saldo-saque);
	}
	
}
