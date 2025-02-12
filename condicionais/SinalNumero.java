import java.util.Scanner;

public class SinalNumero
{
    private static void verificaNumero(int num)
    {
        if(num>0)
        {
            System.out.println("Positivo");
        }
        else if(num<0)
        {
            System.out.println("Negativo");
        }
        else
        {
            System.out.println("Nulo (Zero)");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Digite um número: ");
        num = sc.nextInt();
        verificaNumero(num);
        sc.close();
    }    
}