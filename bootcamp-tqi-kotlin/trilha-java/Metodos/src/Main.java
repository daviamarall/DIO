public class Main {

    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercicio calculadora");
        Calculadora.soma(5, 5);
        Calculadora.subtracao(10, 5);
        Calculadora.multiplicacao(200, 100);
        Calculadora.divisao(10, 2);

        System.out.println();

        // Mensagem 
        System.out.println("Exercicio mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        System.out.println();

        // Empréstimo 
        System.out.println("Exercicio empréstimo");
        Emprestimo.calcular(10000, 2);
        Emprestimo.calcular(50000, 3);
        Emprestimo.calcular(15000, 5);

        System.out.println();

        // Quadrilátero
        System.out.println("Exercício quadrilátero");
        Quadrilatero.area(3);
        Quadrilatero.area(5d,5d);
        Quadrilatero.area(7,8,9);
        Quadrilatero.area(5f,5f);


    }
}
