package gorbeamt;

import java.time.LocalDate;
import java.util.Objects;

public class Mediana extends Participante {
	
	private boolean partAnterioresMarchas;

	public Mediana(String nombre, NivelParticipante nivel, LocalDate fechaNacimiento, boolean confimacionInscripcion,
			boolean partAnterioresMarchas) {
		super(nombre, nivel, fechaNacimiento, confimacionInscripcion);
		this.partAnterioresMarchas = partAnterioresMarchas;
	}

	public boolean isPartAnterioresMarchas() {
		return partAnterioresMarchas;
	}

	public void setPartAnterioresMarchas(boolean partAnterioresMarchas) {
		this.partAnterioresMarchas = partAnterioresMarchas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(partAnterioresMarchas);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mediana other = (Mediana) obj;
		return partAnterioresMarchas == other.partAnterioresMarchas;
	}

	@Override
	public String toString() {
		return "Mediana [partAnterioresMarchas=" + partAnterioresMarchas + ", getNombre()=" + getNombre()
				+ ", getNivel()=" + getNivel() + ", getFechaNacimiento()=" + getFechaNacimiento()
				+ ", isConfimacionInscripcion()=" + isConfirmacionInscripcion() + ", getCodigo()=" + getCodigo() + "]";
	}
	
}
