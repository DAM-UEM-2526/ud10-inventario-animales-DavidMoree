
public class Canario extends Aves {

	public Canario(String nombre, int edad, String estado, String fechaNacimiento) {
		super(nombre, edad, estado, fechaNacimiento);//utilizamos el super
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Canario [nombre=" + nombre + ", edad=" + edad + ", estado=" + estado + ", fechaNacimiento="
				+ fechaNacimiento + "]";
	}

}
