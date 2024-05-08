package ecommerce.repository;

import ecommerce.model.produto;

public interface Repository {
	
	public void listarTodas();
	public void cadastrar(produto produto);
	public void procurarPorID(int id);
	public void deletar(int id);
	public void atualizar(produto produto);
	

}
