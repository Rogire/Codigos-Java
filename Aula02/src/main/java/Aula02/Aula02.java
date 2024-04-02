package Aula02;
import javax.swing.JOptionPane;
/**
 *
 * @author igor
 */
public class Aula02 
{
    public static void main(String[] args) 
    {
        String nome = JOptionPane.showInputDialog(null,"Insira seu nome:","Nome?",JOptionPane.QUESTION_MESSAGE);
        System.out.println("Olá " + nome + "!");
        calculadora();
    }
    public static void calculadora()
    {
        String valor1,valor2,op;
        float v1,v2,res=0;
        
        do
        {
        valor1=JOptionPane.showInputDialog("Insira o primeiro valor:");
        op=JOptionPane.showInputDialog("Insira a operação:");
        valor2=JOptionPane.showInputDialog("Insira o segundo valor:");
        
        v1 =Float.parseFloat(valor1);
        v2=Float.parseFloat(valor2);
        
        if(op.contains("+"))
            res = v1 + v2;
        else if(op.contains("-"))
            res = v1 - v2;
        else if(op.contains("*"))
            res = v1 * v2;
        else if(op.contains("/"))
            res = v1 / v2;
        
        System.out.println(res);
        }
        while(op.equals(0)!= false);      
    }
}
