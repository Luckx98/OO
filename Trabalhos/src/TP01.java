
import java.util.*;;

public class TP01 {

	static class Clientes {
		private String nome;
		private String endereco;
		private long telefone;
		
	}

	private static class Produtos {
		public int qntProdutos;
		public String nomeProduto;
		public String descProduto;
		public float valorProduto;
		public int porcentProduto;
		public int qntEstoque;
	}

	public static void main(String[] args) {
		int opcao;
		
		// Dados do clientes
		Scanner cliente = new Scanner(System.in);
		Clientes client = new Clientes();

		// Dados do produto
		Scanner produto = new Scanner(System.in);
		Produtos produt = new Produtos();

		Scanner menu = new Scanner(System.in);


		do {
			System.out.print("##--Controle de clientes e produtos--##\n\n");
			System.out.print("|---------------------------------------|\n");
			System.out.print("| Opção 1 - Cadastro de novo cliente    |\n");
			System.out.print("| Opção 2 - Busca por clientes          |\n");
			System.out.print("| Opção 3 - Cadastro de novo produto    |\n");
			System.out.print("| Opção 4 - Busca por produto           |\n");
			System.out.print("| Opção 5 - Cadastro de venda           |\n");
			System.out.print("| Opção 6 - Mostrar produtos em estoque |\n");
			System.out.print("| Opção 7 - Sair                        |\n");
			System.out.print("|---------------------------------------|\n");
			System.out.print("Digite uma opção: ");
			opcao = menu.nextInt();

			if (opcao == 7) {
				System.out.print("\nAté logo!");
				menu.close();
				break;
			}
			


			switch (opcao) {
			case 1: {
				System.out.println("Insira o nome:");
				client.nome = cliente.nextLine();
				client.nome = client.nome.trim();
				System.out.println("Insira o endereço:");
				client.endereco = cliente.nextLine();
				System.out.println("Insira o telefone:");
				client.telefone = cliente.nextLong();
				System.out.print("\n");
				break;
			}
			case 2: {
				System.out.println("Por favor, insira o nome para verificar o cadastro: ");
				client.nome = cliente.nextLine();
//				if (client.nome == "Lucas") {
//					System.out.println("Nome:" + client.nome);
//					System.out.println("Endereçoi:" + client.endereco);
//					System.out.println("Telefone: " + client.telefone);
//				} else {
//					System.out.println("Cliente não encontrado\n");
//				}
				break;
			}
			case 3: {
				System.out.println("Defina a quantidade de produtos a serem cadastrados: ");
				produt.qntProdutos = produto.nextInt();
				for (int i=0; i < produt.qntProdutos; i++) {
					System.out.println("Insira o nome do produto:");
					produt.nomeProduto = produto.nextLine();
					System.out.println("Insira a descrição do produto:");
					produt.descProduto = produto.nextLine();
					System.out.println("Insira o valor de compra do produto:");
					produt.valorProduto = produto.nextInt();
					System.out.println("Insira a porcentagem de lucro do produto: ");
					produt.porcentProduto = produto.nextInt();
					System.out.println("Insira a quantidade em estoque do produto: ");
					produt.qntEstoque = produto.nextInt();
					System.out.print("\n");

				}
				break;
			}
			default:
                System.out.println("Opção digitada é inválida!!!\n\n");
                break;
			}
		} while (opcao != 7);

	}
}