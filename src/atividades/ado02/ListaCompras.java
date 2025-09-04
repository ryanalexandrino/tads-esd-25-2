package atividades.ado02;

import javax.swing.*;
import java.util.ArrayList;

public class ListaCompras {

    public static void main(String[] args) {

        ArrayList<String> elementos = new ArrayList<>();
        String resposta = "";

        do {
            // Menu principal
            resposta = JOptionPane.showInputDialog(null,
                    "=== GERENCIADOR DE LISTA ===\n" +
                            "[1] Adicionar elemento\n" +
                            "[2] Remover elemento\n" +
                            "[3] Visualizar lista\n" +
                            "[4] Sair\n" +
                            "Escolha uma opção:",
                    "Menu Principal",
                    JOptionPane.QUESTION_MESSAGE
            );

            if (resposta == null) { 
                break;
            }

            switch (resposta) {
                case "1": // Adicionar elemento
                    String novoElemento = JOptionPane.showInputDialog(null, "Digite o elemento para adicionar:");
                    if (novoElemento != null && !novoElemento.strip().isEmpty()) {
                        elementos.add(novoElemento.strip());
                        JOptionPane.showMessageDialog(null,
                                "Elemento adicionado com sucesso!",
                                "Adicionar",
                                JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Elemento inválido! Tente novamente.",
                                "Erro",
                                JOptionPane.ERROR_MESSAGE);
                    }
                    break;

                case "2": // Remover elemento
                    if (elementos.isEmpty()) {
                        JOptionPane.showMessageDialog(null,
                                "A lista está vazia! Nada para remover.",
                                "Remover",
                                JOptionPane.WARNING_MESSAGE);
                        break;
                    }

                    String itemRemover = JOptionPane.showInputDialog(null,
                            "Digite o elemento que deseja remover:");
                    if (itemRemover != null && elementos.remove(itemRemover.strip())) {
                        JOptionPane.showMessageDialog(null,
                                "Elemento removido com sucesso!",
                                "Remover",
                                JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Elemento não encontrado na lista.",
                                "Erro",
                                JOptionPane.ERROR_MESSAGE);
                    }
                    break;

                case "3": // Visualizar lista
                    StringBuilder lista = new StringBuilder("=== LISTA DE ELEMENTOS ===\n");
                    if (elementos.isEmpty()) {
                        lista.append("(A lista está vazia)");
                    } else {
                        for (String e : elementos) {
                            lista.append("- ").append(e).append("\n");
                        }
                    }
                    JOptionPane.showMessageDialog(null,
                            lista.toString(),
                            "Visualização",
                            JOptionPane.PLAIN_MESSAGE);
                    break;

                case "4": // Sair
                    JOptionPane.showMessageDialog(null,
                            "Encerrando o programa...",
                            "Saindo",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;

                default:
                    JOptionPane.showMessageDialog(null,
                            "Opção inválida! Escolha entre 1 e 4.",
                            "Erro",
                            JOptionPane.ERROR_MESSAGE);
                    break;
            }

        } while (!"4".equals(resposta)); // Sai quando digitar 4
    }
}
