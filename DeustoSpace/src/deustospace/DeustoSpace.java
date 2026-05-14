package deustospace;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/** Clase de agencia espacial, contenedora de datos
 */
public class DeustoSpace implements Serializable {
	private static final long serialVersionUID = 1L;
	private ArrayList<Mision> misiones;
	private ArrayList<Personal> personal;
	
	/** Crea un objeto de agencia espacial, contenedor de datos de misiones y personal. Se inicia con la lista de misiones y personal vacías
	 */
	public DeustoSpace() {
		super();
		this.misiones = new ArrayList<Mision>();
		this.personal = new ArrayList<Personal>();
	}
	
	/** Crea un objeto de agencia espacial, contenedor de datos de misiones y personal.
	 * @param misiones	Misiones iniciales de la agencia
	 * @param personal	Personal inicial de la agencia
	 */
	public DeustoSpace(ArrayList<Mision> misiones, ArrayList<Personal> personal) {
		super();
		this.misiones = new ArrayList<Mision>(misiones);
		this.personal = new ArrayList<Personal>(personal);
	}

	public ArrayList<Mision> getMisiones() {
		return misiones;
	}

	public ArrayList<Personal> getPersonal() {
		return personal;
	}

	public void setPersonal(ArrayList<Personal> personal) {
		this.personal = personal;
	}

	@Override
	public String toString() {
		return "DeustoSpace [misiones=" + misiones + ", personal=" + personal + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(misiones);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DeustoSpace other = (DeustoSpace) obj;
		return Objects.equals(misiones, other.misiones);
	}
	
	/** Crea datos de prueba iniciales de la agencia: una serie de misiones y una lista de personal
	 */
	public void datosIniciales() {
		Mision m0 = new Mision("DS I", "Florida USA", "ISS", 2025, 3, 20);
		m0.setNave(new Nave("Falcon 9","SpaceX", 67, 22000));
		Mision m1 = new Mision("DS II", "Florida USA", "ISS", 2025, 7, 21);
		m1.setNave(new Nave("Falcon 9","SpaceX", 67, 22000));
		Mision m2 = new Mision("DS III", "Guayana Francesa", "Luna", 2026, 2, 12);
		m2.setNave(new Nave("Ariane 5","Arianespace", 178, 21000));
		Mision m3 = new Mision("DS IV", "Houston USA", "ISS", 2026, 3, 14);
		m3.setNave(new Nave("Falcon 9","SpaceX", 67, 22000));
		Mision m4 = new Mision("DS V", "Guayana Francesa", "Luna", 2027, 2, 12);
		m4.setNave(new Nave("Ariane 5","Arianespace", 178, 21000));
		Mision m5 = new Mision("DS VI", "Baikonur", "ISS", 2027, 3, 11);
		m5.setNave(new Nave("Soyuz", "Roscosmos", 38, 7020));
		personal.add(new Astronauta("Pablo Álvarez Fernández", "Spain", new ArrayList<Habilidad>(Arrays.asList(Habilidad.values()))));
		personal.add(new Astronauta("Sara García Alonso", "Spain", new ArrayList<Habilidad>(Arrays.asList(Habilidad.values()))));
		personal.add(new Astronauta("Andrea Patassa", "Italy", new ArrayList<Habilidad>(Arrays.asList(Habilidad.values()))));
		personal.add(new Tierra("Ana García", "Spain", 1));
		personal.add(new Tierra("Andrea Ors", "Italy", 1));
		personal.add(new Tierra("Laura Johnson", "UK", 1));
		personal.add(new Tierra("Andrea Johnson", "Spain", 1));
		personal.add(new Tierra("Mark Becker", "France", 1));
		personal.add(new Tierra("Ana García", "Spain", 2));
		personal.add(new Tierra("Andrea Ors", "Italy", 2));
		personal.add(new Tierra("Laura Johnson", "UK", 2));
		personal.add(new Tierra("John Becker", "Spain", 2));
		personal.add(new Tierra("Mark Bocelli", "Italy", 2));
		personal.add(new Tierra("Ana García", "Spain", 3));
		personal.add(new Tierra("Mark Ors", "Germany", 3));
		personal.add(new Tierra("John Johnson", "Spain", 3));
		personal.add(new Tierra("Laura Becker", "Germany", 3));
		personal.add(new Tierra("Andrea Bocelli", "Spain", 3));
		personal.add(new Tierra("Ana García", "Spain", 4));
		personal.add(new Tierra("Laura Ors", "UK", 4));
		personal.add(new Tierra("Mark Johnson", "Italy", 4));
		personal.add(new Tierra("Andrea Becker", "Spain", 4));
		personal.add(new Tierra("John Bocelli", "UK", 4));
		personal.add(new Tierra("Ana García", "Spain", 5));
		personal.add(new Tierra("Ana Ors", "Belgium", 5));
		personal.add(new Tierra("Ana Johnson", "UK", 5));
		personal.add(new Tierra("Ana Becker", "Germany", 5));
		personal.add(new Tierra("Ana Bocelli", "Italy", 5));
		m1.setPersonal(personal);
		m2.setPersonal(personal);
		m3.setPersonal(personal);
		m4.setPersonal(personal);
		m5.setPersonal(personal);
		misiones.add(m0);
		misiones.add(m1);
		misiones.add(m2);
		misiones.add(m3);
		misiones.add(m4);
		misiones.add(m5);
	}

	// TAREA 1A: cargarMisionesCSV
	public void cargarMisionesCSV() {
		// TODO tarea 1a
	}

	// TAREA 1B: cargarPersonalCSV
	public void cargarPersonalCSV() {
		// TODO tarea 1a
	}

	// TAREA 1C: asignarPersonal
	public void asignarPersonal() {
		// TODO tarea 1a
	}
	
	// TAREA 3A: costesPorPais
	// public ... costesPorPais() {
	// TODO tarea 3a

	// TAREA 3B: destinosPorCoste
	public void destinosPorCoste() {
		// TODO tarea 3b
	}

}
