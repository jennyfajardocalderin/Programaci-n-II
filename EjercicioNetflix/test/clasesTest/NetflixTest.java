package clasesTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import clases.datos.NetxflixProgramacion;
import clases.datos.Programa;

class NetflixTest {
	
	public NetxflixProgramacion netflix = new NetxflixProgramacion();
	
	@BeforeEach
	void setUp () {
		netflix.cargarDatosProgramas("netflix.csv");
	}

	@Test
	void testCargaDatos() {
		//fail("Not yet implemented");
		assertEquals(94, netflix.getListaProgramas().size(), "La lista deberia tener 94 registros");
	}
	
	@Test
	void testCantidadPorTipos () {
		HashMap<String, Integer> mapa = netflix.cantidadPorTipo();
		assertEquals(79, mapa.get("Movie"));
		assertEquals(15, mapa.get("TV Show"));
	}
	
	@Test
	void testClasificacionPaises() {
		HashMap<String, ArrayList<Programa>> mapaPaises = netflix.clasificacionPorPaises();
		
		assertEquals(21, mapaPaises.size());
		
		//Verificar contenidos del mapa
		assertTrue(mapaPaises.containsKey("Colombia"));
		assertTrue(mapaPaises.containsKey("Japan"));
		assertTrue(mapaPaises.containsKey("India"));
	
		//Verificar cantidad de programas por paises
		
		assertEquals(1, mapaPaises.get("Argentina").size(), "Deberia tener un solo programa");
	}

}
