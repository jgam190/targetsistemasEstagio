import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {

    static void gerarFaturamento(ArrayList<Integer> lista) {
        Random random = new Random();

        for (int i = 0; i < 30; i++) {
            int faturamentoDiario = random.nextInt(1000); //
            lista.add(faturamentoDiario);
        }
    }

    static double calcularMediaMensal(ArrayList<Integer> lista) {
        int somaFaturamento = 0;
        for (int valor : lista) {
            somaFaturamento += valor;
        }
        return (double) somaFaturamento / lista.size();
    }

    static int contarDiasAcimaDaMedia(ArrayList<Integer> lista, double media) {
        int diasAcimaDaMedia = 0;
        for (int valor : lista) {
            if (valor > media) {
                diasAcimaDaMedia++;
            }
        }
        return diasAcimaDaMedia;
    }

    public static void main(String[] args) {
        ArrayList<Integer> faturamentoMensal = new ArrayList<>();
        gerarFaturamento(faturamentoMensal);

        int menorFaturamento = Collections.min(faturamentoMensal);
        int maiorFaturamento = Collections.max(faturamentoMensal);
        double mediaFaturamento = calcularMediaMensal(faturamentoMensal);
        int diasAcimaDaMedia = contarDiasAcimaDaMedia(faturamentoMensal, mediaFaturamento);

        System.out.println("Menor valor de faturamento em um dia do mês: " + menorFaturamento);
        System.out.println("Maior valor de faturamento em um dia do mês: " + maiorFaturamento);
        System.out.println("Número de dias com faturamento superior a média mensal: " + diasAcimaDaMedia);
    }
}
