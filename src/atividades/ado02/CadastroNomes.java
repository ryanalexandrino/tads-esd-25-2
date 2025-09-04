package atividades.ado02;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CadastroNomes {

    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();

        System.out.println("========== Cadastro de Nomes ==========");

        Scanner input = new Scanner(System.in);
        String resposta = "S";

        while (resposta.equals("S")) {

            System.out.printf("Escreva o nome de uma pessoa: ");
            nomes.add(input.nextLine().strip());

            System.out.println("Deseja adicionar mais pessoas?");
            System.out.println("[S]. Adicionar mais pessoas");
            System.out.println("[N]. Encerrar o programa");
            resposta = input.nextLine().strip().toUpperCase();

            while (!resposta.equals("S") && !resposta.equals("N")) {
                System.out.println("Opção Inválida! Tente novamente..");
                resposta = input.nextLine().strip().toUpperCase();
            }

        }

        // Converte a lista para uma String formatada
        StringBuilder listaPessoas = new StringBuilder("Itens da lista:\n");
        for (String item : nomes) {
            listaPessoas.append(" - ").append(item).append("\n");
        }

        JOptionPane.showMessageDialog(null, listaPessoas.toString());

    }

}
