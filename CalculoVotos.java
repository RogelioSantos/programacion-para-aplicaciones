import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CalculoVotos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> votosPorCandidato = new HashMap<>();
        int totalVotos = 0;

        System.out.println("Ingrese el número del candidato (o 0 para terminar):");

        while (true) {
            int voto = scanner.nextInt();

            if (voto == 0) {
                break;
            }

            votosPorCandidato.put(voto, votosPorCandidato.getOrDefault(voto, 0) + 1);
            totalVotos++;
        }

        if (totalVotos == 0) {
            System.out.println("No se ingresaron votos.");
        } else {
            System.out.println("Resultados de los votos:");
            for (Map.Entry<Integer, Integer> entry : votosPorCandidato.entrySet()) {
                int candidato = entry.getKey();
                int votos = entry.getValue();
                double porcentaje = (votos * 100.0) / totalVotos;
                System.out.printf("Candidato %d: %.2f%% de los votos\n", candidato, porcentaje);
            }
        }

        scanner.close();
    }
}