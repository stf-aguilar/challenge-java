package supermercado;

public class Bebida extends Articulo {

	protected float litro;

	public float getLitro() {
		return litro;
	}

	public void setLitro(float litro) {
		this.litro = litro;
	}
	

	public String toString() {
		return "Nombre: " + getNombre() + " /// Litros: " + getLitro() + " /// Precio: $" + getPrecio();
	}


}
