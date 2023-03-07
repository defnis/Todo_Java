// Extiende de: 
public class Gerente extends Funcionario{
	
	private String clave;
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public boolean iniciarSesion(String clave) {
		return clave == "Alura";
	} 
	// Sobre-escritura del metodo, ya esta declarado en su clase madre Funcionario.
	public double getBonificacion() {
		return super.getSalario() + super.getBonificacion(); //(super.getSalario() * 0.1);
	}
}
