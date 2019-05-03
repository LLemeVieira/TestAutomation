package application;

public abstract class Produto {
	
	static int control = 0;
	String name = null;
	int ID = 0;
	Cliente client = null;
	Boolean status = false;
	
	public abstract Boolean getDisponibilidade();
	public abstract Cliente getCliente();
	public abstract String getName();
}
