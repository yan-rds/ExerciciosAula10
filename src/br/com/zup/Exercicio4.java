package br.com.zup;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        // Escreva, usando while, um programa para calcular a média de N números. O valor de N é dado pelo usuário.

        Scanner leitor = new Scanner(System.in);

        // Definindo variáveis
        int contador = 0;
        int quantidadeDeNumeros = 0;
        double numeroInserido = 0;
        double soma = 0;
        double media = 0;

        // Criando primeira parte do console
        System.out.println("Esse programa calculará a média dos números que você digitar");
        System.out.println("Para começarmos, por favor digite a quantidade de números que você quer a média");
        quantidadeDeNumeros = leitor.nextInt();

        while (contador < quantidadeDeNumeros) {
            System.out.println("Escreva um número");
            numeroInserido = leitor.nextDouble();
            soma = soma + numeroInserido;
            media = soma / quantidadeDeNumeros;
            contador ++;
        }
        System.out.println("A média destes números é: " +media);

    }
}
