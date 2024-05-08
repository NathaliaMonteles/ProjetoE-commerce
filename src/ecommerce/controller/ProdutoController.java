package ecommerce.controller;

import java.util.ArrayList;
import ecommerce.model.produto;
import ecommerce.repository.Repository;

public class ProdutoController implements Repository {
	
	private ArrayList<produto> listaProdutos = new ArrayList<produto>();
	int id = 0;
	
	@Override
	public void procurarPorID(int id) {
		var produto = buscarNaCollection(id);
		
		if (produto != null)
			produto.visualizar();
		else
			System.out.println("\nO produto de id: " + id + " não foi encontrado!");
		
	}

	public produto buscarNaCollection(int id) {
		for (var produto : listaProdutos) {
			if (produto.getId() == id) {
				return produto;
			}
		}
		return null;
	}

	@Override
	public void listarTodas() {
		for (var id : listaProdutos) {
			id.visualizar();
		}
		
	}

	@Override
	public void cadastrar(produto produto) {
		listaProdutos.add(produto);
		System.out.println("\nO produto de id: " + produto.getId() + " foi criado com sucesso!");
		
	}
	
	public int gerarID() {
		return ++ id;
	}
	
	public void aplicarDesconto(float desconto, produto produto) {
	    float precoAtual = produto.getPreco();
	    
	    float novoPreco = precoAtual - desconto;
	    
	    produto.setPreco(novoPreco);
	    
	    System.out.println("Desconto de " + desconto + " reais aplicado com sucesso ao produto " + produto.getProduto() + "que antes custava " + produto.getPreco() + ".");
	}
	
	public void deletar(int id) {
		var produto = buscarNaCollection(id);
		
		if (produto != null) {
			if (listaProdutos.remove(produto) == true)
				System.out.println("\nO produto: " + id + " foi deletado com sucesso!");
		} else
			System.out.println("\nA Conta numero : " + id + " não foi encontrada!");
		
	}

    public void desconto(int id, float desconto) {
        var produto = buscarNaCollection(id);

        if (produto != null) {
            this.aplicarDesconto(desconto, produto);
            System.out.println("\nO desconto no produto número: " + id + " foi aplicado com sucesso!");
        } else
            System.out.println("\nO produto número: " + id + " não foi encontrado!");
    }
    
    public void atualizar(produto produto) {
        var buscaProduto = buscarNaCollection(produto.getId());
		
		if (buscaProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscaProduto), produto);
			System.out.println("\nO produto: " + produto.getId() + " foi atualizada com sucesso!");
		}else
			System.out.println("\nO produto: " + produto.getId() + " não foi encontrada!");
    }
}
