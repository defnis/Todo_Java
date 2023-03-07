package paypal;

public class CrearCuenta {
	
	public static void main(String[] args) {
		// Esta variable cuenta, va a representar una nueva cuenta.
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.depositar(1000);
		System.out.println(primeraCuenta.getSaldo());
		
		// Es una nueva instancia, un nuevo objeto y ocupara otro espacio en memoria diferente a primeraCuenta.
		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.depositar(500);
		System.out.println(segundaCuenta.getSaldo());
	}
}
