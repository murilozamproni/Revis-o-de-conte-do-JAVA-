package estruturasequencial.exercicios.nelioalves;

import java.util.Scanner;

public class Exercicio01Squencial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 = sc.nextInt();

        System.out.println("Digite outro número: ");
        int num2 = sc.nextInt();

        int soma;

        soma = num1 + num2;

        System.out.print("Resultado da soma é: "+soma);

        sc.close();
    }
}
