
public class Funcionario {
	private String nombre;
	private String documento;
	private double salario;
	private int tipo;
	
	public String getNombre() {
		return nombre;
	}
	// Contrucctor es un metodo de la misma clase, puede asignar variable o no.
	public Funcionario( ) {
		
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	// Metodo para calcular la bonificacion del funcionario que es del 10%
	public double getBonificacion() {
		return this.salario * 0.05;   
	}
	
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

}
