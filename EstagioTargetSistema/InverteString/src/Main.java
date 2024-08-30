
import java.util.Scanner;

public class Main {

    public static String CharparaString(char[] a)
    {
        // Creating object of String class
        String string = new String(a);

        return string;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escreva um texto");
        String texto = scan.nextLine();

        char[] ListaTexto = new char[texto.length()];
        for(int i =0;i<texto.length();i++){
            ListaTexto[i]=texto.charAt(texto.length()-1-i);
        }
        System.out.println(CharparaString(ListaTexto));


    }
}