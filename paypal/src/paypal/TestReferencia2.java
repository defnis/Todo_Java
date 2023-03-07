package paypal;

public class TestReferencia2 {
	public static void main(String[] args) {
		Cliente diego = new Cliente();
		diego.nombre = "Diego";
		diego.documento = "291462444";
		diego.telefono = "333333333";
		
		Cuenta cuentaDiego = new Cuenta();
		cuentaDiego.agencia = 1;
		cuentaDiego.titular = diego;
		
		System.out.println(cuentaDiego.titular.documento);
		System.out.println(cuentaDiego.titular);
		System.out.println(diego);
	}
}
