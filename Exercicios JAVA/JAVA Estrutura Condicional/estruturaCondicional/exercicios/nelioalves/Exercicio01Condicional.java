package estruturaCondicional.exercicios.nelioalves;

import java.util.Scanner;

public class Exercicio01Condicional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número, para verificar se é positivo ou negativo:");
        int num1 = sc.nextInt();

        if(num1 < 0){
            System.out.println("Este número é negativo!");
        } else {
            System.out.println("Este número é positivo!");
        }

        sc.close();
    }
}
