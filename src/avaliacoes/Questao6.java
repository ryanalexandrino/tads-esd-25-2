package avaliacoes;

public class Questao6 {

    public static void main(String[] args) {

        // Capacidade máxima de 10
        int[] nota = new int[10];

        // Quantidade atual de elementos
        int n = 5;

        // Lista inicial já ordenada
        nota[0] = 2;
        nota[1] = 5;
        nota[2] = 8;
        nota[3] = 12;
        nota[4] = 20;

        // Valor a ser inserido
        int valor = 10;

        // Encontrar a posição onde o valor deve ser inserido
        int pos = 0;
        while (pos < n && nota[pos] < valor) {
            pos++;
        }

        // Deslocar os elementos para a direita
        for (int i = n; i > pos; i--) {
            nota[i] = nota[i - 1];
        }

        // Inserir o valor na posição correta
        nota[pos] = valor;

        // Atualizar quantidade de elementos
        n++;

        // Mostrar resultado
        System.out.print("Lista final: ");
        for (int i = 0; i < n; i++) {
            System.out.print(nota[i] + " ");
        }
        System.out.println("\nNovo valor de n: " + n);
    }
}
