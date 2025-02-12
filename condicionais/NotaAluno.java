public class NotaAluno
{
    // Indicar se o aluno foi aprovado ou reprovado
    // Com base em 2 notas
    private static String status2Notas(float nota1, float nota2)
    {
        media = (nota1+nota2)/2;
        if (media>=7)
        {
            return "Aprovado";
        }
        else
        {
            return "Reprovado";
        }
    }
    // Com base em 1 nota
    private static String status1Nota(float nota)
    {
        if (nota>=7)
        {
            return "Aprovado";
        }
        else
        {
            return "Reprovado";
        }
    }
    public static void main(String[] args)
    {
        String status = status1Nota(7);
        String status2 = status2Notas(5, 5);
        System.out.println(status);
        System.out.println(status2);
    }
}
