package estruturaCondicional.exercicios.nelioalves;

import java.util.Scanner;

public class Exercicio05Condicional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("**********************");
        System.out.println("      Cardapio");
        System.out.println("**********************");

        System.out.println("Código   Especificação   Preço");
        System.out.println("  1     Cachorro Quente  R$ 4.0" );
        System.out.println("  2       X-Salada       R$ 4.50" );
        System.out.println("  3       X-Bacon        R$ 5.0" );
        System.out.println("  4     Torrada Simples  R$ 2.0" );
        System.out.println("  5      Refrigerante    R$ 1.50" );

        System.out.println("Qual o código do produto que você deseja: ");
        double codigo = sc.nextDouble();

        System.out.println("Quantas unidades deseja: ");
        double quantidade = sc.nextDouble();

        double total;

        if (codigo == 1){
            total = quantidade * 4.0;
        } else if (codigo == 2){
            total = quantidade * 4.50;
        } else if (codigo == 3){
            total = quantidade * 5.0;
        } else if (codigo == 4){
            total = quantidade * 2.0;
        } else {
            total = quantidade * 1.50;
        }

        System.out.println("Valor total foi: "+total);
        sc.close();
    }
}
