package deustospace;

/** Clase principal de la aplicación
 */
public class Principal {

	public static void main(String[] args) {
		DeustoSpace ds = new DeustoSpace();

		// TAREA 1A: cargarMisionesCSV
		// TODO descomentar cuando esté programada
		// ds.cargarMisionesCSV();
			
		// TAREA 1B: cargarPersonal
		// TODO descomentar cuando esté programada
		// ds.cargarPersonalCSV();
		
		// TAREA 1C: asignarPersonal
		// TODO descomentar cuando esté programado
		// ds.asignarPersonal();
		
		// DESCOMENTA ESTA LLAMADA SI NO HAS SABIDO HACER LAS TAREAS 1A+1B+1C
		//ds.datosIniciales();
		System.out.println(ds);
		
		// TAREA 2D: mostrar las misiones ordenadas por coste total
		// Con los datos iniciales debería mostrar primero la misión DS VI y luego II, IV, III y V 
		
		// TAREA 3A: costesPorPais
		// TODO descomentar cuando funcione
		// System.out.println(ds.costesPorPais());
		// Con los datos iniciales debería mostrar: {USA=134.0, Belgium=0.5, UK=1.6, Italy=1.5, France=178.1, Germany=1.1, Spain=3.0, Russia=38.0}
		// Con los datos del fichero debería mostrar: {USA=469.0, Switzerland=0.75, Spain=34.775000000000006, Russia=114.0, Austria=0.04999999999999999, Czech Republic=0.5, Sweden=0.07499999999999996, Belgium=8.0, UK=22.849999999999994, Poland=0.5, Italy=22.449999999999992, France=387.4, Germany=19.199999999999996}

		// TAREA 3B: paisMayorCoste
		ds.destinosPorCoste();
	}

}
