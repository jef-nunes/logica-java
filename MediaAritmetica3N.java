package Atividades;

import java.util.Scanner;

public class MediaAritmetica3N
{
     public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println("Calcular média aritmética para 2 números");
        System.out.println("Digite o 1º número: ");
        a = sc.nextDouble();
        System.out.println("Digite o 2º número: ");
        b = sc.nextDouble();
        System.out.println("Digite o 3º número: ");
        c = sc.nextDouble();
        double resultado = (a+b+c)/3;
        System.out.println("Resultado: "+resultado);
        sc.close();
    }       
}
