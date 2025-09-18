package avaliacoes.av01;

import java.util.Scanner;
import java.util.Stack;

public class Questao09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Stack<Integer> pilha = new Stack<>();

        int valor = 0;
        int pares = 0;

        for (int i = 0; i < 10; i++ ){
            System.out.printf("%d) Digite um valor: ", i+1);
            valor = input.nextInt();
            if (valor % 2 == 0){
                pilha.push(valor);
                pares += 1;
            }
        }

        System.out.println("Elementos removidos:");
        while (!pilha.isEmpty()){
            System.out.println("Removido: " + pilha.pop());        }
    }

}

