package gorbeamt;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Participante {
	private int codigo;
	private static int contador = 1;
	
	private String nombre;
	private NivelParticipante nivel;
	private LocalDate fechaNacimiento;
	private boolean confirmacionInscripcion;
	
	public Participante() {
		super();
		// TODO Auto-generated constructor stub
		this.codigo = Participante.contador;
		Participante.contador++;
	}

	public Participante(String nombre, NivelParticipante nivel, LocalDate fechaNacimiento,
			boolean confirmacionInscripcion) {
		super();
		this.codigo = Participante.contador;
		Participante.contador++;
		this.nombre = nombre;
		this.nivel = nivel;
		this.fechaNacimiento = fechaNacimiento;
		this.confirmacionInscripcion = confirmacionInscripcion;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Participante.contador = contador;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public NivelParticipante getNivel() {
		return nivel;
	}

	public void setNivel(NivelParticipante nivel) {
		this.nivel = nivel;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public boolean isConfirmacionInscripcion() {
		return confirmacionInscripcion;
	}

	public void setConfirmacionInscripcion(boolean confirmacionInscripcion) {
		this.confirmacionInscripcion = confirmacionInscripcion;
	}

	public int getCodigo() {
		return codigo;
	}

	@Override
	public String toString() {
		return "Participante [codigo=" + codigo + ", nombre=" + nombre + ", nivel=" + nivel + ", fechaNacimiento="
				+ fechaNacimiento + ", confimacionInscripcion=" + confirmacionInscripcion + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, confirmacionInscripcion, fechaNacimiento, nivel, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Participante other = (Participante) obj;
		return codigo == other.codigo && confirmacionInscripcion == other.confirmacionInscripcion
				&& Objects.equals(fechaNacimiento, other.fechaNacimiento) && nivel == other.nivel
				&& Objects.equals(nombre, other.nombre);
	}
	
}
