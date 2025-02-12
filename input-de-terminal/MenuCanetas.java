import java.util.Scanner;

public class MenuCanetas
{
    private static final int CNT_ESFEROGRAFICA = 1;
    private static final int CNT_GEL = 2;
    private static final int CNT_TINTEIRO = 3;
    private static final int SAIR = 4;
    
    private static int escolhaDoUsuario = 0;

    private static String getNome(int indice)
    {
        switch (indice) {
            case 0:
                return "?";
            case CNT_ESFEROGRAFICA:
                return "Caneta esferográfica";
            case CNT_GEL:
                return "Caneta gel";
            case CNT_TINTEIRO:
                return "Caneta tinteiro";
            default:
                break;
        }
        return "?";
    }

    private static String getDescricao(int indice)
    {
        switch (indice)
        {
            case 0:
                return "...";
            case CNT_ESFEROGRAFICA:
                return "econômica e de longa duração.";
            case CNT_GEL:
                return "tinta mais pigmentada e escrita suave.";
            case CNT_TINTEIRO:
                return "clássica e elegante, usada para caligrafia.";
            default:
                break;
        }
        return "?";
    }
    private static void atualizaMenu()
    {
        System.out.println("____________ Menu de Canetas ____________");
        System.out.println("Escolha uma opção");
        System.out.println("1. Caneta esferográfica");
        System.out.println("2. Caneta gel");
        System.out.println("3. Caneta tinteiro");
        System.out.println("4. Sair");
        System.out.println("Caneta escolhida: "+getNome(escolhaDoUsuario)+", "+getDescricao(escolhaDoUsuario));
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(escolhaDoUsuario!=SAIR)
        {
            atualizaMenu();
            escolhaDoUsuario = sc.nextInt();
        }
        sc.close();
    }
}