package projectogithub;

public class MainTienda {

	public static void main(String[] args) {
		
		Tienda mercadona= new Tienda ();
		mercadona.añadirCliente();
		mercadona.añadirProducto();
		

		Tienda teashop = new Tienda ();
		
		teashop.mostrarClientes();
		teashop.mostrarProductos();

		
	}

}
