package deustospace;

import static org.junit.jupiter.api.Assertions.*;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class MisionTest {

	@Test
	void testConstructor() {
		//fail("Not yet implemented");
		Mision mi = new Mision("M1", "LU1", "D1", 2025, 5, 18);
		assertEquals(mi.getNombre(), "M1");
		assertEquals(mi.getLugar(), "LU1");
		assertEquals(mi.getDestino(), "D1");
		assertEquals(mi.getFecha(), LocalDate.of(2025, 5, 18));
		assertEquals(mi.getNave(), null);
		assertEquals(mi.getPersonal().size(), 0);
		
		try {
			new Mision("M1", "LU1", "D1", 2025, 30, 18);
		} catch (DateTimeException e) {
			// TODO: handle exception
			//e.printStackTrace();
			System.out.println("La fecha de creacion es invalida");
		}
	}
	
	@Test
	void testCostoTotal () {
		// Mision sin personal y nave costo cero
		Mision m1 = new Mision("M1", "LU1", "D1", 2025, 5, 18);
		assertEquals(m1.getCosteTotal(), 1.5);
		
		// Mision sin personal y nave con costo
		m1.setNave(new Nave("Nave", "Prov", 100, 0));
		assertEquals(m1.getCosteTotal(), 101.5);
		
		// Mision con nave anterior y un astronauta sin habilidades
		Astronauta a1 = new Astronauta("Astronauta1", "P1");
		m1.getPersonal().add(a1);
		assertEquals(m1.getCosteTotal(), 101.5);
		
		// Mision con nave y un astronauta con habilidades
		ArrayList<Habilidad> listaHab = new ArrayList<Habilidad>();
		listaHab.add(Habilidad.INGENIERIA);
		listaHab.add(Habilidad.MEDICINA);
		a1.setHabilidades(listaHab);
		assertEquals(m1.getCosteTotal(), 102);
		
		// Mision con astronauta con habilidades sub
		a1.getHabilidades().add(Habilidad.INVESTIGACION);
		assertEquals(m1.getCosteTotal(), 101.575);
		
		// Mision con dos personal tierra uno con nivel 1 y otro con nivel 2
		Tierra t1 = new Tierra("Tierra1", "P1", 1);
		Tierra t2 = new Tierra("Tierra2", "P1", 2);
		m1.getPersonal().add(t1);
		m1.getPersonal().add(t2);
		assertEquals(m1.getCosteTotal(), 102.025);
		
	}

}
