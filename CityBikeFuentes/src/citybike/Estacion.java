package citybike;

import java.util.LinkedList;
import java.util.Objects;

public class Estacion  implements Recargable, Comparable<Estacion>{
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
	
	// 1B

	@Override
	public double getBateria() {
		// TODO Auto-generated method stub
		double promedio = 0.0;
		int cantidad = 0;
		for(Bicicleta bi : this.bicicletas) {
			if(bi instanceof Electrica) {
				promedio = promedio + ((Electrica) bi).getBateria();
				cantidad++;
			}
		}
		promedio = promedio / cantidad;
		return promedio;
	}

	@Override
	public void recargar() {
		// TODO Auto-generated method stub
		for(Bicicleta bi : this.bicicletas) {
			if(bi instanceof Electrica)
				((Electrica) bi).setBateria(100);
		}
	}

	// 1C
	@Override
	public int compareTo(Estacion o) {
		// TODO Auto-generated method stub
		return this.nombre.compareToIgnoreCase(o.getNombre());
	}

	
}
