package AulaEx01;
import javax.swing.JOptionPane;
/**
 *
 * @author ice
 */
public class AulaEx01 
{
    public static void main(String[] args) 
    {
        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto();
        Ponto[] pontos = {p1,p2};
        
        for(int i =0;i<2;i++)
        {
            pontos[i].setX(Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o valor de x"+(i+1))));
            pontos[i].setY(Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o valor de y"+(i+1))));
        }
        
        JOptionPane.showMessageDialog(null,"P1: ("+p1.getX()+","+p1.getY()+")\n P2: ("+p2.getX()+","+p2.getY()+")");
        
        JOptionPane.showMessageDialog(null, "Distância:"+
                Math.sqrt((Math.pow(p2.getX()-p1.getX(),2))+(Math.pow(p2.getY()-p1.getY(),2))));
    }
}
