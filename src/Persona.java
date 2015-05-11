/* este fichero lo que crea es como un esquema de los datos que va utilizar nuestro programa */
import java.io.Serializable;
/*la instruccion anterior lo que hace es que se pueda serealizar los datos*/

public class Persona implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int edad;
	private String nombre;
	
	//sobreescribo el métdo - overwrite de la clase Object
	public String toString() {
		// TODO Auto-generated method stub
		return (this.edad + " "+ this.nombre + " hola"); 
	}
	
	public Persona(int edad, String nombre) {
		super();
		this.edad = edad;
		this.nombre = nombre;
	}
	public int getEdad() {
		return this.edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
