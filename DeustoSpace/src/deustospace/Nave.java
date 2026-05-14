package deustospace;

import java.io.Serializable;
import java.util.Objects;

/** Clase que permite crear objetos naves
 */
public class Nave implements Serializable {
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String proveedor;
	private double coste;
	private double carga;
	
	/** Crea una nave
	 * @param nombre	Nombre
	 * @param proveedor	Proveedor (fabricante)
	 * @param coste	En millones de euros
	 * @param carga	En kilogramos
	 */
	public Nave(String nombre, String proveedor, double coste, double carga) {
		super();
		this.nombre = nombre;
		this.proveedor = proveedor;
		this.coste = coste;
		this.carga = carga;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	// TAREA 2B: getCoste
	public double getCoste() {
		return coste;
	}

	public void setCoste(double coste) {
		this.coste = coste;
	}

	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}

	@Override
	public String toString() {
		return "Nave " + nombre + " (" + proveedor + "), " + coste + "M€, " + carga + "kg";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre, proveedor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nave other = (Nave) obj;
		return Objects.equals(nombre, other.nombre) && Objects.equals(proveedor, other.proveedor);
	}

	// TAREA 2A: Subvencionable
	
}
