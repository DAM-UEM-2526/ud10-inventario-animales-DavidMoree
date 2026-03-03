import java.util.ArrayList;
import java.util.Iterator;

public class Inventario {

	private ArrayList<Mascotas> animales; // creamos la relacion 

	public Inventario() {

		this.animales = new ArrayList<Mascotas>();//inicializamos 
	}

	public void vaciar() {// metodo para vaciar la lista

		animales.removeAll(animales);
	}

	public void insertaMascota(Mascotas a) {// metodo para insertarmascotas a la lista

		animales.add(a);
	}

	public void eliminaMascota(String nombre) {// metodo para eliminar la mascota de la lista

		for (Mascotas mascotas : animales) {
			if (mascotas.nombre.equalsIgnoreCase(nombre)) {
				animales.remove(mascotas);
			}

		}

	}

	public void imprimirTodos() { // metodo para imprimir todas las mascotas

		for (Mascotas mascotas : animales) {
			System.out.println(mascotas.nombre);
			
		}
	}

	public void imprimirPerros() { //  metodo para imprimir solo los perros utilizamos el instanceof
		
		for (Mascotas mascotas : animales) {
			if (mascotas instanceof Perro) {
				System.out.println(mascotas.nombre);
			}
		}

	}

}
