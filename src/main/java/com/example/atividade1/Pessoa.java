package com.example.atividade1;

public class Pessoa {


    String nome;
    int idade;

    String sexo;



    public Pessoa(String nome, int idade, String sexo){

        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public void imprimirInfo(){
        System.out.println("Nome: "  +  this.nome);
        System.out.println("Idade: " +  this.idade);
        System.out.println("Sexo: "  +  this.sexo);
        System.out.println("---------------------");
    }











}


