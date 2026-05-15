package deustospace;

import java.awt.image.AffineTransformOp;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

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
		File file = new File("misiones.csv");
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNext()) {
				String [] datos = sc.nextLine().split(";");
				if(datos.length < 10) {
					System.out.println("Faltan Datos");
				} else {
					boolean ok = true;
					String nombreMision = datos[0];
					String lugar = datos[1];
					String destino = datos[2];
					int anno = 0;
					int mes = 0;
					int dia = 0;
					
					String nombreNave = datos[6];
					String proveedor = datos[7];
					double costo = 0.0;
					double carga = 0.0;
					try {
						dia = Integer.valueOf(datos[3]);
						mes = Integer.valueOf(datos[4]);
						anno = Integer.valueOf(datos[5]);
						costo = Double.valueOf(datos[8]);
						carga = Double.valueOf(datos[9]);
					} catch (NumberFormatException e) {
						// TODO: handle exception
						System.out.println("Error: datos entero o real es eroneo");
						ok = false;
					}
					if(ok) {
						Nave nave = new Nave(nombreNave, proveedor, costo, carga);
						Mision mision = new Mision(nombreMision, lugar, destino, anno, mes, dia);
						mision.setNave(nave);
						this.misiones.add(mision);
					}
				}
			}
			
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	// TAREA 1B: cargarPersonalCSV
	public void cargarPersonalCSV() {
		// TODO tarea 1a
		File file = new File("personal.csv");
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()) {
				String[] datos = sc.nextLine().split(";");
				
				String tipo = datos[0];
				String nombre = datos[1];
				String pais = datos[2];
				Personal per;
				if(tipo.equals("Astronauta")) {
					ArrayList<Habilidad> habilidades = new ArrayList<Habilidad>();
					String[] listaHab = datos[3].split(",");
					for(String hb : listaHab) {
						habilidades.add(Habilidad.valueOf(hb));
					}
					per = new Astronauta(nombre, pais, habilidades);
				} else {
					per = new Tierra(nombre, pais, Integer.valueOf(datos[3]));
				}
				this.personal.add(per);	
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	// TAREA 1C: asignarPersonal
	public void asignarPersonal() {
		// TODO tarea 1c
		for(Mision mision : this.misiones) {
			if(mision.getPersonal().size() == 0) {
				ArrayList<Tierra> personalTierra = new ArrayList<Tierra>();
				ArrayList<Astronauta> personalAstronauta = new ArrayList<Astronauta>();
				for(Personal per : this.personal) {
					if(per instanceof Astronauta)
						personalAstronauta.add((Astronauta) per);
					else personalTierra.add((Tierra) per);
				}
				Collections.shuffle(personalTierra);
				for (int i = 0; i < 25; i++) {
					mision.getPersonal().add(personalTierra.get(i));
				}
				
				Collections.shuffle(personalAstronauta);
				boolean pilotar = false;
				int pos = 0;
				while (pilotar == false && pos < personalAstronauta.size()) {
					if(personalAstronauta.get(pos).getHabilidades().contains(Habilidad.PILOTAR))
						pilotar = true;
					else pos ++;
				}
				mision.getPersonal().add(personalAstronauta.get(pos));
				int cant = 0;
				while(cant < 2) {
					Astronauta astronauta;
					int ale = (int) (Math.random() * personalAstronauta.size());
					if(!mision.getPersonal().contains(personalAstronauta.get(ale))) {
						astronauta = personalAstronauta.get(ale);
						mision.getPersonal().add(astronauta);
						cant++;
					}
				}
			}
		}
	}
	
	// TAREA 3A: costesPorPais
	public HashMap<String, Double> costesPorPais() {
		HashMap<String, Double> mapaCostePais = new HashMap<String, Double>();
		//coste de personal
		for(Personal pe : this.personal) {
			if(!mapaCostePais.containsKey(pe.getPais()))
				mapaCostePais.put(pe.getPais(), 0.0);
			mapaCostePais.put(pe.getPais(), mapaCostePais.get(pe.getPais()) + pe.getCoste());
		}
		//coste misiones
		for(Mision mi : this.misiones) {
			Nave nave = mi.getNave();
			String pais = "";
			if(nave != null) {
				if(nave.getProveedor().equals("Arianespace"))
					pais = "France";
				else if(nave.getProveedor().equals("SpaceX"))
					pais = "USA";
				else if(nave.getProveedor().equals("Roscosmos"))
					pais = "Russia";
				if(!mapaCostePais.containsKey(pais))
					mapaCostePais.put(pais, 0.0);
				else mapaCostePais.put(pais, mapaCostePais.get(pais) + nave.getCoste());
			}
		}
		return mapaCostePais;
	}
	// TODO tarea 3a

	// TAREA 3B: destinosPorCoste
	public void destinosPorCoste() {
		// TODO tarea 3b
		TreeMap<String, TreeSet<Mision>> mapa = new TreeMap<String, TreeSet<Mision>>();
		for(Mision mi : this.misiones) {
			if(!mapa.containsKey(mi.getDestino()))
				mapa.put(mi.getDestino(), new TreeSet<Mision>());
			mapa.get(mi.getDestino()).add(mi);
		}
		
		for(String destino : mapa.keySet()) {
			TreeSet<Mision> misionesDestino = mapa.get(destino);
			System.out.println("Mision a: " + destino + " ....");
			for(Mision mi: misionesDestino) {
				System.out.println(mi);
			}
			
		}
	}

}
