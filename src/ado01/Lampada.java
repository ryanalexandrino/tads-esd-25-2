
package ado01;

public class Lampada {
    //Atributos
    private String tipo;
    private String cor;
    private String marca;
    private int voltagem;
    private int potencia;
    private float preco;
    private boolean status;

    //Método construtor
    public Lampada(String tipo, String cor, String marca, int voltagem, int potencia, float preco, boolean status) {
        this.tipo = tipo;
        this.cor = cor;
        this.marca = marca;
        this.voltagem = voltagem;
        this.potencia = potencia;
        this.preco = preco;
        this.status = status;
    }

    //Getters e Setters

    //Tipo
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //Cor
    public String getCor() {
        return cor;
    }

    public void setCor(String Cor) {
        this.cor = cor;
    }

    //Marca
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //Voltagem
    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem() {
        this.voltagem = voltagem;
    }

    //Potencia
    public int getPotencia() {
        return potencia;
    }

    public void setPotencia() {
        this.potencia = potencia;
    }

    //Preco
    public float getPreco() {
        return preco;
    }

    public void setPreco() {
        this.preco = preco;
    }

    //Status
    public boolean isStatus() {
        return status;
    }

    // Setter
    public void setStatus(boolean status) {
        this.status = status;
    }

    // Métodos que mudam o atributo status
    public void apagar(){
        status = false;
    }

    public void acender(){
        status = false;
    }

    @Override
    public String toString() {
        return "A lampada é do tipo " + tipo + " sendo da cor " + cor + " e da marca " + marca + ". Sua voltagem é " + voltagem + " sua potencia "  ;
    }

}
