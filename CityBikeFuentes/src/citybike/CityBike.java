package citybike;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.TreeSet;

public class CityBike {
	private ArrayList<Cliente> clientes;
	private ArrayList<Bicicleta> bicicletas;
	private TreeSet<Estacion> estaciones;
	
	public CityBike(ArrayList<Cliente> clientes, ArrayList<Bicicleta> bicicletas, TreeSet<Estacion> estaciones) {
		super();
		this.clientes = clientes;
		this.bicicletas = bicicletas;
		this.estaciones = estaciones;
	}
	
	public CityBike() {
		super();
		this.clientes = new ArrayList<Cliente>();
		this.bicicletas = new ArrayList<Bicicleta>();
		this.estaciones = new TreeSet<Estacion>();
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public ArrayList<Bicicleta> getBicicletas() {
		return bicicletas;
	}

	public void setBicicletas(ArrayList<Bicicleta> bicicletas) {
		this.bicicletas = bicicletas;
	}

	public TreeSet<Estacion> getEstaciones() {
		return estaciones;
	}

	public void setEstaciones(TreeSet<Estacion> estaciones) {
		this.estaciones = estaciones;
	}

	@Override
	public String toString() {
		return "CityBike [clientes=" + clientes + ", bicicletas=" + bicicletas + ", estaciones=" + estaciones + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(estaciones);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CityBike other = (CityBike) obj;
		return Objects.equals(estaciones, other.estaciones);
	}
		
	public void cargarClientes(String ruta) {
		// TAREA 2A
	}
	
	public Estacion buscarEstacionNombre(String nombre) {
		// TAREA 2B
		return null;
	}

	public void cargarBicletasCSV(String ruta) {
		// TAREA 2C
	}
	
	public void simularReservas() {
		// TAREA 3A
	}
	
	public HashMap<Cliente, Double> calcularCostesPorCliente() {
		// TAREA 3B
		return null;
	}
	
	public Cliente clienteMayorCoste(HashMap<Cliente, Double> mapa) {
		// TAREA 3C
		return null;
	}
	
	public int recolocarBicicletas() {
		// TAREA EXTRA
		return 0;
	}

	public void generarDatosIniciales() {
		for (int i = 0; i < 9; i++) {
			estaciones.add(new Estacion("ESTACION"+(i+1), (int) (Math.random() * 16) + 16, null));
		}
		for (int i = 0; i < 20; i++) {
			clientes.add(new Cliente("6100330"+i, TipoCliente.values()[(int) (Math.random() * TipoCliente.values().length)]));
		}
		Estacion e = new Estacion("ESTACION1", (int) (Math.random() * 16) + 16);
		for (int i = 0; i < 200; i++) {
			if (i % 20 == 0) {
				e = new Estacion("ESTACION"+(i%20+1), (int) (Math.random() * 16) + 16);
				estaciones.add(e);
			}
			Bicicleta b;
			if (Math.random() > 0.5) {
				b = new Mecanica(true);
			} else {
				b = new Electrica(true, Math.random() * 50 + 50);
			}
			e.getBicicletas().add(b);
			bicicletas.add(b);
		}		
	}
	
}
