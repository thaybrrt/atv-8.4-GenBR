package atv01;

import java.util.Scanner;

public class excercicio1 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Salário: ");
        float salario = scanner.nextFloat();

        System.out.print("Abono: ");
        float abono = scanner.nextFloat();

        scanner.close();

        // Calcular 
        float novoSalario = salario + abono;

        // mostrar salario
        System.out.printf("\nNovo Salário: %.2f%n", novoSalario);
        
    }
}
