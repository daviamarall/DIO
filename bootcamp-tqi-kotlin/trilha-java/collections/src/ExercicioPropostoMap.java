import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExercicioPropostoMap {

    public static void main(String[] args) {

        // Dada a população estimada de alguns estados do NE brasileiro, faça:
        // Estado = PE - População = 9.616.621
        // Estado = AL - População = 3.351.543
        // Estado = CE - População = 9.187.103
        // Estado = RN - População = 3.534.265
        // Crie um dicionário e relacione os estados e suas populações;
        // Substitua a população do estado do RN por 3.534.165;
        // Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277;
        // Exiba a população PE;
        // Exiba todos os estados e suas populações na ordem que foi informado;
        // Exiba os estados e suas populações em ordem alfabética;
        // Exiba o estado com o menor população e sua quantidade;
        // Exiba o estado com a maior população e sua quantidade;
        // Exiba a soma da população desses estados;
        // Exiba a média da população deste dicionário de estados;
        // Remova os estados com a população menor que 4.000.000;
        // Apague o dicionário de estados;
        // Confira se o dicionário está vazio.

        Map<String, Integer> estados = new HashMap<>();
        estados.put("PE", 9616621);
        estados.put("AL", 3351543);
        estados.put("CE", 9187103);
        estados.put("RN", 3534265);

        System.out.println("A. Crie um dicionário e relacione os estados e suas populações");
        System.out.println(estados);

        System.out.println(" ");
        System.out.println("B. Substitua a população do estado do RN por 3.534.165");
        estados.put("RN", 3534165);
        System.out.println(estados);

        System.out.println(" ");
        System.out.println("C. Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277");
        estados.put("PB", 4039277);
        System.out.println(estados);

        System.out.println(" ");
        System.out.println("D. Exiba a população PE");
        System.out.println(estados.get("PE"));

        System.out.println(" ");
        System.out.println("E. Exiba todos os estados e suas populações na ordem que foi informado");
        Map<String, Integer> estados2 = new LinkedHashMap<>();
        estados2.put("PE", 9616621);
        estados2.put("AL", 3351543);
        estados2.put("CE", 9187103);
        estados2.put("RN", 3534265);
        System.out.println(estados2);

        System.out.println(" ");
        System.out.println("F. Exiba os estados e suas populações em ordem alfabética");
        Map<String, Integer> estados3 = new TreeMap<>(estados);
        System.out.println(estados3);

        System.out.println(" ");
        System.out.println("G. Exiba o estado com o menor população e sua quantidade");
        Integer menorPopulacao = Collections.min(estados.values());
        Set<Map.Entry<String, Integer>> entries = estados.entrySet();
        String estadoMenorPopulacao = "";
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue().equals(menorPopulacao)) {
                estadoMenorPopulacao = entry.getKey();
                System.out.println(estadoMenorPopulacao + " - " + menorPopulacao);
            }

        }

    }

}
