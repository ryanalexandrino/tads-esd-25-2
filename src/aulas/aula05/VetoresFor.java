package aulas.aula05;

import java.util.Scanner;

public class VetoresFor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Criar um vetor com 3 índices
        int[] valores = new int [3];

        //Laço de repetição que preenche o vetor
        for (int i = 0; i < valores.length; i++){
            System.out.println("Digite um valor:");
            valores[i] = input.nextInt();
        }

        //Duplica todos os índices do vetor
        for (int i = 0; i < valores.length; i++){
            valores[i] *= 2;
        }

        //Exibe os índices duplicados
        for (int i = 0; i < valores.length; i++){
            System.out.println(valores[i]);
        }

    }

}
