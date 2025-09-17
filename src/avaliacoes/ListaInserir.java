package avaliacoes;

import java.util.Scanner;

public class ListaInserir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] lista = new int[50];
        int quantidade = 0;
        int valor;
        int maior = 0;
        int menor = 0;

        do {
            System.out.print("Digite um valor (0 para sair): ");
            valor = sc.nextInt();

            if (valor != 0) {

                lista[quantidade] = valor;

                if (quantidade == 0){
                    menor = valor;
                }
                if(maior < valor){
                    maior = valor;
                }else if (menor > valor) {
                    menor = valor;
                }

                quantidade++;
            }
        } while (valor != 0 && quantidade < 50);

        System.out.println("Valores inseridos:");
        for (int i = 0; i < quantidade; i++) {
            System.out.print(lista[i] + " ");
        }

        System.out.println("\nQuantidade de números digitados: " + quantidade);
        System.out.println("\nO maior valor é: " + maior);
        System.out.println("\nO menor valor é: " + menor);
        sc.close();
    }
}