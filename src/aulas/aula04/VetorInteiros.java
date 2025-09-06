package aulas.aula04;

import java.util.Scanner;

public class VetorInteiros {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Laço de inteiros de tamanho 10 que representa as idades
        int idades [] = new int[3];

        // Variavél que ira armazenar a soma das idades
        int somaIdades = 0;

        // Laço que lê as idades e as soma
        for (int i = 0; i < idades.length; i++){
            System.out.println("Digite a idade:");
            idades[i] = input.nextInt();
            somaIdades += idades[i];
        }

        // Variável que calcula a média das idades
        int media = somaIdades / idades.length;

        // Exibe a média das idades
        System.out.println("===== Media das idades =====");
        System.out.println(media);

    }

}
