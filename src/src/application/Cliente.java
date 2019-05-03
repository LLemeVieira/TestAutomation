package application;

public class Cliente {
	
	static int control = 0;
	private String name = null;
	private int ID;
	String nomeProdutoDesejado;
	String nomeProdutoDisponivel;

	public Cliente(String name) {
		super();
		this.name = name;
		ID = control++;
	}
	public void setNomeProdutoDesejado(String nomeProdutoDesejado) {
		this.nomeProdutoDesejado = nomeProdutoDesejado;
	}
	public void setNomeProdutoDisponivel(String nomeProdutoDisponivel) {
		this.nomeProdutoDisponivel = nomeProdutoDisponivel;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNomeProdutoDesejado() {
		return nomeProdutoDesejado;
	}
	public String getNomeProdutoDisponivel() {
		return nomeProdutoDisponivel;
	}
}
