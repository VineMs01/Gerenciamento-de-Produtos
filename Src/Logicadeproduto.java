import java.util.Scanner;

public class Logicadeproduto {
    public static void main(String[] args) {
        GerenciamentoProdutosCrud gProdutos = new GerenciamentoProdutosCrud();

        boolean continuar = true;
        Scanner sc = new Scanner(System.in);
        int indice;
        String novoProduto;

        do {
            System.out.println("\nBem vindo ao sistema de gerenciamento de Produtos.");
            System.out.println("[1]  -  Cadastrar Produtos.");
            System.out.println("[2]  -  Listar Produtos.");
            System.out.println("[3]  -  Atualizar Produtos.");
            System.out.println("[4]  -  Deletar Produtos.");
            System.out.println("[0]  -  Sair do programa.");

            System.out.println("Informe uma opcao do menu: ");
            int opcaoUsuario = sc.nextInt();

            switch (opcaoUsuario){
                case 1:
                    sc.nextLine();
                    System.out.println("Bem vindo ao cadastro de Produto.");
                    System.out.println("Informe o nome do Produtos: ");
                    String nomeProduto = sc.nextLine();

                    gProdutos.cadastrarProduto(nomeProduto);

                    break;
                case 2:
                    gProdutos.listarProdutos();

                    break;
                case 3:
                    sc.nextLine(); // limpar buffer

                    System.out.println("Informe o índice do produto que deseja atualizar: ");
                    indice = sc.nextInt();

                    sc.nextLine(); // limpar buffer novamente

                    System.out.println("Informe o novo nome do produto: ");
                    novoProduto = sc.nextLine();

                    gProdutos.atualizarProduto(indice, novoProduto);

                    break;
                case 4:
                    gProdutos.deletarProduto();

                    break;
                case 0:
                    System.out.println("Obrigado por usar o programa :)");
                    continuar = false;

                    break;
                default:
                    System.out.println("Opcao nao encontrada/tente novamente");

            }

        }while (continuar);

    }
}
