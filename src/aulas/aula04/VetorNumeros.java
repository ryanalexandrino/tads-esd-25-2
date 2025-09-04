package aulas.aula04;

import java.util.Scanner;

public class VetorNumeros {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int idades [] = new int[3];

        int total = 0;

        for (int i = 0; i < idades.length; i++){
            System.out.println("Digite a idade:");
            idades[i] = input.nextInt();
            total += idades[i];
        }

        int media = total / idades.length;

        System.out.println("===== Media das idades =====");
        System.out.println(media);

    }

}
