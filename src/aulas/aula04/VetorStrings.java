package aulas.aula04;

import java.util.Scanner;

public class VetorStrings {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Laço de Strings de tamanho 10 que representa os nomes
        String nomes [] = new String[10];

        // Laço que preenche o vetor com input do usuário
        for (int i = 0; i < nomes.length; i++){
            System.out.println("Digite um nome:");
            nomes[i] = input.nextLine();
        }

        // Laço que exibe todos os nomes preenchidos
        System.out.println("========== Lista de nomes ==========");
        for (int i = 0; i < nomes.length; i++){
            System.out.printf("[%d] - %s\n", i+1, nomes[i]);
        }

    }
}
