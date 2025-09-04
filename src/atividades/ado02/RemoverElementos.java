package atividades.ado02;

import javax.swing.*;
import java.util.ArrayList;

public class RemoverElementos {

    public static void main(String[] args) {

        ArrayList<String> elementos = new ArrayList<>();
        String resposta = "S";

        // Adicionar elementos
        while (resposta.equalsIgnoreCase("S")) {
            String elemento = JOptionPane.showInputDialog(null, "Insira o elemento:");
            if (elemento != null && !elemento.strip().isEmpty()) {
                elementos.add(elemento.strip());
            }

            resposta = JOptionPane.showInputDialog(null,
                    "Deseja adicionar mais elementos?\n[S] Sim\n[N] Ir para remoção");

            while (resposta == null || (!resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("N"))) {
                resposta = JOptionPane.showInputDialog(null,
                        "Opção inválida! Digite S para continuar ou N para ir para remoção:");
            }
        }

        // Mostrar lista antes da remoção
        StringBuilder listaAntes = new StringBuilder("Lista atual:\n");
        for (String e : elementos) {
            listaAntes.append("- ").append(e).append("\n");
        }
        JOptionPane.showMessageDialog(null, listaAntes.toString(), "Lista Antes da Remoção", JOptionPane.INFORMATION_MESSAGE);

        // Remoção
        String itemRemover = JOptionPane.showInputDialog(null, "Digite o elemento que deseja remover:");
        String mensagem;
        if (itemRemover != null && elementos.remove(itemRemover.strip())) {
            mensagem = "Elemento removido com sucesso!";
        } else {
            mensagem = "Elemento não encontrado na lista!";
        }
        JOptionPane.showMessageDialog(null, mensagem, "Resultado", JOptionPane.INFORMATION_MESSAGE);

        // Mostrar lista atualizada
        StringBuilder listaDepois = new StringBuilder("Lista atualizada:\n");
        if (elementos.isEmpty()) {
            listaDepois.append("(A lista está vazia)");
        } else {
            for (String e : elementos) {
                listaDepois.append("- ").append(e).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, listaDepois.toString(), "Lista Atualizada", JOptionPane.PLAIN_MESSAGE);
    }
}
