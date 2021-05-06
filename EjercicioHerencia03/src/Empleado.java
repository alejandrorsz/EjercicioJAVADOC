/**
 *  Superclase que modela los atributos básicos de un empleado.
 * @author Alumno_T
 * @version 0.5
 *
 */
public abstract class Empleado {
	
	/**
	 * Almacena el nombre del empleado.
	 */
	private String nombre;
	
	/**
	 * Almacena la edad del empleado.
	 */
	private int edad;
	
	/**
	 * Almacena el salario del empleado.
	 */
	private double salario;
	
	/**
	 * Contiene el valor del PLUS salarial.
	 */
	protected final double PLUS=300;
	
	
	// constructores
	
	
	/**
	 * Constructor por defecto
	 */
	
	public Empleado() 
	{
		
	};
	
	/**
	 * Constructor con parámetros
	 * @param nombre - Contiene el nombre de empleado.
	 * @param edad - Contiene edad del empleado.
	 * @param salario - Contiene salario del empelado.
	 */
	
	public Empleado(String nombre,int edad,double salario) {
		this.nombre=nombre;
		this.edad=edad;
		this.salario=salario;
	}
	
	/**
	 * Constructor copia
	 * @param e - Objeto Empleado.
	 */
	
	public Empleado (final  Empleado e) {
		nombre=e.nombre;
		edad=e.edad;
		salario=e.salario;
	}
	
	
	//Getters y setters
	
	/**
	 * 
	 * @return Devuelve el nombre del empleado.
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * 
	 * @param nombre Modifica el nombre del empleado.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * 
	 * @return Devuelve la edad del empleado.
	 */
	public int getEdad() {
		return edad;
	}
	
	/**
	 * 
	 * @param edad Modifica la edad del empleado.
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	/**
	 * 
	 * @return Devuelve el salario del empleado.
	 */
	public double getSalario() {
		return salario;
	}
	
	/**
	 * 
	 * @param salario Modifica el salario del empleado.
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	/**
	 * método toString Devuelve un String con los datos del empleado.
	 */
	@Override
	public String toString() {
		return "Empleado nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + ", PLUS=" + PLUS ;
	}
	

	/**
	 * Método plus, es abstracto, obliga a la clases hijas a implementar este método.
	 * @return Devuelve
	 */
	
	public abstract boolean plus();

	
	
	
	

}
