import java.util.Scanner;

public class ComprasLivraria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Livro livro1 = new Livro(scanner.nextLine(), scanner.nextDouble(), scanner.nextInt());
        scanner.nextLine();
        Livro livro2 = new Livro(scanner.nextLine(), scanner.nextDouble(), scanner.nextInt());

        double valorTotal = livro1.calcularValor() + livro2.calcularValor();
        int quantidadeTotal = livro1.quantidade + livro2.quantidade;

        System.out.printf("Valor total da compra: %.2f\n", valorTotal);
        System.out.println("Numero de livros comprados: " + quantidadeTotal);
        System.out.println("Obrigado por comprar na nossa livraria!");

        scanner.close();

    }

    static class Livro {
        String nome;
        double preco;
        int quantidade;

        Livro(String nome, double preco, int quantidade) {
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
        }

        double calcularValor() {
            return preco * quantidade;
        }
    }
}
