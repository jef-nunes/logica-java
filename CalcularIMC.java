package Atividades;

import java.util.Scanner;

public class CalcularIMC
{
    public static double calcularIMC(double peso, double altura)
    {
        double altura2 = altura/100;
        return peso/(altura2*altura2);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        System.out.println("Calcular IMC");
        System.out.println("Digite o peso (kg): ");
        a = sc.nextDouble();
        System.out.println("Digite a altura (cm): ");
        b = sc.nextDouble();
        System.out.println(calcularIMC(a, b));
        sc.close();
    }    
}
