class Consultar {
	private int saldo;

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public void consultarSaldo() {
		System.out.println("Su saldo actual es: $" + saldo);
	}
}

