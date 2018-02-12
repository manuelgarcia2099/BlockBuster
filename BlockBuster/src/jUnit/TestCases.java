package jUnit;

import org.junit.jupiter.api.Test;

import refactoring.AlquilerRefactoring;
import refactoring.ClienteRefactoring;
import refactoring.PeliculaRefactoring;
import rental.Alquiler;
import rental.Cliente;
import rental.Pelicula;


/**
 * 
 * @author Manuel García
 *
 */
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
	
	@Test
	void testRefactoring() {
		
		
		ClienteRefactoring clienteRefactorado = new ClienteRefactoring("Pedro Tenorio");
		
		PeliculaRefactoring goodWillHunting = new PeliculaRefactoring ("Good Will Hunting", 0);
		PeliculaRefactoring vengadores = new PeliculaRefactoring ("Vengadores", 1);
		PeliculaRefactoring pinocho = new PeliculaRefactoring("Pinocho", 2);
		
		AlquilerRefactoring alquiler1=new AlquilerRefactoring(pinocho, 3);
		AlquilerRefactoring alquiler2 = new AlquilerRefactoring(vengadores, 10);
		AlquilerRefactoring alquiler3 = new AlquilerRefactoring(goodWillHunting, 5);
		
		clienteRefactorado.agregarAlquiler(alquiler1);
		clienteRefactorado.agregarAlquiler(alquiler2);
		clienteRefactorado.agregarAlquiler(alquiler3);
		//Usé el log4J en cuenta
		clienteRefactorado.cuenta();
	}


}
