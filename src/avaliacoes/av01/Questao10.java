package avaliacoes.av01;

import java.util.Stack;

public class Questao10 {

    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();
        for(int i = 1; i <= 5 ;i++)
        {
            pilha.push(i);
        }

        while(!pilha.isEmpty())
        {
            int valor = pilha.pop();
            System.out.print(valor + " ");
        }
    }

}
