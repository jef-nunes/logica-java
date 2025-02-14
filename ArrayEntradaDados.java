import java.util.Scanner;

public class ArrayEntradaDados
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe quantos nomes você quer inserir: ");
        int tamanho = sc.nextInt();
        sc.nextLine();
        
        String[] nomes = new String[tamanho];

        for(int i=0; i<tamanho; i++)
        {
            System.out.println("Informe o "+(i+1)+"º"+" nome: ");
            String nome = sc.nextLine();
            nomes[i] = nome;
        }

        for(int i=0; i<tamanho; i++)
        {
            System.out.println((i+1)+"º"+" nome: "+nomes[i]);
        }

        sc.close();
    }
}