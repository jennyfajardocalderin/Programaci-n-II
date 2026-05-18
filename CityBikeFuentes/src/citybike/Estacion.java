package citybike;

import java.util.LinkedList;
import java.util.Objects;

public class Estacion {
	private String nombre;
	private int capacidad;
	private LinkedList<Bicicleta> bicicletas;
	
	public Estacion(String nombre, int capacidad, LinkedList<Bicicleta> bicicletas) {
		super();
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.bicicletas = bicicletas;
	}
	
	public Estacion(String nombre, int capacidad) {
		super();
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.bicicletas = new LinkedList<Bicicleta>();
	}
	
	public Estacion() {
		super();
		this.nombre = "NUEVA";
		this.capacidad = 10;
		this.bicicletas = new LinkedList<Bicicleta>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public LinkedList<Bicicleta> getBicicletas() {
		return bicicletas;
	}

	public void setBicicletas(LinkedList<Bicicleta> bicicletas) {
		this.bicicletas = bicicletas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estacion other = (Estacion) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Estacion [nombre=" + nombre + ", capacidad=" + capacidad + ", bicicletas=" + bicicletas + "]";
	}

	
}
