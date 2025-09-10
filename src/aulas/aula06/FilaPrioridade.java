package aulas.aula06;

import java.util.PriorityQueue;

public class FilaPrioridade {

    public static void main(String[] args) {

        // Cria a fila com prioridade através da PriorityQueue
        PriorityQueue<Integer>filaPrioridade = new PriorityQueue<>();

        // Adicionando elementos a lista com prioridade
        filaPrioridade.add(5);
        filaPrioridade.add(8);
        filaPrioridade.add(3);

        // Exibe a fila em ordem crescente
        System.out.println("Fila com prioridade: " + filaPrioridade);

        // Remove elementos da fila priorizada
        while (!filaPrioridade.isEmpty()){
            System.out.println("Elemento removido " + filaPrioridade.poll());
        }

    }

}
