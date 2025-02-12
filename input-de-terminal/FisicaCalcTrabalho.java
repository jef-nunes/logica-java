package Atividades;

import java.util.Scanner;

public class FisicaCalcTrabalho
{
    public static double calcularTrabalho(double forcaAplicada, double distancia)
    {
        return forcaAplicada*distancia;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        System.out.println("Calcular Trabalho - Física");
        System.out.println("Digite a força: ");
        a = sc.nextDouble();
        System.out.println("Digite a distância: ");
        b = sc.nextDouble();
        System.out.println(calcularTrabalho(a, b));
        sc.close();
    }    
}
