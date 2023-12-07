package atv01;

import java.util.Scanner;
import java.text.DecimalFormat;

public class excercicio2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nota 1: ");
        float nota1 = scanner.nextFloat();

        System.out.print("Nota 2: ");
        float nota2 = scanner.nextFloat();

        System.out.print("Nota 3: ");
        float nota3 = scanner.nextFloat();

        System.out.print("Nota 4: ");
        float nota4 = scanner.nextFloat();

        scanner.close();

        // calcular a média final
        float mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;

        
        DecimalFormat formato = new DecimalFormat("#.#");
        String mediaFinalFormatada = formato.format(mediaFinal);

        // mostrar média final
        System.out.println("\nMédia final: " + mediaFinalFormatada);
    }
}
