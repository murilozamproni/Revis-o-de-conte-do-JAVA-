package estruturaCondicional.exercicios.nelioalves;

import java.util.Scanner;

public class Exercicio02Condicional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor = sc.nextInt();

        if (valor % 2 == 0){
            System.out.println("Seu valor é par!");
        } else {
            System.out.println("Seu valor é impar!");
        }

        sc.close();
    }
}
