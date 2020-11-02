package TPEspecialParte1;

public class PocimaCocktail extends Pocima {

	Pocima pocima1;
	Pocima pocima2;
	
	public PocimaCocktail(double valor, Pocima pocima1, Pocima pocima2) {
		this.valor = valor;
		this.pocima1 = pocima1;
		this.pocima2 = pocima2;
	}
	
	@Override
	public void hacerEfecto(Carta carta) {
		pocima1.hacerEfecto(carta);
		pocima2.hacerEfecto(carta);
		
	}

	
}