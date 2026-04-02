import java.util.ArrayList;
import java.util.Scanner;

public class GerenciamentoProdutosCrud {
    ArrayList<String> listaProdutos = new ArrayList<>();

    Scanner read = new Scanner(System.in);

    public void cadastrarProduto(String nomeProduto) {
        try {
            listaProdutos.add(nomeProduto);

            int id = listaProdutos.size() - 1;
            System.out.printf("ID: %d | O Produto [ %s ] foi cadastrado com sucesso!", id, nomeProduto);

        } catch (Exception e) {
            System.out.println("Erro ao cadastrar o Produto. " + e);
        }
    }

    public void listarProdutos() {

        System.out.println("\n Produtos: \n");
        if (listaProdutos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }
        for (int i = 0; i < listaProdutos.size(); i++) {
            System.out.println("ID: " + i + " | Produto: " + listaProdutos.get(i));
        }
        System.out.printf("\n A lista contem %s produtos. ", listaProdutos.size());
    }

    public void atualizarProduto(int indice, String novoProduto) {
        if (indice < 0 || indice >= listaProdutos.size()) {
            System.out.println("Índice inválido.");
            return;
        }

        String antigo = listaProdutos.get(indice);
        listaProdutos.set(indice, novoProduto);

        System.out.printf("Produto '%s' atualizado para '%s'.%n", antigo, novoProduto);
    }

    public void deletarProduto(){
        System.out.println("Digite o índice do produto que deseja deletar:");
        int indice = read.nextInt();
        read.nextLine(); // limpar buffer

        if (indice < 0 || indice >= listaProdutos.size()) {
            System.out.println("Índice inválido.");
            return;
        }

        String removido = listaProdutos.remove(indice);
        System.out.println("Produto '" + removido + "' deletado com sucesso!");

    }
}