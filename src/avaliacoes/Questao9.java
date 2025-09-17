package avaliacoes;

import java.util.Scanner;

public class Questao9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] valores = new int[3];

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Digite um valor:");
            valores[i] = input.nextInt();
        }

        //Duplica todos os índices do vetor
        for (int i = 0; i < valores.length; i++) {
            valores[i] *= 2;
        }

        //Exibe os índices duplicados
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }

    }

}

