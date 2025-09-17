package avaliacoes;

import java.util.Scanner;

public class Questao4 {

    public static void main(String[ ] args) {

        Scanner sc = new Scanner(System.in);

        int[] lista = {7, 6, 1, 3, 4};
        int quantidade = lista.length;

        System.out.print("Digite o valor para remover: ");
        int valor = sc.nextInt();

        int posicao = -1;
        for (int i = 0; i < quantidade; i++) {
            if (lista[i] == valor) {
                posicao = i;
                break;
            }
        }

        if (posicao != -1) {
            for (int i = posicao; i < quantidade - 1; i++) {
                lista[i] = lista[i + 1];
            }
            quantidade--;

            System.out.println("Lista após remoção:");
            for (int i = 0; i < quantidade; i++) {
                System.out.print(lista[i] + " ");
            }
        } else {
            System.out.println("Valor não encontrado.");
        }

        sc.close();
    }
}