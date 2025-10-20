package processadorRisco;

public class ProcessadorRisco {
    public static void main(String[] args) {

        int[] notasRisco = {15, 80, 60, 90, 45, 20, 30, 75, 100, 10, 55, 65, 35, 95, 85};

        double somaPonderada = 0;
        int somaPesos = 0;

        for (int i = 0; i < notasRisco.length; i++) {
            if (i <= 4) { 
                somaPonderada += notasRisco[i] * 3;
                somaPesos += 3;
            } else { 
                somaPonderada += notasRisco[i] * 1;
                somaPesos += 1;
            }
        }

        double mediaPonderada = somaPonderada / somaPesos;
        System.out.println("Média Ponderada de Risco: " + mediaPonderada);

        int otimistas = 0;
        int alarmantes = 0;

        for (int nota : notasRisco) {
            if (nota <= 20) {
                otimistas++;
            } else if (nota >= 90) {
                alarmantes++;
            }
        }

        System.out.println("Analistas Otimistas: " + otimistas);
        System.out.println("Analistas Alarmantes: " + alarmantes);

        System.out.println("\n=== Parecer Final ===");
        if (mediaPonderada > 70) {
            System.out.println("Alto Risco: Venda ou reajuste de portfólio recomendado.");
        } else if (mediaPonderada >= 40 && mediaPonderada <= 70) {
            System.out.println("Risco Moderado: Acompanhar de perto, mas manter os ativos.");
        } else {
            System.out.println("Baixo Risco: Excelente momento para capitalização.");
        }
    }
}
