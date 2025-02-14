import java.util.Scanner;

public class MediaAritmeticaV2
{
    private static int calculaMedia(int[] numeros)
    {
        int x = 0;
        for(int i=0; i<numeros.length; i++)
        {
            x+=numeros[i];
        }
        x = x/numeros.length;
        return x;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 5 números para visualizar a média aritmética");
        int[] numeros = new int[5];
        for(int i=0; i<5; i++)
        {
            System.out.println("Informe o "+(i+1)+"º número");
            numeros[i]=sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Resultado: "+calculaMedia(numeros));
        sc.close();
    }
}