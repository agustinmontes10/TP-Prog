package TPEspecialParte1;

import java.util.ArrayList;
import java.util.Collections;

public class Mazo {

	ArrayList <Carta> cartas;
	
	public Mazo () {
		cartas = new ArrayList<>();
	}
	
	public void repartirCartas (Jugador j1, Jugador j2) {
		Jugador turno = j1;
		mesclarCartas(cartas);
		for (int i = 0; i < cartas.size(); i++) {
			Carta carta = cartas.get(i);
			if (turno == j1) {
				j1.addCarta(carta);
				turno = j2;
			} else {
				j2.addCarta(carta);
				turno = j1;
			}
			
		}
	}
	
	public void mesclarCartas (ArrayList<Carta>cartas) {
		Collections.shuffle(cartas);
	}
	
	public void addCarta (Carta carta) {
		cartas.add(carta);
	}
	
}
