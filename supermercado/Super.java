package supermercado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Super {

	protected List<Articulo> lista;

	public Super() {
		cargarProductos();	
		mostrar();

		Collections.sort(lista);
		System.out.println("Producto mas caro: " + lista.get(lista.size()-1).getNombre());
		System.out.println("Producto mas barato: " + lista.get(0).getNombre());

	}

	private void mostrar() {
		Articulo art;
		for (int i = 0; i < lista.size(); i++) {
			art = lista.get(i);
			System.out.println(art);
		}
			
		System.out.println("==================================");
	}


	public static void main(String[] args) {

		Super s = new Super();

	}

	private void cargarProductos() {

		Bebida cocaZero = new Bebida();
		Bebida cocaCola = new Bebida();
		Shampoo sedal = new Shampoo();
		Fruta fruti = new Fruta();
		cocaZero.setNombre("Coca-Cola Zero");
		cocaZero.setLitro(1.5f);
		cocaZero.setPrecio(20);

		cocaCola.setNombre("Coca-Cola");
		cocaCola.setLitro(1.5f);
		cocaCola.setPrecio(18);

		sedal.setNombre("Shampoo Sedal");
		sedal.setContenido(500);
		sedal.setPrecio(19);

		fruti.setNombre("Frutillas");
		fruti.setPrecio(64);
		fruti.setUnidad("kilo");

		this.lista = new ArrayList<Articulo>();
		lista.add(cocaZero);
		lista.add(cocaCola);
		lista.add(sedal);
		lista.add(fruti);

	}

}
