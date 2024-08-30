import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static void gerarFibonacci(ArrayList<Integer> lista) {
        int num1 = 0, num2 = 1;

        for (int i = 0; i < 20; i++) {
            lista.add(num1);

            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> FibonacciArray = new ArrayList<>();
        gerarFibonacci(FibonacciArray);

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número para verificar se ele está na sequência de Fibonacci: ");
        int numero = scan.nextInt();

        if (FibonacciArray.contains(numero)) {
            System.out.println(numero + " está presente na sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não está presente na sequência de Fibonacci.");
        }

        scan.close();
    }
}
