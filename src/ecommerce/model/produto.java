package ecommerce.model;

public abstract class produto {
	
	private int id;
	private String produto;
	private String cor;
	private String descricao;
	private String marca;
	private float preco;
	private float desconto;
	
	public produto(int id, String produto, String cor, String descricao, String marca, float preco, float desconto) {
		super();
		this.id = id;
		this.produto = produto;
		this.cor = cor;
		this.descricao = descricao;
		this.marca = marca;
		this.preco = preco;
		this.desconto = desconto;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public float getDesconto() {
		return desconto;
	}

	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}
	
	public void desconto(float desconto) {
		
		this.desconto(this.getPreco() - desconto);
	
		}
	
	public void visualizar() {
	
	System.out.println("\n\n***********************************************************");
	System.out.println("Dados do produto:");
	System.out.println("***********************************************************");
	System.out.println("ID do produto: " + this.id);
	System.out.println("Produto: " + this.produto);
	System.out.println("Cor do produto: " + this.cor);
	System.out.println("Descrição do produto: " + this.descricao);
	System.out.println("Marca do produto: " + this.marca);
	System.out.println("Preço do produto: " + this.preco);
	System.out.println("Desconto do produto: " + this.desconto);
	
	}
		
}



