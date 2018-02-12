package refactoring;
/**
 * @author M.Fowler traducción: Manuel García
 *4.1 Creamos el método getPrecio a partir del método pagoDe(Alquiler) de la clase ClienteR
 *13. Movemos getPrecio() para clase PeliculaR como getPrecio(int diasAlquilados) porque usa el objeto PeliculaR
 *14. Invocamos el método getPrecio(int) a partir de la instancia pelicula en el método getPrecio().
 *15. Movemos getPuntosClienteFrecuente  para clase PeliculaR como getPuntosClienteFrecuente(int diasAlquilados) porque usa el objeto Pelicula R.
 *16. Invocamos el método getPuntosClienteFrecuente(int) a partir de la instancia película en el método getPuntosClienteFrecuente()
 *17. ReplaceConditionalByPolimorphism Para cambiar el método SWITCH.
 */
public class AlquilerRefactoring {
	
	private PeliculaRefactoring pelicula;
	private int diasAlquilados;
	
	public AlquilerRefactoring(PeliculaRefactoring pelicula, int diasAlquilados) {
		this.pelicula=pelicula;
		this.diasAlquilados=diasAlquilados;
	}
	
	double getPrecio() {
		return pelicula.getPrecio(diasAlquilados);
	}
	
	int getPuntosClienteFrecuente() {
		return pelicula.getPuntosClienteFrecuente(diasAlquilados);
	}
	

	public PeliculaRefactoring getPelicula() {
		return pelicula;
	}

	public int getDiasAlquilados() {
		return diasAlquilados;
	}


}
