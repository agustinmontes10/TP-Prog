package TPEspecialParte1;

import java.util.ArrayList;

public class Carta implements Comparable <Carta> {

	private String nombre;
	ArrayList<Atributo> atributos;
	private Pocima pocima;
	
	public Carta(String nombre) {
		this.nombre = nombre;
		atributos = new ArrayList<>();
	}

	public void addAtributo (Atributo atributo) {
		atributos.add(atributo);
	}
	
	public Pocima getPocima() {
		return pocima;
	}

	public void setPocima(Pocima pocima) {
		this.pocima = pocima;
	}

	@Override
	public int compareTo(Carta o) {
		return this.getNombre().compareTo(o.getNombre());
	}

	public String getNombre() {
		return nombre;
	}

	
	
	
	
}
