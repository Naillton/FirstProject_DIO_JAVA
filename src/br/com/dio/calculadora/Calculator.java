package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;
        System.out.println("Digite o primeiro valor");
        a = scan.nextInt();
        System.out.println("Digite o Segundo valor");
        b = scan.nextInt();
        int sum = somar(a, b);
        int sub = subtrair(a, b);
        int mult = multiplicar(a, b);
        int div = dividir(a, b);
        System.out.println("A soma e igual a "+ sum);
        System.out.println("A subtracao e igual a "+ sub);
        System.out.println("A multiplicacao e igual a "+ mult );
        System.out.println("A divisao e igual a "+ div);
    }

    public static int somar(int a, int b){
       return a + b;
    }
    public static int subtrair(int a, int b){
        return a - b;
    }
    public static int multiplicar(int a, int b){
        return a * b;
    }
    public static int dividir(int a, int b){
        return a / b;
    }
}
