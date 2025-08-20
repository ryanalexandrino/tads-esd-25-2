
package ado01;

public class LampadaTeste {

    public static void main(String[] args) {

        //Criação de objetos
        Lampada lampada1 = new Lampada("Led", "Branca", "Philips",127,40, 13, false);
        Lampada lampada2 = new Lampada("Fluorescente", "Amarela", "Avant",220,15, 4, false);

        System.out.println(lampada1.toString());
        System.out.println(lampada2.toString());;

        //Compara a potência das lâmpadas
        if (lampada1.getPotencia() > lampada2.getPotencia()) {
            System.out.println("A lâmpada 1 é mais potente!");
        }
        else if (lampada1.getPotencia() < lampada2.getPotencia()) {
            System.out.println("A lâmpada 2 é mais potente!");
        }
        else {
            System.out.println("As duas lâmpada possuem a mesma potência!");
        }

        //Compara o preço da lâmpadas
        if (lampada1.getPreco() > lampada2.getPreco()) {
            System.out.println("A lâmpada 1 é mais cara!");
        }
        else if (lampada1.getPreco() < lampada2.getPreco()) {
            System.out.println("A lâmpada 2 é mais cara!");
        }
        else {
            System.out.println("As duas lâmpada possuem o mesmo preço!");
        }

    }

}
