import javax.swing.JOptionPane;

public class ProgramaTeste {

    public static void main(String[] args) {

        //crie um programa que receba a temperatura em média dos 6 primeiros meses do ano e armaze-as em uma lista.
        //Após isso, calcule a média semestral das temperaturas acima desta média semestral, e em que mês elas ocorreram.
        //Exemplo: Temperaturas: 20, 25, 30, 35, 40, 45. Média semestral: 32,5. Temperaturas acima da média: 35, 40, 45. Meses: 4, 5, 6.

        double[] temperaturas = new double[6];
        double mediaSemestral = 0;
        double soma = 0;
        int contador = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            temperaturas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura do mês " + (i + 1)));
            soma += temperaturas[i];
        }

        mediaSemestral = soma / temperaturas.length;

        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > mediaSemestral) {
                contador++;
                System.out.println("Temperatura acima da média: " + temperaturas[i] + " Mês: " + (i + 1));
            }
        }

        System.out.println("Média semestral: " + mediaSemestral);
        System.out.println("Quantidade de temperaturas acima da média: " + contador);

    }
    
}
