package refactoring;
/**
 * @author M.Fowler traducción: Manuel García
 * 18. En función de eliminar el switch se crea clase abstracta PrecioR y sus clases hijas
 * 19. Se crea el método getPrecio(int) 
 * 21. ReplaceConditionalByPolimorphism Para eliminar el switch con override en cada clase hija
 * 21.1 Precio Normal
 * 21.2 Precio Estreno
 * 21.3 Precio Infantil
 * 22. Declara getPrecio(int diasAlquiados) como abstract
 * 23.1 Se mueve el método getPuntosClienteFrecuente a esta clase a partir de la clase PeliculaR
 * 25. Ya que sólo necesito un método override en PrecioEstreno dejo un valor default en esta clase 
 */
abstract class PrecioRefactoring {
	
	abstract int getCodigoPrecio();
	
	abstract double getPrecio(int diasAlquilados);
	
	int getPuntosClienteFrecuente(int diasAlquilados) {
		return 1;
	}

}
