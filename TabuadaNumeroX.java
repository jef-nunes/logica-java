package atividades;

import java.util.Scanner;

public class TabuadaNumeroX {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para verificar a sua tabuada: ");
        int num;
        num = sc.nextInt();
        for(int i=0; i<11; i++)
        {
        	System.out.println(num+"x"+i+"="+num*i);
        }
        sc.close();
    }    
}
