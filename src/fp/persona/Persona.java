package fp.persona;

public interface Persona extends Comparable<Persona> {

	String getNombre();

	void setNombre(String nombre);

	String getApellidos();

	void setApellidos(String apellidos);

	String getDni();

}