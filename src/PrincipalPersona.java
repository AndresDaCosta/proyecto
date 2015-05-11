import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
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
			oos.writeObject(persona2);
			oos.close();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("nombre"));
			Persona persona3 = (Persona) ois.readObject();
			Persona persona4 = (Persona) ois.readObject();
			ois.close();
			System.out.println(persona3.getEdad());
			System.out.println(persona3.getNombre());
			System.out.println(persona4.getEdad());
			System.out.println(persona4.getNombre());
		Persona [] array_personas = new Persona [2];
		array_personas [0] = persona;
		array_personas [1] = persona2;
		
		ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream("nombre2"));
			oos2.writeObject(array_personas);
			oos2.close();
		ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("nombre2"));
			Persona[] array_devuelto = (Persona []) ois2.readObject();
			ois2.close();
			System.out.println(array_devuelto);
			Persona persona_aux = null;
			for (int i = 0; i < array_devuelto.length; i++) {
				persona_aux = array_devuelto [i];
				System.out.println(persona_aux.getEdad());
				System.out.println(persona_aux.getNombre());
				
			}
		
	}
	
}
