package citybike;

import java.time.LocalDate;
import java.util.Objects;

public class Reserva {
	private Cliente cliente;
	private Bicicleta bicicleta;
	private LocalDate inicio;
	private LocalDate fin;
	private Estacion origen;
	private Estacion destino;
	
	public Reserva(Cliente cliente, Bicicleta bicicleta, LocalDate inicio, LocalDate fin, Estacion origen,
			Estacion destino) {
		super();
		this.cliente = cliente;
		this.bicicleta = bicicleta;
		this.inicio = inicio;
		this.fin = fin;
		this.origen = origen;
		this.destino = destino;
	}
	
	public Reserva(Cliente cliente, Bicicleta bicicleta, LocalDate inicio, Estacion origen) {
		super();
		this.cliente = cliente;
		this.bicicleta = bicicleta;
		this.inicio = inicio;
		this.fin = null;
		this.origen = origen;
		this.destino = null;
	}
	
	public Reserva() {
		super();
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Bicicleta getBicicleta() {
		return bicicleta;
	}

	public void setBicicleta(Bicicleta bicicleta) {
		this.bicicleta = bicicleta;
	}

	public LocalDate getInicio() {
		return inicio;
	}

	public void setInicio(LocalDate inicio) {
		this.inicio = inicio;
	}

	public LocalDate getFin() {
		return fin;
	}

	public void setFin(LocalDate fin) {
		this.fin = fin;
	}

	public Estacion getOrigen() {
		return origen;
	}

	public void setOrigen(Estacion origen) {
		this.origen = origen;
	}

	public Estacion getDestino() {
		return destino;
	}

	public void setDestino(Estacion destino) {
		this.destino = destino;
	}

	@Override
	public String toString() {
		return "Reserva [cliente=" + cliente + ", bicicleta=" + bicicleta + ", inicio=" + inicio + ", fin=" + fin
				+ ", origen=" + origen + ", destino=" + destino + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(bicicleta, cliente, inicio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reserva other = (Reserva) obj;
		return Objects.equals(bicicleta, other.bicicleta) && Objects.equals(cliente, other.cliente)
				&& Objects.equals(inicio, other.inicio);
	}
	
}
