package paypal;

public class TestReferencia3 {
	
	public static void mail(String[] args) {
		Cuenta cuentaDiego = new Cuenta();
	
		cuentaDiego.titular = new Cliente();
		cuentaDiego.titular.nombre = "Diego";
		System.out.println(cuentaDiego.titular.nombre);
	}
}
