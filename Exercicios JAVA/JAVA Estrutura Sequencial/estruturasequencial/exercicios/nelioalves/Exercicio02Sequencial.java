package estruturasequencial.exercicios.nelioalves;

import java.util.Scanner;

public class Exercicio02Sequencial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;

        System.out.println("Digite o valor do raio: ");
        double valorRaio = sc.nextDouble();

        double area = pi * (valorRaio * valorRaio);
        System.out.println("O valor da area é: "+area);
        sc.close();
    }
}
