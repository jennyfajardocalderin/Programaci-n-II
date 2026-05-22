package gorbeamt;

import java.time.LocalDate;

public class Familiar extends Participante {
	private boolean grupo;
	private String nombreGrupo;
	
	public Familiar(String nombre, NivelParticipante nivel, LocalDate fechaNacimiento, boolean confirmacionInscripcion,
			boolean grupo, String nombreGrupo) {
		super(nombre, nivel, fechaNacimiento, confirmacionInscripcion);
		this.grupo = grupo;
		this.nombreGrupo = nombreGrupo;
	}

	public boolean isGrupo() {
		return grupo;
	}

	public void setGrupo(boolean grupo) {
		this.grupo = grupo;
	}

	public String getNombreGrupo() {
		return nombreGrupo;
	}

	public void setNombreGrupo(String nombreGrupo) {
		this.nombreGrupo = nombreGrupo;
	}

	@Override
	public String toString() {
		return "Familiar [grupo=" + grupo + ", nombreGrupo=" + nombreGrupo + ", getNombre()=" + getNombre()
				+ ", getNivel()=" + getNivel() + ", getFechaNacimiento()=" + getFechaNacimiento()
				+ ", isConfimacionInscripcion()=" + isConfirmacionInscripcion() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
