package fp.persona;

public class PersonaImpl implements Persona {
	private String dni;
	private String nombre;
	private String apellidos;

	public PersonaImpl(String dni, String nombre, String apellidos) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	/* (non-Javadoc)
	 * @see fp.persona.Persona#getNombre()
	 */
	@Override
	public String getNombre() {
		return nombre;
	}

	/* (non-Javadoc)
	 * @see fp.persona.Persona#setNombre(java.lang.String)
	 */
	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/* (non-Javadoc)
	 * @see fp.persona.Persona#getApellidos()
	 */
	@Override
	public String getApellidos() {
		return apellidos;
	}

	/* (non-Javadoc)
	 * @see fp.persona.Persona#setApellidos(java.lang.String)
	 */
	@Override
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/* (non-Javadoc)
	 * @see fp.persona.Persona#getDni()
	 */
	@Override
	public String getDni() {
		return dni;
	}
	
	public String toString() {
		return getApellidos()+", "+getNombre() + "(" + getDni()+")" ;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Persona))
			return false;
		Persona other = (Persona) obj;
		if (apellidos == null) {
			if (other.getApellidos() != null)
				return false;
		} else if (!apellidos.equals(other.getApellidos()))
			return false;
		if (dni == null) {
			if (other.getDni() != null)
				return false;
		} else if (!dni.equals(other.getDni()))
			return false;
		if (nombre == null) {
			if (other.getNombre() != null)
				return false;
		} else if (!nombre.equals(other.getNombre()))
			return false;
		return true;
	}	

	public int compareTo(Persona o) {
		int res = getApellidos().compareTo(o.getApellidos());
		if (res == 0) {
			res = getNombre().compareTo(o.getNombre());
			if (res == 0) {
				res= getDni().compareTo(o.getDni());
			}
		}
		return res;
	}
}
