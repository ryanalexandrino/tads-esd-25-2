package ado02;

import javax.swing.*;
import java.util.ArrayList;

public class SomaNumeros {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número:")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número:")));

        int soma = numeros.get(0) + numeros.get(1);

        JOptionPane.showMessageDialog(null,
                "A soma dos dois números é igual a: " + soma,
                "Resultado da Soma",
                JOptionPane.INFORMATION_MESSAGE);
    }

}
