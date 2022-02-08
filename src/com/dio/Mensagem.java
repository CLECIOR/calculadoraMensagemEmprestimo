package com.dio;
    //A partir da hora do dia informa mensagem de Bom dia, Boa tarde ou Boa noite
public class Mensagem {

    public static void mensagem(int horario){

        switch (horario){
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                System.out.println("Boa Noite");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("Bom dia");
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                System.out.println("Boa tarde");
                break;

        }

    }
}

