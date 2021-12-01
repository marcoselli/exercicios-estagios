package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //---------IMPLEMENTAÇÃO EXERCÍCIO 2

        Scanner scanner = new Scanner(System.in);

        int a = 0, b = 1, aux=0, n;


        System.out.println("DIGITE UM NÚMERO: ");
        n = scanner.nextInt();

        while(n > aux){
            aux = a + b;
            a = b;
            b = aux;
        }

        if(n == aux)
            System.out.println("O número " + n + " pertence a sequencia fibonacci.");
        else
            System.out.println("O número " + n + " NÃO pertence a sequencia fibonacci.");

        //----------IMPLEMENTAÇÃO EXERCÍCIO 5

        String exemplo = "Target Sistemas";
        StringBuilder inverse = new StringBuilder();

        for(int i = exemplo.length() -1; 0 <= i; i --){
            inverse.append(exemplo.charAt(i));
        }

        System.out.println("\nINVERTENDO STRINGS");

        System.out.println("\nPalavra original: " + exemplo);
        System.out.println("Palavra invertida: " + inverse);
    }
}
