package zooAnimales;
import java.util.*;

public class Reptil extends Animal {
	private static ArrayList<Reptil> listado;
	static public int iguanas;
	static public int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() { //Void constructor
		super();
		listado.add(this);
	}
	
	public Reptil(String nombre, int edad, String habtitat, String genero, String colorEscamas, int largoCola) { //Constructor with attributes
		super(nombre, edad, habtitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
	}
	
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		Reptil iguana = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
		iguanas++;
		return iguana;
	}
	
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		Reptil serpiente = new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
		serpientes++;
		return serpiente;
	}
	
	public static int cantidadReptiles() {return listado.size();}
	
	@Override
	public String movimiento() {
		return "reptar";
	}
	//Set and get methods
	public String getColorEscamas() {return this.colorEscamas;}
	public int getLargoCola() {return this.largoCola;}
}
