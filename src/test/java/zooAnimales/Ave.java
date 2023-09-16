package zooAnimales;
import java.util.*;

public class Ave extends Animal {
	private static ArrayList<Ave> listado;
	static public int halcones;
	static public int aguilas;
	private String colorPlumas;
	
	public Ave() { //Void constructor
		super();
		listado.add(this);
	}
	
	public Ave(String nombre, int edad, String habtitat, String genero, String colorPlumas) { //Constructor with attributes
		super(nombre, edad, habtitat, genero);
		this.colorPlumas = colorPlumas;
		listado.add(this);
	}
	
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		Ave halcon = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
		halcones++;
		return halcon;
	}
	
	public static Ave crearAguila(String nombre, int edad, String genero) {
		Ave aguila = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
		aguilas++;
		return aguila;
	}
	
	public static int cantidadAves() {return listado.size();}

	@Override
	public String movimiento() {
		return "volar";
	}
	//Set and get methods
	public String getColorPlumas() {return this.colorPlumas;}
}
