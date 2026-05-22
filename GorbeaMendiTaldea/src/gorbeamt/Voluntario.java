package gorbeamt;

import java.util.Objects;

public class Voluntario {
	
	private String dni;
	private String nombre;
	private int edad;
	public Voluntario(String dni, String nombre, int edad) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
	}
	public Voluntario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dni, edad, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voluntario other = (Voluntario) obj;
		return Objects.equals(dni, other.dni) && edad == other.edad && Objects.equals(nombre, other.nombre);
	}
	@Override
	public String toString() {
		return "Voluntario [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
}
