package zooAnimales;
import gestion.*;

public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	public Animal(){totalAnimales+=1;} //Void constructor
	
	public Animal(String nombre, int edad, String habtitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		totalAnimales++;
	}
	
	public String toString() {
		if(this.getZona()!=null) {
			return ("Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero + ", la zona en la que me ubico es " + zona + ", en el zoo " + zona.getZoo());
		} else {
			return ("Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero);
		}
		
	}
	
	public String movimiento() {
		return "desplazarse";
	}
	
	
	public static String totalPorTipo() {
		return ("Mamiferos: " + Mamifero.cantidadMamiferos()+"\nAves: "+ Ave.cantidadAves() + "\nReptiles: " + Reptil.cantidadReptiles() + "\nPez: " + Pez.cantidadPeces() + "\nAnfibios: " + Anfibio.cantidadAnfibios());
	}
	
	//Set and get methods
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getEdad() {
		return this.edad;
	}
	
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public String getHabitat() {
		return this.habitat;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getGenero() {
		return this.genero;
	}
	
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	public Zona getZona() {
		return this.zona;
	}
	
	public static int getTotalAnimales() {return totalAnimales;}

}
