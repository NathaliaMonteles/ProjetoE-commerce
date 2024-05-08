package model;

public abstract class produto {
	
	private int opcao;
	private int produto;
	private int id;
	private int cor;
	private int descricao;
	private int marca;
	private float preco;
	private float desconto;
	
	public produto(int opcao, int produto, int id, int cor, int descricao, int marca, float preco, float desconto) {
		this.opcao = opcao;
		this.produto = produto;
		this.id = id;
		this.cor = cor;
		this.descricao = descricao;
		this.marca = marca;
		this.preco = preco;
		this.desconto = desconto;
		
	}

	public int getOpcao() {
		return opcao;
	}

	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}

	public int getProduto() {
		return produto;
	}

	public void setProduto(int produto) {
		this.produto = produto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCor() {
		return cor;
	}

	public void setCor(int cor) {
		this.cor = cor;
	}

	public int getDescricao() {
		return descricao;
	}

	public void setDescricao(int descricao) {
		this.descricao = descricao;
	}

	public int getMarca() {
		return marca;
	}

	public void setMarca(int marca) {
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
	

	}



