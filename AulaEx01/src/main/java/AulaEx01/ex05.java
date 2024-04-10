package AulaEx01;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class ex05 
{
    public static void main(String[] args) 
    {
        float investimento=0,juros,valorMes=0,valorJuros=0;
        boolean conf=true;
        String strConf;
        Scanner teclado = new Scanner(System.in);
        juros = Float.parseFloat(JOptionPane.showInputDialog(null,"Insira o valor de juros"));
        valorMes = Float.parseFloat(JOptionPane.showInputDialog(null,"Insira o valor para ser investido"
                + " todo mês"));
        while(conf)
        {
            for(int i=0;i<12;i++)
            {
                valorMes +=valorMes;
                valorJuros = valorMes*(juros/100);
                investimento+=valorJuros+valorMes;
                System.out.println(investimento+" "+(i+1));
            }
            System.out.println("Saldo do investimento após um ano: "+investimento);
            System.out.println("Deseja processar mais um ano? (S/N)");
            strConf = teclado.nextLine();
            
            if(strConf.equals("S"))
                conf = true;
            else if(strConf.equals("N"))
                conf=false;
            else
                System.out.println("Selecione uma opção válida (S/N)");
        }
    }
    
}
