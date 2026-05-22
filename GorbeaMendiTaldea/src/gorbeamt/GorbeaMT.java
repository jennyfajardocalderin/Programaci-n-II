package gorbeamt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class GorbeaMT {

	private ArrayList<Participante> listaParticipantes;
	private TreeSet<Avituallamiento> listaAvituallamientos;
	private ArrayList<Voluntario> listaVoluntarios;
	
	public GorbeaMT() {
		super();
		listaParticipantes = new ArrayList<Participante>();
		listaAvituallamientos = new TreeSet<Avituallamiento>();
		listaVoluntarios = new ArrayList<Voluntario>();
	}
	public GorbeaMT(ArrayList<Participante> listaParticipantes, TreeSet<Avituallamiento> listaAvituallamientos,
			ArrayList<Voluntario> listaVoluntarios) {
		super();
		this.listaParticipantes = listaParticipantes;
		this.listaAvituallamientos = listaAvituallamientos;
		this.listaVoluntarios = listaVoluntarios;
	}
	public ArrayList<Participante> getListaParticipantes() {
		return listaParticipantes;
	}
	public void setListaParticipantes(ArrayList<Participante> listaParticipantes) {
		this.listaParticipantes = listaParticipantes;
	}
	public TreeSet<Avituallamiento> getListaAvituallamientos() {
		return listaAvituallamientos;
	}
	public void setListaAvituallamientos(TreeSet<Avituallamiento> listaAvituallamientos) {
		this.listaAvituallamientos = listaAvituallamientos;
	}
	public ArrayList<Voluntario> getListaVoluntarios() {
		return listaVoluntarios;
	}
	public void setListaVoluntarios(ArrayList<Voluntario> listaVoluntarios) {
		this.listaVoluntarios = listaVoluntarios;
	}


	//Tarea 2A: cargarVoluntarios(String ruta) 
	public void cargarVoluntarios(String ruta) {

	}

	//Tarea 2B: cargarParticipantes(String ruta) 

	public void cargarParticipantes(String ruta) {

	}
	
	//Tarea 2C: generarAvituallamientos()
	public void generarAvituallamientos() {
		
	}
	
	//Tarea 3A: nivelesParticipacion()
	
	public HashMap<NivelParticipante, Integer> nivelesParticipacion(){
			
		return null;
	}
	
	//Tarea 3B: participantesPorRecorrido()
	
	public HashMap<String, ArrayList<Participante>> participantesPorTipo(){
		
		return null;
	}
	
	//Tarea 3C: todosSubvencionables() 
	
//	public Set<Subvencionable> todosSubvencionables() {
//		
//		return null;
//	}
	
	//Tarea 3D: simularMarcha()
	
//	public ArrayList<Llegada> simularMarcha() {
//		
//		 return null;
//		
//	}
	
}
