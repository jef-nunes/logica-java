package Atividades;

import java.util.Scanner;

public class OperacoesBasicas
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Gerar operações básicas para dois números");
        System.out.println("Digite o 1º número: ");
        a = sc.nextInt();
        System.out.println("Digite o 2º número: ");
        b = sc.nextInt();
        int soma = a+b;
        int sub = a-b;
        int div = a/b;
        int mult = a*b;
        System.out.println("Resultados: ");
        System.out.println("Soma: "+soma);
        System.out.println("Subtração: "+sub);
        System.out.println("Divisão: "+div);
        System.out.println("Multiplicação: "+mult);
        sc.close();
    }    
}
