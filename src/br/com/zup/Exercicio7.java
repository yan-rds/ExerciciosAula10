package br.com.zup;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        // Faça um programa para ler uma quantidade de números (N) digitada pelo usuário e mostrar a quantidade de números pares e a quantidade de números ímpares desses números.

        Scanner leitor = new Scanner(System.in);

        // Definindo Variáveis
        int quantidadeDeNumeros = 0;
        int contador = 0;
        double numeroInserido = 0;
        int contadorPar = 0;
        int contadorImpar = 0;
        double modulo = 0;

        // Primeira parte do console
        System.out.println("Este programa irá mostrar a quantidade de números pares que você digitou");
        System.out.println("Para começarmos, me informe quantos números você irá digitar");
        quantidadeDeNumeros = leitor.nextInt();

        // Criando estrutura de repetição
        while (contador < quantidadeDeNumeros) {
            System.out.println("Digite um número");
            numeroInserido = leitor.nextDouble();
            modulo = numeroInserido%2; // Lógica: Números impares ao serem divididos por 2 deixam resto
            if (modulo != 0) { // Se o módulo for diferente de 0, então o número é impar e é adicionado 1 ao contador impar.
                contadorImpar++;
            }
            else {
                contadorPar ++;
            }
            contador ++;
        }
        System.out.println("Você digitou " +contadorPar+ " número(s) par(es) e " + contadorImpar + " numero(s) ímpar(es)");
    }
}
