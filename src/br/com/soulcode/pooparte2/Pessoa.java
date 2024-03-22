package br.com.soulcode.pooparte2;

public class Pessoa {
    public String setNome;
    private String nome = "Rafael";
    private int idade = 10;

    public String getnome(){
        return nome;
    }

    public int getIdade(){ //get para visualizar
        return idade;
    }

    public void setNome(String nome){ //set para mudar
        this.nome = nome ;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
}
