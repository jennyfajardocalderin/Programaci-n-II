package gorbeamt;

import java.util.Objects;

public class Avituallamiento {
	
	private int kilometro;
	private TipoAvituallamiento tipoAvituallamiento;
	private Voluntario responsable;
	public Avituallamiento() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Avituallamiento(int kilometro, TipoAvituallamiento tipoAvituallamiento, Voluntario responsable) {
		super();
		this.kilometro = kilometro;
		this.tipoAvituallamiento = tipoAvituallamiento;
		this.responsable = responsable;
	}
	public int getKilometro() {
		return kilometro;
	}
	public void setKilometro(int kilometro) {
		this.kilometro = kilometro;
	}
	public TipoAvituallamiento getTipoAvituallamiento() {
		return tipoAvituallamiento;
	}
	public void setTipoAvituallamiento(TipoAvituallamiento tipoAvituallamiento) {
		this.tipoAvituallamiento = tipoAvituallamiento;
	}
	public Voluntario getResponsable() {
		return responsable;
	}
	public void setResponsable(Voluntario responsable) {
		this.responsable = responsable;
	}
	@Override
	public int hashCode() {
		return Objects.hash(kilometro, responsable, tipoAvituallamiento);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Avituallamiento other = (Avituallamiento) obj;
		return kilometro == other.kilometro && Objects.equals(responsable, other.responsable)
				&& tipoAvituallamiento == other.tipoAvituallamiento;
	}
	@Override
	public String toString() {
		return "Avituallamiento [kilometro=" + kilometro + ", tipoAvituallamiento=" + tipoAvituallamiento
				+ ", responsable=" + responsable + "]";
	}
	
}
