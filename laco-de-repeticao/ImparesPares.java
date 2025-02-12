package atividades;

public class ImparesPares
{
    public static void main(String[] args)
    {
        String resultado1 = "Impares de 1 a 51: ";
        String resultado2 = "Pares de 52 a 100: ";
        for(int i = 0; i<101; i++)
        {
        	if(i<=51 && i%2!=0)
        	{
        		resultado1+=i;
        		resultado1+=",";
        	}
        	else if(i>51 && i%2==0)
        	{
        		resultado2+=i;
        		resultado2+=",";
        	}
        }
        System.out.println(resultado1);
        System.out.println(resultado2);
    }
}
