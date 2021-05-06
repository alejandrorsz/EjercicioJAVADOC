/**
 * Clase principal del proyecto.
 * @author Alumno_T
 *
 */
public class EjercicioHerencia03 {

	public static void main(String[] args) {
		
		/**
		 *  Creamos un repartidor que NO cumple los requisitos para obtener un PLUS sobre su salario.
		 */
		Repartidor r1=new Repartidor("Pepe",25,2100,"zona 1");
		
		/**
		 * Creamos un nuevo repartidor que SI cumple los requisitos para otener un PLUS sobre su salario.
		 */
		Repartidor r2=new Repartidor("Juan",20,2000,"zona 3"); 
		
		
		/**
		 * Llamamos al método plus sobre los repartidores que acabamos de crear.
		 */
		System.out.println("\nRepartidores:");
		
		r1.plus();
		r2.plus();
		
			
		/**
		 * Mostramos los resultados.
		 */
	
		System.out.println(r1);
		System.out.println(r2);
		
		/**
		 * Creamos dos comerciales.
		 */
		
		Comercial c1= new Comercial ("Marta",25,2200,100);
		Comercial c2= new Comercial ("Paula",36,2500,300);
	
		
	/**
	 * Llamamos al método plus sobre los comerciales que acabamos de crear.
	 */
		System.out.println("\nComerciales:");
		c1.plus();
		c2.plus();
		
			
		/**
		 * Mostramos los resultados de los comerciales.
		 */
		
		System.out.println(c1);
		System.out.println(c2);
		
		

	}

}
