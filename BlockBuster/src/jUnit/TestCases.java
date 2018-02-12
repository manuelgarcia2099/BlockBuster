package jUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import rental.Alquiler;
import rental.Cliente;
import rental.Pelicula;

class TestCases {

	@Test
	void testRental() {
		Cliente cliente = new Cliente("Juan Perez");
		
		Pelicula goodWillHunting = new Pelicula ("Good Will Hunting", 0);
		Pelicula vengadores = new Pelicula ("Vengadores", 1);
		Pelicula pinocho = new Pelicula("Pinocho", 2);
		
		Alquiler alquiler1=new Alquiler(pinocho, 3);
		Alquiler alquiler2 = new Alquiler(vengadores, 10);
		Alquiler alquiler3 = new Alquiler(goodWillHunting, 5);
		
		cliente.agregarAlquiler(alquiler1);
		cliente.agregarAlquiler(alquiler2);
		cliente.agregarAlquiler(alquiler3);
		//Usé el log4J en cuenta
		cliente.cuenta();
	}


}
