package deustospace;

/** Clase que permite crear objetos de personas que trabajan como personal de tierra
 */
public class Tierra extends Personal {
	private static final long serialVersionUID = 1L;
	private int nivel;
	
	/** Crea un nuevo objeto personal de tierra
	 * @param nombre	Nombre
	 * @param pais	País de origen
	 * @param nivel	Nivel laboral del trabajador/a (de 1 a 5)
	 */
	public Tierra(String nombre, String pais, int nivel) {
		super(nombre, pais);
		this.nivel = nivel;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	@Override
	public String toString() {
		return "Personal de tierra " + getNombre() + " (" + getPais() + " nivel " + nivel + ")";
	}

	// TAREA 2B: getCoste

}
