package gorbeamt;

import java.time.LocalDate;

public class Larga extends Participante {
	
	private boolean tiempoOfic;
	private int numeroMarchasLargas;
	
	public Larga(String nombre, NivelParticipante nivel, LocalDate fechaNacimiento, boolean confirmacionInscripcion,
			boolean tiempoOfic, int numeroMarchasLargas) {
		super(nombre, nivel, fechaNacimiento, confirmacionInscripcion);
		this.tiempoOfic = tiempoOfic;
		this.numeroMarchasLargas = numeroMarchasLargas;
	}

	public boolean isTiempoOfic() {
		return tiempoOfic;
	}

	public void setTiempoOfic(boolean tiempoOfic) {
		this.tiempoOfic = tiempoOfic;
	}

	public int getNumeroMarchasLargas() {
		return numeroMarchasLargas;
	}

	public void setNumeroMarchasLargas(int numeroMarchasLargas) {
		this.numeroMarchasLargas = numeroMarchasLargas;
	}

	@Override
	public String toString() {
		return "Larga [tiempoOfic=" + tiempoOfic + ", numeroMarchasLargas=" + numeroMarchasLargas + ", getNombre()="
				+ getNombre() + ", getNivel()=" + getNivel() + ", getFechaNacimiento()=" + getFechaNacimiento()
				+ ", isConfimacionInscripcion()=" + isConfirmacionInscripcion() + ", getCodigo()=" + getCodigo() + "]";
	}
	
}
