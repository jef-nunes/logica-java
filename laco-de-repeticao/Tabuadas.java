package atividades;

public class Tabuadas
{
    public static void main(String[] args) {
        String tabuadas = "";
        for(int i = 0; i<11; i++)
        {
            for(int j = 0; j<11; j++)
            {
                    tabuadas += i;
                    tabuadas += "X";
                    tabuadas += j;
                    tabuadas += "=";
                    tabuadas += (i*j);
                    tabuadas += ",";
            }
            tabuadas+="\n";
        }
        System.out.println(tabuadas);
    }
}
