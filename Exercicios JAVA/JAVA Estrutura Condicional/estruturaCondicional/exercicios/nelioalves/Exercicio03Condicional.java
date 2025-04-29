package estruturaCondicional.exercicios.nelioalves;


import java.util.Scanner;

public class Exercicio03Condicional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor = sc.nextInt();

        System.out.println("Digite outro valor: ");
        int valor02 = sc.nextInt();

        if (valor % valor02 == 0 || valor02 % valor == 0){
            System.out.println("São multiplos");
        } else {
            System.out.println("Não são multiplos");
        }

        sc.close();
    }
}
