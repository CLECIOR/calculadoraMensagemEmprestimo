package com.dio;

public class Main {

    public static void main(String[] args){

        //calculadora
        System.out.println(" Calculadora ");
        Calculadora.soma(100,250);
        Calculadora.subtracao(500,250);
        Calculadora.multiplicacao(175,250);
        Calculadora.divisao(1000,250);

        //Mensagem
        System.out.println(" Mensagem ");
        Mensagem.mensagem((int) 22);

        //Emprestimo
        System.out.println(" Emprestimo ");
        Emprestimo.calcular(1000,Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000,Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000,5);


    }
}
