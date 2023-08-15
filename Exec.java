package execucao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.Pedido;
import modelo.Prato;

public class Exec {

	public static void main(String[] args) {
		Prato num1 = new Prato(1,"Camarão a Milanesa", 110.00);
		Prato num2 = new Prato(2,"Pizza Margherita", 110.00);
		Prato num3 = new Prato(3,"Macarrão a Carbonara", 110.00);
		Prato num4 = new Prato(4,"Bife a Parmegiana", 110.00);
		Prato num5 = new Prato(5,"Risoto ao Funghi", 110.00);
		
		List<Prato> pratos = new ArrayList<>();
		pratos.add(num1);
		pratos.add(num2);
		pratos.add(num3);
		pratos.add(num4);
		pratos.add(num5);
		
		Scanner sc = new Scanner(System.in);
		List<Pedido> pedidos = new ArrayList<>();
		
		int opcao;
		do {
			System.out.println("\n-----MENU-----");
			System.out.println("(1) Cadastrar Pedido");
			System.out.println("(2) Cancelar Pedido");
			System.out.println("(3) Listar Pedidos");
			System.out.println("(4) Total de vendas");
			System.out.println("(0) Sair");
			
			opcao = Integer.parseInt(sc.nextLine());
			
			switch (opcao) {
				case 1: 
					Pedido p = new Pedido();
					
					//Nome do cliente
					System.out.print("Informe o Numero: ");
					
					p.setNomeCliente(sc.nextLine());
					
					//Nome do garçom
					Pedido g = new Pedido();
					System.out.print("Informe o Nome do Garçom: ");
					g.setNomeGarcom(sc.nextLine());

					
				int numPrato;
				
				numPrato = Integer.parseInt(sc.nextLine());
				
				switch (numPrato) {
					
					
						case "1":
							
							
							break;
							
						case "2":
							nomePrato.setNome(pratos.get(numPrato));
							break;
							
						case "3":
							nomePrato.setNome(pratos.get(numPrato));
							break;
							
						case "4":
							nomePrato.setNome(pratos.get(numPrato));
							break;
							
						case "5":
							(pratos.get(numPrato));
							break;
					}
					
					pedidos.add(nomeprato);
					break;
					
				case 2: 
					System.out.print("Informe o índice a excluir: ");
					int idx = Integer.parseInt(sc.nextLine());
					
					if(idx < pedidos.size())
						pedidos.remove(idx);
					else
						System.out.print("Índice inválido!");
					
					break;
					
				case 3: 
					for (Pedido c : pedidos) {
						System.out.println(c.getPrato());						
					}
					
					break;
					
				case 0: 
					System.out.println("Programa encerrado!");
					break;
				
				default:
					System.out.println("Opção inválida!");
			}
			
			
		} while(opcao != 0);
		
		sc.close();
		

	}

}
