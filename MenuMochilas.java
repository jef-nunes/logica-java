import java.util.Scanner;

public class MenuMochilas
{
    private static final int MOCHILA_ESCOLAR = 1;
    private static final int MOCHILA_VIAGEM = 2;
    private static final int MOCHILA_ESPORTIVA = 3;
    private static final int SAIR = 4;
    
    private static int escolhaDoUsuario = 0;

    private static String getDescricao(int indice)
    {
        switch (indice)
        {
            case 0:
                return "...";
            case MOCHILA_ESCOLAR:
                return "Mochila escolar, compacta e ideal para estudantes.";
            case MOCHILA_VIAGEM:
                return "Mochila de viagem, espaçosa e ideal para longas jornadas.";
            case MOCHILA_ESPORTIVA:
                return "Mochila esportiva, leve, resistente e ergonômica";
            default:
                break;
        }
        return "?";
    }
    private static void atualizaMenu()
    {
        System.out.println("____________ Menu de Mochilas ____________");
        System.out.println("Escolha uma opção");
        System.out.println("1. Mochila escolar");
        System.out.println("2. Mochila de viagem");
        System.out.println("3. Mochila esportiva");
        System.out.println("4. Sair");
        System.out.println("Mochila escolhida: "+getDescricao(escolhaDoUsuario));
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
