

public class CuentaCorriente extends Cuenta {
	
	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
	
	}
	
	@Override  //Override esta sobreescribiendo su metodo padre.
	public boolean retirar(double valor) {
		double comision = 0.2;
		return super.retirar(valor + comision);
	}
}
