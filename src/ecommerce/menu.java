package ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int opcao, produto, id, cor, descricao, marca;
		float preco, desconto;	
				
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
			System.out.println("            7 - Criar Coleção                        ");
			System.out.println("            8 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			
			try {
					
					opcao = leia.nextInt();
					
			}catch(InputMismatchException e){
				System.out.println("\nDigite valores inteiros!");
				leia.nextInt();
				opcao=0;
			}
				
				if (opcao == 8) {
					System.out.println("Gammer Chair, as melhores cadeiras gammers.");
					sobre();
					leia.close();
					System.exit(0);
					
				}
					
					switch(opcao) {
					case 1 :
						System.out.println("Criar produto\n\n");
						
						System.out.println("Digite o nome do produto: ");
						produto = leia.nextInt();
						System.out.println("Digite o ID do produto: ");
						id = leia.nextInt();
						System.out.println("Digite a cor do produto: ");
						cor = leia.nextInt();
						System.out.println("Digite a descrição do produto: ");
						descricao = leia.nextInt();
						System.out.println("Digite a marca do produto: ");
						marca = leia.nextInt();
						System.out.println("Digite o preço do produto: ");
						preco = leia.nextFloat();
						
						keyPress();
						break;
						
//						case 2 :
//							System.out.println("Listar todas as contas\n\n");
//							contas.listarTodas();
//	
//							keyPress();
//							break;
					
					case 3 :
						System.out.println("Buscar produto por id\n\n");
						
						System.out.println("Digite o id do produto: ");
						id = leia.nextInt();
						
//						contas.procurarPorNumero(numero);
						
						keyPress();
						break;
						
					case 4 :
						System.out.println("Editar produto\n\n");
						
						System.out.println("Digite o id do produto: ");
						id = leia.nextInt();
						
//						var buscaConta = contas.buscarNaCollection(numero);

//						if (buscaConta != null) {
//							
//							System.out.println("Digite o Numero da Agência: ");
//							agencia = leia.nextInt();
//							System.out.println("Digite o Nome do Titular: ");
//							leia.skip("\\R?");
//							titular = leia.nextLine();
//								
//							System.out.println("Digite o Saldo da Conta (R$): ");
//							saldo = leia.nextFloat();
//							
//							tipo = buscaConta.getTipo();
							
//						}else
//							System.out.println("\nProduto não encontrado!");
						
						keyPress();
						break;
						
					case 5 :
						System.out.println("Apagar produto\n\n");
						
						System.out.println("Digite o id do produto: ");
						id = leia.nextInt();
							
//						contas.deletar(numero);
						
						keyPress();
						break;
						
					case 6 :
						System.out.println("Inserir desconto\n\n");
						
						System.out.println("Digite o id do produto: ");
						id = leia.nextInt();
						
//						do {
//							System.out.println("Digite o valor do saque (R$): ");
//							valor = leia.nextFloat();
//						}while(valor <= 0);
//						
//						contas.sacar(numero, valor);					
						
						keyPress();
						break;
						
					case 7 :
						System.out.println("Criar coleções\n\n");
						
						System.out.println("Digite o id do produto: ");
						id = leia.nextInt();
						
//						do {
//							System.out.println("Digite o valor do depósito (R$): ");
//							valor = leia.nextFloat();
//						}while(valor <= 0);
//						
//						contas.depositar(numero, valor);	
						
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
				System.out.println("Nathalia Martins Monteles");
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
