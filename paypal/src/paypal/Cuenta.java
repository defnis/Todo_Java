package paypal;

// Creamos la entidad cuenta:
class Cuenta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	
	//Static nos indica que esta instancia pertenece a la clase.
	private static int total = 0;
	
	public Cuenta() {
	}
	
	// Este metodo nos va a retornar el valor de nuestra cuenta.
	public Cuenta(int agencia) {
		int total = 0;
		if (this.agencia <= 0 ) {
			System.out.println("No se permiten 0");
			this.agencia = 1;
		} else {
			this.agencia = agencia;
		}
		total++;
		System.out.println("Se van creando: " + total + "cuentas");
	}
	
	
	// El metodo void no retorna nada.
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	//El metodo boolean retorna un valor.
	public boolean retirar(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transferir(double valor, Cuenta cuenta) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			cuenta.depositar(valor);
			return true;
		} else {
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setAgencia(int agencia) {
		if(agencia > 0) {
			this.agencia = agencia;
		} else {
			System.out.println("No esta permitido valores negativos");
		}
	}
	
	public int getAgencia() {
		return agencia;
	} 
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
}


