package zooAnimales;
import java.util.*;

public class Anfibio extends Animal {
	private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
	static public int ranas;
	static public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() { //Void constructor
		super();
		listado.add(this);
	}
	
	public Anfibio(String nombre, int edad, String habtitat, String genero, String colorPiel, boolean venenoso) { //Constructor with attributes
		super(nombre, edad, habtitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
	}
	
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		ranas++;
		return rana;
	}
	
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		Anfibio salamandra = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
		salamandras++;
		return salamandra;
	}
	
	public static int cantidadAnfibios() {return listado.size();}
	
	@Override
	public String movimiento() {
		return "saltar";
	}
	//Set and get methods
	public String getColorPiel() {return this.colorPiel;}
	public boolean isVenenoso() {return this.venenoso;}

}
