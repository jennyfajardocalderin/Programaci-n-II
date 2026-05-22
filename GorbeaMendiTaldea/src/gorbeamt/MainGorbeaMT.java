package gorbeamt;


public class MainGorbeaMT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		GorbeaMT gorbeaMT = new GorbeaMT();
//		
//		gorbeaMT.cargarVoluntarios("voluntarios.csv");
//		System.out.println("El total de voluntarios es: " + gorbeaMT.getListaVoluntarios().size());
//		
//		gorbeaMT.cargarParticipantes("participantes.csv");
//		gorbeaMT.cargarParticipantes("participantes_errores.csv");
//		System.out.println("El total de participantes inscritos es: " + gorbeaMT.getListaParticipantes().size());
//		
//		System.out.println("--------------Lista avituallamientos--------------");
//		gorbeaMT.generarAvituallamientos();
//		int contLiquido = 0;
//		int contSolido = 0;
//		int contMixto = 0;
//		for (Avituallamiento avi : gorbeaMT.getListaAvituallamientos()) {
//			System.out.println(avi);
//			if (avi.getTipoAvituallamiento().equals(TipoAvituallamiento.Liquido))
//				contLiquido++;
//			else if (avi.getTipoAvituallamiento().equals(TipoAvituallamiento.Solido))
//				contSolido++;
//			else
//				contMixto++;
//		}
//		System.out.println(gorbeaMT.getListaAvituallamientos().size()); //Debe mostrar 15
//		System.out.println("Líquido: " + contLiquido + " Sólido: " + contSolido + " Mixto: " + contMixto); //Líquido: 5 Sólido: 5 Mixto: 5
//		
//		System.out.println("");
//		System.out.println("--------------Mapa por niveles--------------");
//		// El resultado debe ser: {Bajo=42, Alto=91, Medio=107}
//		System.out.println(gorbeaMT.nivelesParticipacion()); 
//		
//		System.out.println("");
//		System.out.println("--------------Paricipantes por recorrido--------------");
//		System.out.println(gorbeaMT.participantesPorTipo());
//		System.out.println(gorbeaMT.participantesPorTipo().get("Familiar").size()); //95
//		System.out.println(gorbeaMT.participantesPorTipo().get("Mediana").size()); //80 
//		System.out.println(gorbeaMT.participantesPorTipo().get("Larga").size()); //65
//
//		
//		System.out.println("");
//		System.out.println("--------------Subvencionables--------------");
//		Set<Subvencionable> subvencionables = gorbeaMT.todosSubvencionables();
//		System.out.println(subvencionables);
//		
//		System.out.println("");
//		System.out.println("--------------Simulacion MARCHA 2025--------------");
//		System.out.println("Pos" + "  " + "Nombre                " + "Recorrido   " + "Tiempo  ");
//		ArrayList<Llegada> llegadas = gorbeaMT.simularMarcha();
//		for (int i = 0; i < llegadas.size(); i++) {
//			if(llegadas.get(i).getParticipante() instanceof Larga)
//				System.out.println(i + 1 + "  " + llegadas.get(i).getParticipante().getNombre() +  "        " + "Larga   " + llegadas.get(i).getTiempoLlegada());
//			else if(llegadas.get(i).getParticipante() instanceof Mediana)
//				System.out.println(i + 1 + "  " + llegadas.get(i).getParticipante().getNombre() +  "        " + "Mediana " + llegadas.get(i).getTiempoLlegada());
//			else System.out.println(i + 1 + "  " + llegadas.get(i).getParticipante().getNombre() +  "        " + "Corta   " + llegadas.get(i).getTiempoLlegada());
//		}
		
	}

}
