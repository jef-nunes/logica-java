package Atividades;

import java.util.Scanner;

public class Concatenar2Palavras
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a;
        String b;
        System.out.println("Concatenar duas palavras");
        System.out.println("Digite a primeira palavra: ");
        a = sc.next();
        System.out.println("Digite a segunda palavra: ");
        b = sc.next();
        System.out.println(""+a+" "+b);
        sc.close();
    }
}
