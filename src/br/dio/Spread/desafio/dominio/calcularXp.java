package br.dio.Spread.desafio.dominio;

import java.util.Scanner;

public class calcularXp {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        float Xp;
        int cont = 0;
        int total = 0;

        while (cont < 4) {
            Xp = leitor.nextFloat();
            if (Xp > 0) {
                total++;
            }
            System.out.println(total + " calcular Xp");
        }
    }
}