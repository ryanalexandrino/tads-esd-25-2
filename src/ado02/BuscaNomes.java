package ado02;

import javax.swing.*;
import java.util.ArrayList;

public class BuscaNomes {

    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();

        // Lista pré-definida
        nomes.add("Ryan");
        nomes.add("Daniel");
        nomes.add("Murilo");
        nomes.add("Marcelo");
        nomes.add("Adriano");

        // Entrada via JOptionPane
        String nomeBusca = JOptionPane.showInputDialog(null, "Digite um nome para buscar:");

        boolean encontrado = false;
        int posicao = -1;

        // Busca
        for (int i = 0; i < nomes.size(); i++) {
            if (nomes.get(i).equalsIgnoreCase(nomeBusca)) {
                encontrado = true;
                posicao = i + 1; // posição para exibir (começa do 1)
                break;
            }
        }

        // Resultado da busca
        if (encontrado) {
            JOptionPane.showMessageDialog(null,
                    "Nome encontrado na posição: " + posicao,
                    "Resultado da Busca",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Nome não encontrado na lista.",
                    "Resultado da Busca",
                    JOptionPane.WARNING_MESSAGE);
        }

        // Exibir lista completa
        StringBuilder lista = new StringBuilder("Lista de nomes cadastrados:\n");
        for (String n : nomes) {
            lista.append("- ").append(n).append("\n");
        }

        JOptionPane.showMessageDialog(null, lista.toString(), "Lista Completa", JOptionPane.PLAIN_MESSAGE);
    }
}
