package TPEspecialParte1;

import java.util.ArrayList;

public class Carta implements Comparable <Carta> {

	private String nombre;
	ArrayList<Atributo> atributos;
	
	public Carta(String nombre) {
		this.nombre = nombre;
		atributos = new ArrayList<>();
	}

	public void addAtributo (Atributo atributo) {
		atributos.add(atributo);
	}

	@Override
	public int compareTo(Carta o) {
		//return (int) (this.getAltura() - o.atributos();
		return 0;
	}

	public String getNombre() {
		return nombre;
	}

	
	
	
	
}
