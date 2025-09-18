package aulas.aula06;

import java.util.Scanner;
import java.util.Stack;

public class PilhaLIFO {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Cria uma pilha (LIFO)
        Stack<Integer> pilha = new Stack<>();

        // Cria a variável de escolha do usuário (binária)
        int opcao = 1;

        // Laço de repetição que povoa a pilha com base no input do usuário
        while (opcao == 1){
            System.out.println("Digite um número inteiro:");
            pilha.push(input.nextInt());
            System.out.println("Deseja digitar mais número? \n" +
                    "[1] Sim! \n" +
                    "[0] Não..");
            opcao = input.nextInt();
        };

        // Exibe a pilha criada
        System.out.println("Questao10 criada: " + pilha);

        // Lê do usuário quantos elementos serão retirados da pilha
        System.out.println("\nDigite quantos elementos deseja retirar:");
        int elemetosRetirados = input.nextInt();

        // Laço de repetição que remove a quantidade de itens especificada pelo usuário
        for (int i = 0; i < elemetosRetirados; i ++){
            System.out.println("Removido: " + pilha.pop());
        }

        // Exibe a pilha após a remoção
        System.out.println("\nLista após a remoção:" + pilha);

    }

}
