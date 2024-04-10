package AulaEx01;
import java.util.Scanner;
/**
 *
 * @author ice
 */
public class ex02
{
    public static String txt()
    {
        return
        """
        (1) somar
        (2) subtrair
        (3) dividir
        (4) multiplicar
        (5) sair
        """;
    }
    public static float calculadora(int op,Scanner teclado,float val)
    {
        float v1;
        
        while(op!=5)
        {
        
        switch(op)
        {
            case 1->{
                System.out.println("Insira o valor");
                v1=teclado.nextFloat();
                val +=v1;
                System.out.println(val +" + "+v1+"="+val);
                break;
            }
            case 2->{
                System.out.println("Insira o valor");
                v1=teclado.nextFloat();
                val -=v1;
                System.out.println(val +" - "+v1+"="+val);
                break;
            }
            case 3->{
                System.out.println("Insira o valor");
                v1=teclado.nextFloat();
                val /=v1;
                System.out.println(val +" / "+v1+"="+val);
                break;
            }
            case 4->{
                System.out.println("Insira o valor");
                v1=teclado.nextFloat();
                val *=v1;
                System.out.println(val +" * "+v1+"="+val);
                break;
            }
            default->{
                System.out.println("Selecione uma das operações");
            }
        }
        System.out.println(txt());
        System.out.println("Selecione a operação");
        op = teclado.nextInt();
        }
        return val;
    }
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        float v1,v2,val=0;
        int op;
        System.out.println(txt());
        System.out.println("Selecione a operação");
        op = teclado.nextInt();
        switch(op)
        {
            case 1->{
                System.out.println("Insira os valores");
                v1=teclado.nextFloat();
                v2=teclado.nextFloat();
                val = v1+v2;
                System.out.println(v1 +" + "+v2+"="+val);
                break;
            }
            case 2->{
                System.out.println("Insira os valores");
                v1=teclado.nextFloat();
                v2=teclado.nextFloat();
                val = v1-v2;
                System.out.println(v1 +" - "+v2+"="+val);
                break;
            }
            case 3->{
                System.out.println("Insira os valores");
                v1=teclado.nextFloat();
                v2=teclado.nextFloat();
                val = v1/v2;
                System.out.println(v1 +" / "+v2+"="+val);
                break;
            }
            case 4->{
                System.out.println("Insira os valores");
                v1=teclado.nextFloat();
                v2=teclado.nextFloat();
                val = v1*v2;
                System.out.println(v1 +" * "+v2+"="+val);
                break;
            }
        }
        calculadora(op,teclado,0);
    }
}
