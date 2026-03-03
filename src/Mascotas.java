
public abstract class Mascotas {

	protected String nombre;
	protected int edad;
	protected String estado;
	protected String fechaNacimiento;

	public Mascotas(String nombre, int edad, String estado, String fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.estado = estado;
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Mascotas [nombre=" + nombre + ", edad=" + edad + ", estado=" + estado + ", fechaNacimiento="
				+ fechaNacimiento + "]";
	}

}
