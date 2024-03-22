package br.com.soulcode.herancaatv1;

public class Veiculo {

    private String marca;
    private String modelo;
    private String cor;
    private String ano;


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }


    public Veiculo(String marca, String modelo, int cilindradas, String cor, String ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public void mostrarDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo = " + modelo);
    }
}
