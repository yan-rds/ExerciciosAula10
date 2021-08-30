package br.com.zup;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        // Faça um programa para ler 5 números e mostrar o resultado da soma desses números.
        Scanner leitor = new Scanner(System.in);

        int contador = 0;
        double numero = 0;
        double soma = 0;


        // Primeira parte do console
        System.out.println("Hoje iremos somar 5 dos números que você me disser");


        while (contador < 5) {
            System.out.println("Por favor, digite um número");
            numero = leitor.nextDouble();
            soma = soma + numero;
            contador++;
        }
        System.out.println("O valor da soma é: " + soma);
    }
}
