package aulas.aula04;

import java.util.Scanner;

public class VetorStrings {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nomes [] = new String[10];

        for (int i = 0; i < nomes.length; i++){
            System.out.println("Digite um nome:");
            nomes[i] = input.nextLine();
        }

        System.out.println("========== Lista de nomes ==========");
        for (int i = 0; i < nomes.length; i++){
            System.out.printf("[%d] - %s\n", i+1, nomes[i]);
        }

    }
}
