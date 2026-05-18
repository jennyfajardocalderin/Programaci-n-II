package citybike;

import java.util.ArrayList;
import java.util.Objects;

public class Cliente {
	private String telefono;
	private TipoCliente tipo;
	private ArrayList<Reserva> reservas;
	
	public Cliente(String telefono, TipoCliente tipo, ArrayList<Reserva> reservas) {
		super();
		this.telefono = telefono;
		this.tipo = tipo;
		this.reservas = reservas;
	}
	
	public Cliente(String telefono, TipoCliente tipo) {
		super();
		this.telefono = telefono;
		this.tipo = tipo;
		this.reservas = new ArrayList<Reserva>();
	}
	
	public Cliente(String telefono) {
		super();
		this.telefono = telefono;
		this.tipo = TipoCliente.ADULTO;
		this.reservas = new ArrayList<Reserva>();
	}
	
	public Cliente() {
		super();
		this.telefono = "";
		this.tipo = TipoCliente.ADULTO;
		this.reservas = new ArrayList<Reserva>();
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public TipoCliente getTipo() {
		return tipo;
	}

	public void setTipo(TipoCliente tipo) {
		this.tipo = tipo;
	}

	public ArrayList<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(ArrayList<Reserva> reservas) {
		this.reservas = reservas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(telefono);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(telefono, other.telefono);
	}

	@Override
	public String toString() {
		return "Cliente [telefono=" + telefono + ", tipo=" + tipo + ", reservas=" + reservas.size() + "]";
	}
	
}
