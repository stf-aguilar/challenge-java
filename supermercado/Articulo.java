package supermercado;

public abstract class Articulo implements Comparable<Articulo> {

	protected String nombre;
	protected int precio;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public int compareTo(Articulo arg0) {
		
		return this.getPrecio() - arg0.getPrecio();
	}
	
}
