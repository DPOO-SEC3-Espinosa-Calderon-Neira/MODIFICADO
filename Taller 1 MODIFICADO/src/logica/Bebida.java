package logica;

public class Bebida implements Producto {
	
	private String nombre;
	private int precioBase;
	
	public Bebida(String nombre, int precioBase) {
		this.nombre = nombre;
		this.precioBase = precioBase;
	}
	
	/*
	 * Los siguientes m�todos son la implementaci�n de los m�todos
	 * en la clase Producto.
	 */
	
	public String getNombre() {
		return nombre;
	}
	
	public double getPrecio() {
		return precioBase;
	}
	
	public String generarTextoFactura() {
		return "";
	}
}