package TPEspecialParte1;

public class PocimaKriptonita extends Pocima {

	public PocimaKriptonita () {
		this.valor = 25.0;
	}
	
	@Override
	public void hacerEfecto(Carta carta) {
		for (int i = 0; i < carta.atributos.size(); i++) {
			Atributo atributo = carta.atributos.get(i);
			double valorPrincipal = atributo.getValor();
			atributo.setValor(valorPrincipal - (valor/100)*valorPrincipal);
		}
		
	}

	

}
