package aulas.aula05;

import java.util.Scanner;

public class VetoresWhile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Criar um vetor com 3 índices
        int[] valores = new int[3];
        int i = 0;

        //Laço de repetição que preenche o vetor
        while (i < valores.length) {
            System.out.println("Digite um valor:");
            valores[i] = input.nextInt();
            i ++;
        }

        while (i < valores.length){
            valores[i] *= 2;
            i ++;
        }

        while (i < valores.length){
            System.out.println(valores[i]);
            i ++;
        }

    }

}
