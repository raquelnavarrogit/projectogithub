package projectogithub;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Cliente {

	String nombre;
	String apellido;
	String dni;
	ArrayList <Producto> compras = new ArrayList <Producto> ();
	
	
	public Cliente(String nombre, String apellido, String dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
	

	public void agregarCliente () {
		
		String nom = JOptionPane.showInputDialog("Introduzca el nombre del cliente");
		String ape = JOptionPane.showInputDialog("Introduzca el apellido del cliente");
		String dni = JOptionPane.showInputDialog("Introduzca el dni del cliente");
		
		Cliente usuario = new Cliente (nom,ape,dni);
	}
	
	
	
}
