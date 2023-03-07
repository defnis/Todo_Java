package paypal;

public class PruebaMetodos {
	
	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta();
		// Ya le habiamos asignado 300 a mi saldo.
		miCuenta.saldo = 300;
		
		// Con este metodo depositar le agregamos 200 +.
		miCuenta.depositar(200);	
		System.out.println(miCuenta.saldo);
		
		miCuenta.retirar(100);
		System.out.println(miCuenta.saldo);
		
		Cuenta cuentaDeJimena = new Cuenta();
		cuentaDeJimena.depositar(1000);
		boolean puedeTransferir = cuentaDeJimena.transferir(400, miCuenta);
		
		if(puedeTransferir) {
			System.out.println("Transferencia Exitosa");
		} else {
			System.out.println("No es posible transferir");
		}
		
	}
}
