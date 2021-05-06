/**
 * Clase extendida de Empleado.
 * @author Alumno_T
 *
 */
public class Comercial extends Empleado {
	
	/**
	 * Almacena la comision del empleado.
	 */
	private double comision;
	
	/**
	 * Contructor
	 * @param nombre - Almacena el nombre del comercial.
	 * @param edad - Almacena la edad del comercial.
	 * @param salario - Almacena el salario del comercial.
	 * @param comision - Almacena la comision del comercial.
	 */
	public Comercial(String nombre, int edad, double salario,double comision) {
		super(nombre,edad,salario);
		this.comision=comision;
		
	}
	
	//getters y setters
	
	/**
	 * 
	 * @return Devuelve la comision del comercial.
	 */
	public double getComision() {
		return comision;
	}

	/**
	 * 
	 * @param comision Modifica la comision del comercial.
	 */
	public void setComision(double comision) {
		this.comision = comision;
	}

	/**
	 * Método String que imprime la comision del comercial.
	 */
	@Override
	public String toString() {
		return super.toString() + "comision=" + comision ;
	}
	
	/**
	 * Método plus - Agrega un plus a cada trabajador que cumple los requisitos.
	 */
	
	public boolean plus() {
		if (super.getEdad()>30 && this.comision>200) {
			
			/**
			 * si cumple las características hay que modificar el salario 
			 * añadiendole el PLUS
			 */
			
			double nuevoSalario=super.getSalario()+super.PLUS;
			super.setSalario(nuevoSalario);
			System.out.println("El comercial "+super.getNombre()+" recibe el Plus");
			return true;
		}
		else
			return false;
	}
	

	
	

}
