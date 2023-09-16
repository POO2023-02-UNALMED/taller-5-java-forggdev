package gestion;
import java.util.*;

public class Zoologico {

	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<Zona>();
	
	public Zoologico() {} //Void constructor
	
	public Zoologico(String nombre, String ubicacion) { //Constructor with attributes
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	public int cantidadTotalAnimales() {
		int cantidadTotalAni = 0;
		for(Zona Zonita: this.zonas){
			cantidadTotalAni += Zonita.cantidadAnimales();
		}
		return cantidadTotalAni;
	}
	
	public void agregarZonas(Zona zona) {
		this.zonas.add(zona);
	}
	
	
	//Set and get methods
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
	
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public String getUbicacion() {
		return this.ubicacion;
	}
	
	public void setZona(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}
	public ArrayList<Zona> getZona() {
		return this.zonas;
	}
}
