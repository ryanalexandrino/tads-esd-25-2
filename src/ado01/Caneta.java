
package ado01;

public class Caneta {
    //Atributos
    private String marca;
    private String cor;
    private float tamanho;

    // Método construtor
    public Caneta(String marca, String cor, float tamanho) {
        this.marca = marca;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    // Métodos getters e setters
    //Marca
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //Cor
    public String getCor() {
        return cor;
    }

    public void setCor(String Cor) {
        this.marca = cor;
    }

    //Tamanho
    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "A caneta é uma " + marca + ", de cor " + cor + " e tamanho! " + tamanho;
    }

}
