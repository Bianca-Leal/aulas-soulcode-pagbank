package br.com.soulcode.herancaatv1;

public class Carro extends Veiculo {
    private int numero_portas;

    public Carro(String marca, String modelo, int numero_portas, String cor, String ano) {
        super(marca, modelo, 0, cor, ano); // Adicionei 0 como valor padrão para cilindradas
        this.numero_portas = numero_portas;
    }

    public void mostrarDadosCarro() {
        super.mostrarDados();
        System.out.println("Numero de portas = " + numero_portas);
    }
}