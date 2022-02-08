package com.dio;
    //calcula o valor final de um emprestimo. Taxas e parcelas influenciam no total.
public class Emprestimo {

        public static int getDuasParcelas() {

            return 2;
        }

        public static int getTresParcelas() {

            return 3;
        }

        public static double getTaxaDuasParcelas() {

            return 0.2;
        }

        public static double getTaxaTresParcelas() {

            return 0.3;
        }

        public static void calcular(double valor, int parcelas) {

            if (parcelas == 2) {
                double valorFinal = valor + (valor * getTaxaDuasParcelas());
                System.out.println("O valor final do emprestimo será: " + valorFinal);
            } else if (parcelas == 3) {
                double valorFinal = valor + (valor * getTaxaTresParcelas());
                System.out.println("O valor final do emprestimo será: " + valorFinal);
            } else {
                System.out.println("Quantidade de parcelas não aceita");
            }
        }
    }
