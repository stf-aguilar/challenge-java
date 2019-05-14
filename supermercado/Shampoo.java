package supermercado;

public class Shampoo extends Articulo {

	protected int contenido;

	public int getContenido() {
		return contenido;
	}

	public void setContenido(int contenido) {
		this.contenido = contenido;
	}

	public String toString() {
		return "Nombre: " + getNombre() + " /// Contenido: " + getContenido() + " /// Precio: $" + getPrecio();
	}

	
}
