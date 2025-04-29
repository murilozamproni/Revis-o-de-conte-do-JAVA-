package estruturaCondicional.exercicios.nelioalves;

import java.util.Scanner;

public class Exercicio04Condicional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a hora inicial do seu jogo: ");
        int horaInicial = sc.nextInt();

        System.out.println("Digite a hora que seu jogo terminou: ");
        int horaFinal = sc.nextInt();

        int duracao;
        if(horaInicial < horaFinal){
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O jogo durou: "+duracao + " horas");

        sc.close();
    }
}
