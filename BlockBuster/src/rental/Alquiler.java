package rental;

/**
 * 
 * @author M.Fowler traducción: Manuel García
 *
 */
public class Alquiler {
	
	private Pelicula pelicula;
	private int diasAlquilados;
	
	public Alquiler(Pelicula pelicula, int diasAlquilados) {
		this.pelicula=pelicula;
		this.diasAlquilados=diasAlquilados;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public int getDiasAlquilados() {
		return diasAlquilados;
	}

	
}
