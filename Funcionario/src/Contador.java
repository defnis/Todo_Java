
public class Contador extends Funcionario {
		
	public double getBonificacion() {
		return super.getSalario() + super.getBonificacion(); 
	}
}
