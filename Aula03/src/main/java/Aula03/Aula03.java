package Aula03;
import javax.swing.JOptionPane;
/**
 *
 * @author igor
 */
public class Aula03 
{
    public static double D(Ponto P1, Ponto P2)
    {
        return Math.sqrt((Math.pow(P2.getX() - P1.getX(),2)) + (Math.pow(P2.getY() - P1.getY(),2)));
    }
    
    public static void main(String[] args) 
    {
        Ponto A,B,C;
        float x,y;
        double L1,L2,L3;
        A = new Ponto();
        B = new Ponto();
        C = new Ponto();
        Ponto vet[]={A,B,C};
        
        for(int i=0; i<3;i++)
        {
            x = Float.parseFloat((JOptionPane.showInputDialog(null,"Insira o valor do x do ponto "+(i+1))));
            vet[i].setX(x);
            y = Float.parseFloat((JOptionPane.showInputDialog(null,"Insira o valor do y do ponto "+(i+1))));
            vet[i].setY(y);
        }
        L1= D(A,B);
        L2= D(A,C);
        L3= D(B,C);
        
        System.out.println(L1+" "+L2+" "+L3);

            if (L1==L2 && L2==L3)
                System.out.println("Equilátero");
            else if((L1==L2 && L2 !=L3) || L1==L3 && L2!=L3)
                System.out.println("Isósceles");
            else if(L1!=L2 && L2!=L3 && L1!=L3)
            System.out.println("Escaleno");
    }
}
