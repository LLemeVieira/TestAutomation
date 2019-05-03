package application;

public class produtoDisponivel extends Produto{

	public produtoDisponivel(String string) {
		client = new Cliente("Ofertante");
		client.setNomeProdutoDisponivel(string);
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
