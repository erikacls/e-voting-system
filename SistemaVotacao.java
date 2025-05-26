import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class SistemaVotacao {

    private static Map<Integer, String> candidatos = new HashMap<>();
    private static Map<Integer, Integer> votos = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        inicializarCandidatos();
        executarSistema();
        scanner.close();
    }

    private static void inicializarCandidatos() {
        // Inicializa os candidatos e a contagem de votos
        candidatos.put(1, "Candidato A");
        candidatos.put(2, "Candidato B");
        candidatos.put(3, "Candidato C");
        candidatos.put(4, "Candidato D");

        for (int i = 1; i <= 4; i++) {
            votos.put(i, 0);
        }
    }

    private static void exibirMenu() {
        System.out.println("\n--- Sistema de Votação ---");
        System.out.println("Escolha uma opção:");
        for (Map.Entry<Integer, String> entry : candidatos.entrySet()) {
            System.out.println(entry.getKey() + ". Votar em " + entry.getValue());
        }
        System.out.println("5. Mostrar Resultado");
        System.out.println("6. Sair");
        System.out.print("Opção: ");
    }

    private static void executarSistema() {
        int opcao;
        do {
            exibirMenu();
            // Valida a entrada para garantir que seja um número inteiro
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.next(); // Descarta a entrada inválida
                System.out.print("Opção: ");
            }
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                case 2:
                case 3:
                case 4:
                    registrarVoto(opcao);
                    break;
                case 5:
                    mostrarResultado();
                    break;
                case 6:
                    System.out.println("Encerrando o sistema de votação...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 6);
    }

    private static void registrarVoto(int candidatoId) {
        if (candidatos.containsKey(candidatoId)) {
            votos.put(candidatoId, votos.get(candidatoId) + 1);
            System.out.println("Voto para " + candidatos.get(candidatoId) + " registrado com sucesso!");
        } else {
            // Esta verificação é redundante devido ao switch, mas boa prática
            System.out.println("Candidato inválido.");
        }
    }

    private static void mostrarResultado() {
        System.out.println("\n--- Resultado da Votação ---");
        int totalVotos = 0;
        int maiorVotos = -1;
        String vencedor = "";
        boolean empate = false;

        for (Map.Entry<Integer, String> entry : candidatos.entrySet()) {
            int candidatoId = entry.getKey();
            String nomeCandidato = entry.getValue();
            int contagemVotos = votos.get(candidatoId);
            System.out.println(nomeCandidato + ": " + contagemVotos + " voto(s)");
            totalVotos += contagemVotos;

            if (contagemVotos > maiorVotos) {
                maiorVotos = contagemVotos;
                vencedor = nomeCandidato;
                empate = false;
            } else if (contagemVotos == maiorVotos && maiorVotos > 0) {
                vencedor += ", " + nomeCandidato;
                empate = true;
            }
        }

        System.out.println("\nTotal de votos: " + totalVotos);

        if (totalVotos == 0) {
             System.out.println("Nenhum voto foi registrado ainda.");
        } else if (empate) {
            System.out.println("Houve um empate entre: " + vencedor);
        } else {
            System.out.println("O vencedor é: " + vencedor + " com " + maiorVotos + " voto(s).");
        }
    }
}

