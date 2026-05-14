package clases.datos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class NetxflixProgramacion {

	private ArrayList<Programa> listaProgramas = new ArrayList<>();
	
	
	public NetxflixProgramacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Programa> getListaProgramas() {
		return listaProgramas;
	}

	public void setListaProgramas(ArrayList<Programa> listaProgramas) {
		this.listaProgramas = listaProgramas;
	}
	
	public void cargarDatosProgramas (String ruta) {
		File file = new File (ruta);
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()) {
				String [] datos = sc.nextLine().split(",");
				Programa programa = null;
				if(datos[6].equals("Movie"))
					programa = new Movie(datos[0], datos[1], datos[2], Integer.valueOf(datos[3]), datos[4], Integer.valueOf(datos[5]));
				else programa = new TVShow(datos[0], datos[1], datos[2], Integer.valueOf(datos[3]), datos[4], Integer.valueOf(datos[5]));
				listaProgramas.add(programa);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public HashMap<String, Integer> cantidadPorTipo (){
		HashMap<String, Integer> mapaPorTipo = new HashMap<String, Integer>();
		for(Programa prog : this.listaProgramas) {
			if(prog instanceof Movie) {
				if(!mapaPorTipo.containsKey("Movie"))
					mapaPorTipo.put("Movie", 0);
				mapaPorTipo.put("Movie", mapaPorTipo.get("Movie") + 1);
			} else {
				if(!mapaPorTipo.containsKey("TV Show"))
					mapaPorTipo.put("TV Show", 0);
				mapaPorTipo.put("TV Show", mapaPorTipo.get("TV Show") + 1);
			}
		}
		return mapaPorTipo;
	}
	
	public HashMap<String, ArrayList<Programa>> clasificacionPorPaises(){
		HashMap<String, ArrayList<Programa>> mapaPorPaises = new HashMap<String, ArrayList<Programa>>();
		for(Programa prog : this.listaProgramas) {
			if(!mapaPorPaises.containsKey(prog.getPais()))
				mapaPorPaises.put(prog.getPais(), new ArrayList<Programa>());
			mapaPorPaises.get(prog.getPais()).add(prog);
		}
		return mapaPorPaises;
	}
	
	
	
}
