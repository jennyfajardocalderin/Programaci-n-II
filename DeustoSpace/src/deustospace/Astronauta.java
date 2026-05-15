package deustospace;

import java.util.ArrayList;

/** Clase que permite crear objetos astronautas
 */
public class Astronauta extends Personal implements Subvencionable{
	private static final long serialVersionUID = 1L;
	private ArrayList<Habilidad> habilidades;

	/** Crea un astronauta
	 * @param nombre	Nombre
	 * @param pais	País
	 * @param habilidades	Lista de habilidades
	 */
	public Astronauta(String nombre, String pais, ArrayList<Habilidad> habilidades) {
		super(nombre, pais);
		this.habilidades = new ArrayList<Habilidad>(habilidades);
	}
	
	public Astronauta(String nombre, String pais) {
		super(nombre, pais);
		this.habilidades = new ArrayList<Habilidad>();
	}

	public ArrayList<Habilidad> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(ArrayList<Habilidad> habilidades) {
		this.habilidades = habilidades;
	}

	@Override
	public String toString() {
		return "Astronauta " + getNombre() + " (" + getPais() + "): " + habilidades;
	}

	// TAREA 2A: Subvencionable
	@Override
	public boolean esSubvencionable() {
		// TODO Auto-generated method stub
		return (this.habilidades.contains(Habilidad.INVESTIGACION));
	}

	@Override
	public double getPorcentaje() {
		// TODO Auto-generated method stub
		if(esSubvencionable())
			return 90;
		else return 0;
	}

	// TAREA 2B: getCoste
	@Override
	public double getCoste() {
		// TODO Auto-generated method stub
		double coste = this.habilidades.size()*0.25;
		if(this.esSubvencionable())
			coste = coste - (coste*getPorcentaje()/100);
		return coste;
	}

	
	
}
