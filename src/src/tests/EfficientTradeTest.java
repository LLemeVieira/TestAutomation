package tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import application.Match;
import application.produtoDesejado;
import application.produtoDisponivel;;

class EfficientTradeTest {

	@Test
	public void validaMatch(){
		//Cria uma inst�ncia da classe Match
		Match match = new Match("Realizar troca");
		
		//Valida se objeto Match n�o � vazio
		assertNotEquals(0,match.trocas.getSize());

		//Define o objeto resultado de dois participantes
		match.defineDadosTroca(new produtoDesejado("Furadeira"),new produtoDisponivel("Martelo"));
		
		//Valida se n�o � o mesmo usuario que est� trocando
		assertFalse(match.produtoDesejado.getCliente().getID() == match.produtoDisponivel.getCliente().getID());
		
		//Valida se os produtos de cada usuario est�o corretos
		assertFalse(match.produtoDesejado.getCliente().getNomeProdutoDisponivel() ==  (match.produtoDesejado).getName());
		assertFalse(match.produtoDisponivel.getCliente().getNomeProdutoDesejado() == (match.produtoDisponivel).getName());
		
		//Valida se produto est� disponivel
		assertFalse(((match.produtoDesejado).getDisponibilidade()));
		assertFalse(((match.produtoDisponivel).getDisponibilidade()));
	}
}
