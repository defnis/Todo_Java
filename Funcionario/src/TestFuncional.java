
public class TestFuncional {
	public static void main(String[] args) {
		Funcionario diego =  new Funcionario();
		diego.setDocumento("33445543");
		diego.setNombre("diego");
		diego.setSalario(2000);
		diego.setTipo(0);
		
		System.out.println(diego.getSalario());
		System.out.println(diego.getBonificacion());
	}
}
