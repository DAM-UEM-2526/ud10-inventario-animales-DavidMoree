
public abstract class Aves extends Mascotas {

	public Aves(String nombre, int edad, String estado, String fechaNacimiento) {
		super(nombre, edad, estado, fechaNacimiento);// utilizamos el super
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Aves [nombre=" + nombre + ", edad=" + edad + ", estado=" + estado + ", fechaNacimiento="
				+ fechaNacimiento + "]";
	}

}
