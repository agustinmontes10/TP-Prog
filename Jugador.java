package TPEspecialParte1;

import java.util.ArrayList;

public class Jugador {

	private String nombre;
	ArrayList <Carta> cartasJugador;
	
	public Jugador (String nombre) {
		this.nombre = nombre;
		cartasJugador = new ArrayList<>();
	}
	
	public void addCarta (Carta carta) {
		cartasJugador.add(carta);
	}
	
	@Override
	public String toString () {
		return nombre;
	}
	
}
