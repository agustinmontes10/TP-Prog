package TPEspecialParte1;

public class PocimaNumeroMagico extends Pocima {

	public PocimaNumeroMagico() {
		this.valor = 23.0;
	}
	
	@Override
	public void hacerEfecto(Carta carta) {
		for (int i = 0; i < carta.atributos.size(); i++) {
			Atributo atributo = carta.atributos.get(i);
			//double valorPrincipal = atributo.getValor();
			atributo.setValor(valor);
		}
		
	}

	

}
