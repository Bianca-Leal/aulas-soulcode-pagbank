package br.com.soulcode.herancaatv1;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int cilindradas, String cor, String ano) {
        super(marca, modelo, cilindradas, cor, ano); // Passando cilindradas corretamente
        this.cilindradas = cilindradas;
    }

    public void mostrarDadosMoto() {
        super.mostrarDados();
        System.out.println("Cilindradas = " + cilindradas);
    }
}