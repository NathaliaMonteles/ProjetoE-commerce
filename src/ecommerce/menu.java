package ecommerce;

import java.util.Scanner;

import ecommerce.model.produto;
import java.io.IOException;
import java.util.InputMismatchException;
import ecommerce.controller.ProdutoController;

public class menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		ProdutoController produtos = new ProdutoController();
		
		int opcao, id;
		String Produto = null, cor = null, descricao = null, marca = null;
		float preco = 0, desconto;	
		
		System.out.println("\nCriar Produtos\n");
		
		produto p1 = new produto(produtos.gerarID(), "Cadeira Gammer Out", "preto", "Cadeira Gammer profissional com inclinação e ajuste de altura", "Picchau", 350f, 0f);
		produtos.cadastrar(p1);
		
		produto p2 = new produto(produtos.gerarID(), "Cadeira Gammer Prisma", "rosa", "Cadeira Gammer profissional com inclinação e ajustes", "Picchau", 250f, 0f);
		produtos.cadastrar(p2);
		
		produto p3 = new produto(produtos.gerarID(), "Cadeira Gammer Circle", "azul", "Cadeira Gammer profissional com ajuste de altura", "Picchau", 250f, 0f);
		produtos.cadastrar(p3);
		
		produtos.listarTodas();	
		
		System.out.println("\nCriar Produtos\n");
	
				
		while (true) {
			
			System.out.println("*****************************************************");
			
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                     GAMMER CHAIR                    ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Produto                        ");
			System.out.println("            2 - Listar todos os Produtos             ");
			System.out.println("            3 - Buscar Produto por ID                ");
			System.out.println("            4 - Editar Produto		                 ");
			System.out.println("            5 - Apagar Produto                       ");
			System.out.println("            6 - Inserir Desconto                     ");
			System.out.println("            7 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			
			try {
					
				opcao = leia.nextInt();
					
			} catch(InputMismatchException e){
				System.out.println("\nDigite valores inteiros!");
				leia.nextInt();
				opcao=0;
			}
				
				if (opcao == 7) {
					System.out.println("Gammer Chair, as melhores cadeiras gammers.");
					sobre();
					leia.close();
					System.exit(0);
					
				}
					
					switch(opcao) {
					case 1 :
						System.out.println("Criar produto\n\n");
						
						System.out.println("Digite o ID do produto: \n");
						id = leia.nextInt();
						System.out.println("Digite o nome do produto: \n");
						Produto = leia.next();
						System.out.println("Digite a cor do produto: \n");
						cor = leia.next();
						System.out.println("Digite a descrição do produto: \n");
						descricao = leia.next();
						System.out.println("Digite a marca do produto: \n");
						marca = leia.next();
						System.out.println("Digite o preço do produto: \n");
						preco = leia.nextFloat();
						
						produtos.cadastrar(new produto(id, Produto, cor, descricao, marca, preco, 0f));
						
						keyPress();
						break;
						
						case 2 :
							System.out.println("Listar todos os produtos\n\n");
							produtos.listarTodas();
	
							keyPress();
							break;
					
					case 3 :
						System.out.println("Buscar produto por id\n\n");
						
						System.out.println("Digite o id do produto: ");
						id = leia.nextInt();
						
						produtos.procurarPorID(id);
						
						keyPress();
						break;
						
					case 4 :
						System.out.println("Editar produto\n\n");
						
						System.out.println("Digite o id do produto: ");
						id = leia.nextInt();
						
						var buscaProduto = produtos.buscarNaCollection(id);

						if (buscaProduto != null) {
							
							System.out.println("Digite o nome do produto: \n");
							Produto = leia.next();
							System.out.println("Digite a cor do produto: \n");
							cor = leia.next();
							System.out.println("Digite a descrição do produto: \n");
							descricao = leia.next();
							System.out.println("Digite a marca do produto: \n");
							marca = leia.next();
							System.out.println("Digite o preço do produto: \n");
							preco = leia.nextFloat();
							
							produtos.atualizar(new produto(id, Produto, cor, descricao, marca, preco, 0f));
							
						}else
							System.out.println("\nProduto não encontrado!");
						
						keyPress();
						break;
						
					case 5 :
						System.out.println("Apagar produto\n\n");
						
						System.out.println("Digite o id do produto: ");
						id = leia.nextInt();
							
						produtos.deletar(id);
						
						keyPress();
						break;
						
					case 6 :		
						System.out.println("Digite o id do produto: ");
						id = leia.nextInt();
						
						System.out.println("Digite o valor do desconto (R$): ");
						desconto = leia.nextFloat();
						
						produtos.desconto(id, desconto);				
						
						keyPress();
						break;
						
					default:
						System.out.println("\nOpção Inválida\n\n");
						
						keyPress();
						break;
					}
					
			}
					
		}

			public static void sobre() {
				System.out.println("*****************************************************");
				System.out.println("Projeto Desenvolvido por: ");
				System.out.println("Nathalia Martins Monteles pela Generation Brasil");
				System.out.println("github.com/NathaliaMonteles");
				System.out.println("*********************************************************");
			}
			
			public static void keyPress() {

				try {

					System.out.println("\n\nPressione Enter para Continuar...");
					System.in.read();

				} catch (IOException e) {

					System.out.println("Você pressionou uma tecla diferente de enter!");

				}
			}
			
}
