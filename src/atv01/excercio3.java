package atv01;

import java.util.Scanner;

public class excercio3 {
    public static void main(String[] args) {
        //  entrada de dados
        Scanner scanner = new Scanner(System.in);

        // salário bruto, adicional noturno, horas extras e descontos
        System.out.print("Salário Bruto: ");
        float salarioBruto = scanner.nextFloat();

        System.out.print("Adicional Noturno: ");
        float adicionalNoturno = scanner.nextFloat();

        System.out.print("Horas Extras: ");
        float horasExtras = scanner.nextFloat();

        System.out.print("Descontos: ");
        float descontos = scanner.nextFloat();

        scanner.close();

        float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;

        // mostrar salário líquido
        System.out.println("\nSalário Líquido: " + salarioLiquido);
    }
}
