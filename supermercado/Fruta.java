package supermercado;

public class Fruta extends Articulo {

	protected String unidad;

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}
	

	public String toString() {
		return "Nombre: " + getNombre() + " /// Precio: $" + getPrecio() + " /// Unidad de venta: " + getUnidad();
	}


	
}
