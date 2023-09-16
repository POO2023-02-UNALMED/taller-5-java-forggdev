package zooAnimales;
import java.util.*;

public class Mamifero extends Animal {
	private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
	static public int caballos;
	static public int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() { //Void constructor
		super();
		listado.add(this);
	}
	
	public Mamifero(String nombre, int edad, String habtitat, String genero, boolean pelaje, int patas) { //Constructor with attributes
		super(nombre, edad, habtitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
	}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		Mamifero caballo = new Mamifero(nombre, edad, "pradera", genero, true, 4);
		caballos++;
		return caballo;
	}
	
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		Mamifero leon = new Mamifero(nombre, edad, "selva", genero, true, 4);
		leones++;
		return leon;
	}
	
	public static int cantidadMamiferos() {return listado.size();}
	
	//Set and get methods
	public boolean isPelaje() {return this.pelaje;}
	public int getPatas() {return this.patas;}

}
