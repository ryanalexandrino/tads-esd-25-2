package ado02;

import javax.swing.*;
import java.util.ArrayList;

public class MediaNumeros {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a primeira nota:")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segunda nota:")));

        int soma = numeros.get(0) + numeros.get(1);
        int media = soma / numeros.size();

        if (media >= 7){
            JOptionPane.showMessageDialog(null, "Aprovado! ( Média de " + media + " !)");
        }
        else if (media <7 && media >=6){
            JOptionPane.showMessageDialog(null, "Recuperação! ( Média de " + media + " !)");
        }
        else {
            JOptionPane.showMessageDialog(null, "Reprovado! ( Média de " + media + " !)");
        }

    }

}
