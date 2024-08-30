import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double SP = 67836.43,RJ = 36678.66,MG = 29229.88,ES = 27165.48,Outros = 19849.53;
        double soma = SP+RJ+MG+ES+Outros;

        // Calculando a porcentagem de cada valor em relação à soma
        double porcentagemSP = (SP / soma) * 100;
        double porcentagemRJ = (RJ / soma) * 100;
        double porcentagemMG = (MG / soma) * 100;
        double porcentagemeES = (ES / soma) * 100;
        double porcentagemOutros = (Outros / soma) * 100;

        // Exibindo os resultados
        System.out.printf("Porcentagem de SP: %.2f%%\n", porcentagemSP);
        System.out.printf("Porcentagem de RJ: %.2f%%\n", porcentagemRJ);
        System.out.printf("Porcentagem de MG: %.2f%%\n", porcentagemMG);
        System.out.printf("Porcentagem de ES: %.2f%%\n", porcentagemeES);
        System.out.printf("Porcentagem de Outros: %.2f%%\n", porcentagemOutros);

        scanner.close();
    }
}
