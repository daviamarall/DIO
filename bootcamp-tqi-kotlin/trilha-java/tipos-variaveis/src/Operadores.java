import java.time.LocalDate;

import javax.sound.midi.Soundbank;
import javax.swing.plaf.synth.SynthIcon;

public class Operadores {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // Atribuição
        String nome = "DAVI";
        int idade = 32;
        double peso = 83.50;
        char sexo = 'M';
        boolean doadorOrgao = false;
        LocalDate dataNascimento = LocalDate.now();

        System.out.println("Exemplo String : " + nome);
        System.out.println("Exemplor Int : " + idade);
        System.out.println("Exemplo Double : " + peso);
        System.out.println("Exemplo Char : " + sexo);
        System.out.println("Exemplo Boolean : " + doadorOrgao);
        System.out.println("Exemplo LocalDate : " + dataNascimento);

        // Aritiméticos
        double soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);

        System.out.println(" ");
        System.out.println("Exemplo Soma: 10.5 + 15.7 = " + soma);
        System.out.println("Exemplo Subtração: 113 - 25 = " + subtração);
        System.out.println("Exemplo Multplicação: 20 * 7 = " + multiplicacao);
        System.out.println("Exemplo Divisão: 15 / 3 = " + divisao);
        System.out.println("Modulo: 18 % 3 " + modulo);
        System.out.println("Exemplo Resultado: (10 * 7) + (20 / 4) = " + resultado);

        // Concatenação
        String Linguagem = "LINGUAGEM" + " " + "JAVA";

        System.out.println("Linguagem : " + Linguagem);
        System.out.println(" ");

        // Unarios
        int numero = 5;

        // Imprimindo o numero negativo
        System.out.println(-numero);

        // incrementando numero em mais 1 numero, imprime 6
        numero++;
        System.out.println(numero);

        // incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero++);// ops algo de errado não está certo

        System.out.println(numero);// agora sim, numero virou 7

        // ordem de precedencia conta aqui
        System.out.println(++numero);

        boolean verdadeiro = true;

        System.out.println("Inverteu " + !verdadeiro);


        // Ternario
    
        int a, b;

        a = 5;
        b = 6;

        /*
         * EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
         * if(a==b)
         * resultado = "verdadeiro";
         * else
         * resultado = "falso";
         */

        // MESMA CONDICIONAL, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String resultado1 = (a == b) ? "verdadeiro" : "false";

        System.out.println("Resultado: " + resultado1);

        
    }

}
