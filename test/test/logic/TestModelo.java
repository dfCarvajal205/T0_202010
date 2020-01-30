package test.logic;

import static org.junit.Assert.*;
import model.logic.Modelo;

import org.junit.Before;
import org.junit.Test;

public class TestModelo {
	
	private Modelo modelo;
	private static int CAPACIDAD=100;
	
	@Before
	public void setUp1() {
		modelo= new Modelo(CAPACIDAD);
	}

	public void setUp2() {
		for(int i =0; i< CAPACIDAD;i++){
			modelo.agregar(""+i);
		}
	}

	@Test
	public void testModelo() {
		assertTrue(modelo!=null);
		assertEquals(0, modelo.darTamano());  // Modelo con 0 elementos presentes.
	}

	@Test
	public void testDarTamano1() {
		// 
		setUp1();
		assertEquals(100, modelo.retornarDatos().darCapacidad());
	}
	
	@Test
	public void testDarTamano2() {
		setUp2();
		assertEquals(100, modelo.retornarDatos().darCapacidad());
	}

	@Test
	public void testAgregar() {
		// TODO Completar la prueba
		setUp2();
		modelo.agregar("chocolate");
		assertEquals(200, modelo.retornarDatos().darCapacidad());
		assertEquals(101, modelo.retornarDatos().darTamano());
		
		
	}

	@Test
	public void testBuscar() {
		setUp2();
		// TODO Completar la prueba
		assertEquals(""+5, modelo.retornarDatos().buscar(""+5));
		//Buscar el primero
		assertEquals(""+0, modelo.retornarDatos().buscar(""+0));
		
		//Buscar el Último
		assertEquals(""+99, modelo.retornarDatos().buscar(""+99));		
	}

	@Test
	public void testEliminar() {
		setUp2();
		// TODO Completar la prueba
		assertEquals(""+20, modelo.retornarDatos().eliminar(""+20));
		
		//Elimina el primero
		assertEquals(""+0, modelo.retornarDatos().eliminar(""+0));
		
		//Elimina el último
		assertEquals(""+99, modelo.retornarDatos().eliminar(""+99));
	}
}
