import java.util.Scanner;

public class MenuEmbalagens
{
    private static final int CAIXA_DE_PAPELAO = 1;
    private static final int SACOLA_PLASTICA = 2;
    private static final int EMBALAGEM_DE_VIDRO = 3;
    private static final int SAIR = 4;
    
    private static int escolhaDoUsuario = 0;
    private static String getDescricao(int indice)
    {
        switch (indice)
        {
            case 0:
                return "...";
            case CAIXA_DE_PAPELAO:
                return "Caixa de papelão, ideal para transporte e armazenamento.";
            case SACOLA_PLASTICA:
                return "Sacola plástica, leve e prática, mas pouco sustentável.";
            case EMBALAGEM_DE_VIDRO:
                return "Embalagem de vidro, resistente e reutilizável.";
            default:
                break;
        }
        return "?";
    }
    private static void atualizaMenu()
    {
        System.out.println("____________ Menu de Embalagens ____________");
        System.out.println("Escolha uma opção");
        System.out.println("1. Caixa de papelão");
        System.out.println("2. Sacola plástica");
        System.out.println("3. Embalagem de vidro");
        System.out.println("4. Sair");
        System.out.println("Embalagem escolhida: "+getDescricao(escolhaDoUsuario));
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