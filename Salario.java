public class Salario
{
    // Indicar com base no salário a classe social
    private static String statusSalario(float valor)
    {
        if (valor>=3000)
        {
            return "Rico";
        }
        else
        {
            return "Pobre";
        }
    }
    public static void main(String[] args)
    {
        String status = statusSalario(3000);
        System.out.println(status);
    }
}
