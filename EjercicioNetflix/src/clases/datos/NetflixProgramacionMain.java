package clases.datos;

import java.util.ArrayList;
import java.util.HashMap;

public class NetflixProgramacionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NetxflixProgramacion netflix = new NetxflixProgramacion();
		netflix.cargarDatosProgramas("netflix.csv");
		for(Programa prog : netflix.getListaProgramas()) {
			System.out.println(prog);
		}
		System.out.println(netflix.getListaProgramas().size());
		
		System.out.println("---------------------------------");
		System.out.println("La cantidad de programas por tipo es: " + netflix.cantidadPorTipo());
		
		System.out.println("");
		System.out.println("---------------------------------");
		HashMap<String, ArrayList<Programa>> mapaPorPaises = netflix.clasificacionPorPaises();
		for (HashMap.Entry<String, ArrayList<Programa>> entry : mapaPorPaises.entrySet()) {
			String pais = entry.getKey();
			ArrayList<Programa> programas = entry.getValue();
			System.out.println(pais + ": " + programas);
		}
		
	}

}
