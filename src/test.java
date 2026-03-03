
public class test {

	public static void main(String[] args) {

		Perro r = new Perro("Rocky", 1, "OK", "11022017");//creamos un perro llamado Rocky
		Gato g = new Gato("Negro", 2, "OK", "05012016");//creamos un perro llamado Negro
		System.out.println(r.getNombre());
		System.out.println(g.getEstado());
		Inventario i = new Inventario();// creamos un inventario
		i.insertaMascota(r);//insertamos al perro
		i.insertaMascota(g);//insertamos al gato
		i.imprimirTodos();
		i.imprimirPerros();//imprime solo los perros
		i.vaciar();//vaciamos
		i.imprimirTodos();
		i.imprimirPerros();
	}
}
