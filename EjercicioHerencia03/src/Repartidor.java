
/**
 * Clase extendida de Empleado.
 * @author Alumno_T
 *
 */
public class Repartidor extends Empleado {
	
	/**
	 * Almacena la zona que le pertenece al empleado.
	 */
	private String zona;
	
	/**
	 * constructor
	 * @param nombre - Almacena el nombre del repartidor.
	 * @param edad - 	Almacena la edad del repartidor.
	 * @param salario - Almacena el salario del repartidor.
	 * @param zona - Almacena la zona opr la que reparte el repartidor.
	 */
	public Repartidor(String nombre, int edad, double salario,String zona) {
		super(nombre,edad,salario);
		this.zona=zona;
		
		
	}
	
	//geters y seters

	/**
	 * 
	 * @return Devuelve la zona del repartidor.
	 */
	public String getZona() {
		return zona;
	}

	/**
	 * 
	 * @param zona Modifica la zona del repartidor.
	 */
	public void setZona(String zona) {
		this.zona = zona;
	}
	
	/**
	 * Método String que devuelve los datos del repartidor.
	 */
	
	@Override
	public String toString() {
		
		return super.toString() + " zona= " + zona  ;
	}
	
	/**
	 *  Método plus - Agrega un plus a cada trabajador que cumple los requisitos.
	 */
	public boolean plus() {
		
		if(super.getEdad()<25 && zona.equalsIgnoreCase("zona 3")) {
			
			/**
			 * Si tiene menos de 25 y está en la zona 3 recibe el plus hay 
			 * que modificar el salario.
			 */
			
			double nuevoSalario=super.getSalario()+super.PLUS;
			super.setSalario(nuevoSalario);
			System.out.println("El repartidor "+super.getNombre()+" recibe el plus");
			return true;
		}
		else
			return false;
		
	}
}
