package citybike;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		CityBike ct = new CityBike();

		// Descomenta esta llamada si sabes hacer la TAREA 2:
		//ct.generarDatosIniciales();
		
		// TAREA 2A
		//ct.cargarClientes("clientes.dat");
		//System.out.println("Clientes cargados = " + ct.getClientes());
		
		// TAREA 2C
		//ct.cargarBicletasCSV("bicicletas.csv");
		//System.out.println("Bicicletas cargadas = " + ct.getBicicletas());
		//System.out.println("Estaciones cargadas = " + ct.getEstaciones());
				
		// Creamos una bicicleta nueva para ver si el contador está correctamete actualizado
		// Debería mostrar una bicicleta mecánica con código M201
		//System.out.println(new Mecanica());
		
		// TAREA 3A
		//ct.simularReservas();
		// Mostramos las reservas del primer cliente
		// System.out.println(ct.getClientes().get(0));

		// TAREA 3B
		//System.out.println(ct.calcularCostesPorCliente());
		
		// TAREA EXTRA
		//ct.recolocarBicicletas();

	}

}
