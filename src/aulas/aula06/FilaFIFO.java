package aulas.aula06;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaFIFO {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Cria uma pilha (LIFO)
        Queue<Integer> fila = new LinkedList<>();

        // Cria a variável de escolha do usuário (binária)
        int opcao = 1;

        // Laço de repetição que povoa a pilha com base no input do usuário
        while (opcao == 1) {
            System.out.println("Digite um número inteiro:");
            fila.add(input.nextInt());
            System.out.println("Deseja digitar mais número? \n" +
                    "[1] Sim! \n" +
                    "[0] Não..");
            opcao = input.nextInt();
        }
        ;

        // Exibe a pilha criada
        System.out.println("Pilha criada: " + fila);

        // Lê do usuário quantos elementos serão retirados da pilha
        System.out.println("\nDigite quantos elementos deseja retirar:");
        int elemetosRetirados = input.nextInt();

        // Laço de repetição que remove a quantidade de itens especificada pelo usuário
        for (int i = 0; i < elemetosRetirados; i++) {
            System.out.println("Removido: " + fila.poll());
        }

        // Exibe a pilha após a remoção
        System.out.println("\nLista após a remoção: " + fila);

    }

}
