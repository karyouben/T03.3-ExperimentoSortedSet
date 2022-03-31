package fp.experimentos;

import java.util.Collection;
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

import fp.persona.Persona;
import fp.persona.PersonaImpl;

public class ExperimentoSortedSet {

	public static void main(String []args) {
		
		Persona p1 = new PersonaImpl("12345678Z", "John", "Doe");
		Persona p2 = new PersonaImpl("22345678Y", "Jane", "Doe");
		Persona p3 = new PersonaImpl("22345678Z", "Margaret", "Hamilton");
		Persona p4 = new PersonaImpl("22345678Y", "John", "Doe");
		
		//Cree un conjunto ordenado
        SortedSet<Persona> ss = new TreeSet<Persona>();
		//Muestrelo por consola
		System.out.println(ss);
		//Añada al conjunto las personas p1, p2 y p3
		ss.add(p1);
		ss.add(p2);
		ss.add(p3);
		//Muestre el conjunto por consola
		System.out.println(ss);
	
			
		//Añada al conjunto la persona p4
		ss.add(p4);
		//Muestre el conjunto por consola
		System.out.println(ss);
		
		
	}
	
	private static void mostrar(Collection<Persona> col) {
		System.out.println("Mostrando ..."+ col.size()+ " elementos");
		for (Persona p:col) {
			System.out.println(p);
		}
	}
}
