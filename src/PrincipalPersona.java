import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class PrincipalPersona {

	
	public static void main(String[] args) throws Exception, Throwable {
		
		Persona persona = new Persona(18, "Jorge");
		System.out.println(persona.getEdad());
		System.out.println(persona.getNombre());
		
		Persona persona2 = new Persona(19, "andres");
		System.out.println(persona2.getEdad());
		System.out.println(persona2.getNombre());
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("nombre"));
		
			oos.writeObject(persona);
			oos.close();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("nombre"));
			Persona persona3 = (Persona) ois.readObject();
			ois.close();
			System.out.println(persona3.getEdad());
			System.out.println(persona3.getNombre());
			
	}
	
}
