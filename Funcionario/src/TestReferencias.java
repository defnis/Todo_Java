
public class TestReferencias {
	public static void main(String[] args) {
		
		// Funcionario funcionario = new Gerente();  Un nuevo Gerente es un Funcionario nuevo.
		Funcionario funcionario = new Funcionario();
		funcionario.setNombre("Diego");
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Gimena");
		
		funcionario.setSalario(2000);
		gerente.setSalario(10000);
	}
}
