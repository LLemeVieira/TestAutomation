package application;

import java.awt.List;

public class Match {
	
	private static int control = 0;
	public int ID;
	public String Name;
	public produtoDesejado produtoDesejado;
	public produtoDisponivel produtoDisponivel;

	public List trocas = new List();
	
	
	public Match(String name) {
		super();
		Name = name;
		ID = control++;
		trocas.add(Integer.toString(ID));
	}

	public void defineDadosTroca(produtoDesejado produtoDesejado, produtoDisponivel produtoDisponivel) {
		this.produtoDisponivel = produtoDisponivel;
		this.produtoDesejado = produtoDesejado;
	}


	public Object Trocas() {
		// TODO Auto-generated method stub
		return null;
	}
}
