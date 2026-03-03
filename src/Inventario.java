import java.util.ArrayList;
import java.util.Iterator;

public class Inventario {

	private ArrayList<Mascotas> animales;

	public Inventario() {

		this.animales = new ArrayList<Mascotas>();
	}

	public void vaciar() {

		animales.removeAll(animales);
	}

	public void insertaMascota(Mascotas a) {

		animales.add(a);
	}

	public void eliminaMascota(String nombre) {

		for (Mascotas mascotas : animales) {
			if (mascotas.nombre.equalsIgnoreCase(nombre)) {
				animales.remove(mascotas);
			}

		}

	}

	public void imprimirTodos() {

		for (Mascotas mascotas : animales) {
			System.out.println(mascotas.nombre);
			
		}
	}

	public void imprimirPerros() {
		
		for (Mascotas mascotas : animales) {
			if (mascotas instanceof Perro) {
				System.out.println(mascotas.nombre);
			}
		}

	}

}
