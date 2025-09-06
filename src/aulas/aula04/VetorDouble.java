package aulas.aula04;

import java.util.Scanner;

public class VetorDouble {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Laço de números reais de tamanho 10 que representa os salários
        double salarios [] = new double[10];

        // Cria as variáveis que receberão os valores pedidos através de estrutura condicional
        double maior = 0;
        int index = 0;

        // Laço que preenche os salários via input do usuário
        for (int i = 0; i < salarios.length; i++) {
            System.out.print("Digite um sálario: R$");
            salarios[i] = input.nextDouble();
            // Condicional que verifica qual o maior salário e seu índice
            if (salarios[i] > maior) {
                maior = salarios[i];
                index = i;
            }
        }

        // Exibe qual o maior sálario e seu índice
        System.out.printf("O maior salário dentre os digitados é %.2f, que se encontra no indice [%d]!", maior, index);

    }
}
