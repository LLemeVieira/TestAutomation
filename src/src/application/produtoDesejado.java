package application;

public class produtoDesejado extends Produto{

	public produtoDesejado (String string){
		client = new Cliente("Requerente");
		client.setNomeProdutoDesejado(string);
		this.name = string;
	}


	@Override
	public Boolean getDisponibilidade() {
		return status;
	}

	@Override
	public Cliente getCliente() {
		return client;
	}

	@Override
	public String getName() {
		return name;
	}

}
