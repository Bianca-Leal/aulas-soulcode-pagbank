package br.com.soulcode.herancaatv1;

public class Main {
    public static void main(String[] args) {
        // Criando um objeto Carro
        Carro carro = new Carro("Fiat", "Palio", 4, "Prata", "2019");
        carro.mostrarDadosCarro(); // Mostrando os dados do carro

        System.out.println(); // Adicionando uma linha em branco

        // Criando um objeto Moto
        Moto moto = new Moto("Honda", "CB300", 300, "Preto", "2020");
        moto.mostrarDadosMoto(); // Mostrando os dados da moto
    }
}
