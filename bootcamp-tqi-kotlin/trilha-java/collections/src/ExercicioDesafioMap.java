import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ExercicioDesafioMap {

    //Faça um programa que simule um lançamento de dados.
    //Lance o dado 100 vezes e armazene.
    //Depois, mostre quantas vezes cada valor foi inserido.

    public static void main(String[] args) {

        Map<Integer, Integer> dados = new HashMap<>();

        Random gerador = new Random();

        for (int i = 0; i < 100; i++) {
            int dado = gerador.nextInt(6) + 1;
            if (dados.containsKey(dado)) {
                int cont = dados.get(dado);
                dados.put(dado, cont + 1);
            } else {
                dados.put(dado, 1);
            }
        }

        System.out.println(dados);

    }
    
}
