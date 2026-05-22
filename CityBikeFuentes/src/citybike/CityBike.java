package citybike;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeSet;

public class CityBike {
	private ArrayList<Cliente> clientes;
	private ArrayList<Bicicleta> bicicletas;
	private TreeSet<Estacion> estaciones;
	
	public CityBike(ArrayList<Cliente> clientes, ArrayList<Bicicleta> bicicletas, TreeSet<Estacion> estaciones) {
		super();
		this.clientes = clientes;
		this.bicicletas = bicicletas;
		this.estaciones = estaciones;
	}
	
	public CityBike() {
		super();
		this.clientes = new ArrayList<Cliente>();
		this.bicicletas = new ArrayList<Bicicleta>();
		this.estaciones = new TreeSet<Estacion>();
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public ArrayList<Bicicleta> getBicicletas() {
		return bicicletas;
	}

	public void setBicicletas(ArrayList<Bicicleta> bicicletas) {
		this.bicicletas = bicicletas;
	}

	public TreeSet<Estacion> getEstaciones() {
		return estaciones;
	}

	public void setEstaciones(TreeSet<Estacion> estaciones) {
		this.estaciones = estaciones;
	}

	@Override
	public String toString() {
		return "CityBike [clientes=" + clientes + ", bicicletas=" + bicicletas + ", estaciones=" + estaciones + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(estaciones);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CityBike other = (CityBike) obj;
		return Objects.equals(estaciones, other.estaciones);
	}
		
	@SuppressWarnings("unchecked")
	public void cargarClientes(String ruta) {
		// TAREA 2A
		File file = new File(ruta);
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			this.clientes = (ArrayList<Cliente>) ois.readObject();
			ois.close();
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public Estacion buscarEstacionNombre(String nombre) {
		// TAREA 2B
		Estacion estacion = null;
		boolean encontrar = false;
		Iterator<Estacion> iterator = estaciones.iterator();
		while(encontrar == false && iterator.hasNext()) {
			Estacion est = iterator.next();
			if(est.getNombre().equals(nombre)) {
				encontrar = true;
				estacion = est;
			}
		}
		
		/*int pos = 0;
		ArrayList<Estacion> listaEstaciones = new ArrayList<Estacion>(estaciones);
		while(encontrar == false && pos < listaEstaciones.size()) {
			if(listaEstaciones.get(pos).getNombre().equals(nombre)) {
				encontrar = true;
				estacion = listaEstaciones.get(pos);
			} else pos++;
		}*/
		return estacion;
	}

	public void cargarBicletasCSV(String ruta) {
		// TAREA 2C
		File file = new File(ruta);
		try {
			Scanner sc = new Scanner(file);
			int mayorCodigoLeido = 0;
			while(sc.hasNextLine()) {
				String [] datos = sc.nextLine().split(";");
				try {
					Bicicleta bi = null;
					if(datos[1].equals("ELECTRICA")) {
						bi = new Electrica(Boolean.valueOf(datos[2]), Double.valueOf(datos[3]));
					} else {
						bi = new Mecanica(Boolean.valueOf(datos[2]));
					}
					mayorCodigoLeido = Integer.valueOf(datos[0].substring(1));
					this.bicicletas.add(bi);
					Estacion estacion = buscarEstacionNombre(datos[4]);
					if(estacion == null) {
						estacion = new Estacion(datos[4], Integer.valueOf(datos[5]));
						this.estaciones.add(estacion);
					}
					estacion.getBicicletas().add(bi);
				} catch (IndexOutOfBoundsException e) {
					// TODO: handle exception
					System.out.println("Faltan datos");
				} catch (NumberFormatException e) {
					// TODO: handle exception
					System.out.println("Un dato numerico es erroneo");
				}
			}
			Bicicleta.setContador(mayorCodigoLeido + 1);
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void simularReservas() {
		// TAREA 3A
		ArrayList<Estacion> estacionesTodas = new ArrayList<Estacion>(this.estaciones);
		for (int i = 0; i < 30; i++) {
			LocalDate fecha = LocalDate.of(2025, 6, i+1);
			for (int j = 0; j < 100; j++) {
				int posCliente = (int) (Math.random()*this.clientes.size());
				boolean encontrarOrigen = false;
				Estacion origen = null;
				while(encontrarOrigen == false) {
					int posOrigen = (int) (Math.random()*estacionesTodas.size());
					if(!estacionesTodas.get(posOrigen).getBicicletas().isEmpty()) {
						origen = estacionesTodas.get(posOrigen);
						encontrarOrigen = true;
					}
				}
				Bicicleta bi = origen.getBicicletas().removeFirst();
				int posDestino = (int) (Math.random()*estacionesTodas.size());
				Estacion destino = estacionesTodas.get(posDestino);
				destino.getBicicletas().add(bi);
				Reserva reserva = new Reserva(this.clientes.get(posCliente), bi, fecha, fecha, origen, destino);
				this.clientes.get(posCliente).getReservas().add(reserva);
			}
		}
		System.out.println("Simulacion de reservas terminada");
	}
	
	public HashMap<Cliente, Double> calcularCostesPorCliente() {
		// TAREA 3B
		return null;
	}
	
	public Cliente clienteMayorCoste(HashMap<Cliente, Double> mapa) {
		// TAREA 3C
		return null;
	}
	
	public int recolocarBicicletas() {
		// TAREA EXTRA
		return 0;
	}

	public void generarDatosIniciales() {
		for (int i = 0; i < 9; i++) {
			estaciones.add(new Estacion("ESTACION"+(i+1), (int) (Math.random() * 16) + 16, null));
		}
		for (int i = 0; i < 20; i++) {
			clientes.add(new Cliente("6100330"+i, TipoCliente.values()[(int) (Math.random() * TipoCliente.values().length)]));
		}
		Estacion e = new Estacion("ESTACION1", (int) (Math.random() * 16) + 16);
		for (int i = 0; i < 200; i++) {
			if (i % 20 == 0) {
				e = new Estacion("ESTACION"+(i%20+1), (int) (Math.random() * 16) + 16);
				estaciones.add(e);
			}
			Bicicleta b;
			if (Math.random() > 0.5) {
				b = new Mecanica(true);
			} else {
				b = new Electrica(true, Math.random() * 50 + 50);
			}
			e.getBicicletas().add(b);
			bicicletas.add(b);
		}		
	}
	
}
