package projectogithub;

import java.util.ArrayList;

public class Cliente {

	String nombre;
	String apellido;
	String dni;
	String direccion;
	ArrayList <Producto> compras = new ArrayList <Producto> ();
	
	public Cliente(String nombre, String apellido, String dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + "]";
	}
	
	
	
	
	
}
