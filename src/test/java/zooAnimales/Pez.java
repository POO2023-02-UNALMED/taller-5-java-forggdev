package zooAnimales;
import java.util.*;

public class Pez extends Animal {
	private static ArrayList<Pez> listado;
	static public int salmones;
	static public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() { //Void constructor
		super();
		listado.add(this);
	}
	
	public Pez(String nombre, int edad, String habtitat, String genero, String colorEscamas, int cantidadAletas) { //Constructor with attributes
		super(nombre, edad, habtitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
	}
	
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		Pez salmon = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
		salmones++;
		return salmon;
	}
	
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		Pez bacalao = new Pez(nombre, edad, "oceano", genero, "gris", 6);
		bacalaos++;
		return bacalao;
	}
	
	public static int cantidadPeces() {return listado.size();}
	
	@Override
	public String movimiento() {
		return "nadar";
	}
	//Set and get methods
	public String getColorEscamas() {return this.colorEscamas;}
	public int getCantidadAletas() {return this.cantidadAletas;}
	
	
}
