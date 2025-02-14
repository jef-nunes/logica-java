public class Senha
{
    private static void verificaSenha(String senha)
    {
        if(senha == "alfa")
        {
            System.out.println("A porta foi aberta");
        }
        else
        {
            System.out.println("A porta não foi aberta");
        }
    }
    public static void main(String[] args)
    {
        verificaSenha("abcdef");
        verificaSenha("alfa");
    }
}
