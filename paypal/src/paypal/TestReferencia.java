package paypal;

public class TestReferencia {
	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.saldo = 2000;
		
		Cuenta segundaCuenta = primeraCuenta;
		segundaCuenta.saldo = 100;
		
		// Ambos hacen referencia al mismo objeto en memoria, por eso cualquier modificacion en uno afecta al otro.
		System.out.println("Saldo primera Cuenta: " + primeraCuenta.saldo);
		
		System.out.println("Saldo segunda Cuenta: " + segundaCuenta.saldo);
	}
}
