package TPEspecialParte1;

public class Principal {

	public static void main(String[] args) {
		Mazo mazo = new Mazo ();
		
		Carta carta1 = new Carta ("Superman");
		Atributo atributo1Carta1 = new Atributo("Velocidad", 200.0);
		Atributo atributo2Carta1 = new Atributo("Fuerza", 500.0);
		carta1.addAtributo(atributo1Carta1);
		carta1.addAtributo(atributo2Carta1);
		
		Carta carta2 = new Carta ("Flash");
		Atributo atributo1Carta2 = new Atributo ("Velocidad", 800.0);
		Atributo atributo2Carta2 = new Atributo ("Fuerza", 200.0);
		carta2.addAtributo(atributo1Carta2);
		carta2.addAtributo(atributo2Carta2);
		
		Carta carta3 = new Carta ("Hulk");
		Atributo atributo1Carta3 = new Atributo ("Velocidad", 100.0);
		Atributo atributo2Carta3 = new Atributo ("Fuerza", 800.0);
		carta3.addAtributo(atributo1Carta3);
		carta3.addAtributo(atributo2Carta3);
		
		mazo.addCarta(carta1);
		mazo.addCarta(carta2);
		mazo.addCarta(carta3);
		
		Pocima pocima1 = new PocimaFortalecedora("Pocima Fortalecedora");
		Pocima pocima2 = new PocimaFortalecedoraPlus("Pocima Fortalecedora Plus");
		Pocima pocima3 = new PocimaKriptonita("Pocima Kriptonita");
		Pocima pocima4 = new PocimaNumeroMagico("Pocima Numero Magico");
		mazo.addPocima(pocima1);
		mazo.addPocima(pocima2);
		mazo.addPocima(pocima3);
		mazo.addPocima(pocima4);
		
		EstrategiaJuego timbero = new EstrategiaTimbero();
		EstrategiaJuego ambicioso = new EstrategiaAmbicioso();
		EstrategiaJuego obstinado = new EstrategiaObstinado("Fuerza");
		
		Jugador j1 = new Jugador ("Jose", timbero);
		Jugador j2 = new Jugador ("Eduardo", ambicioso);
		
		Juego baraja = new Juego(j1, j2);
		
		mazo.repartirCartas(j1, j2);
		baraja.agarrarCarta(j1, j2);
		System.out.println("¡¡ EL GANADOR ES " + baraja.setGanador() + " !!");
	}

}
