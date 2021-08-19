
import javax.swing.JOptionPane;
public class Ordenamiento
{
    public static void main(String[] args)
    {
        int vec[];
        String msg = "Digite numero de elementos";
        int nelem = Integer.parseInt(JOptionPane.showInputDialog(msg));
        vec = new int[nelem];
        int temp=0,i,j=0;
        System.out.println("Vector original:");
        int pasadas=0;
       
        for(i=0;i<nelem;i++)
        {
            vec[i]=(int)(1+Math.random()*100);
            System.out.print("vec["+i+"]:"+vec[i]+" -> ");
            if(i%5==0 && i>0)System.out.println("");
        }
        for(i=0;i<(nelem-1);i++)
        {
            for(j=i+1;j<nelem;j++)
            if(vec[i]<vec[j])
            {
                temp=vec[i];
                vec[i]=vec[j];
                vec[j]=temp;
                pasadas++;
            }
        }
        System.out.println("\n\nVector ordenado en :"+pasadas+" pasadas");
        for(i=0;i<nelem;i++)
        {
            System.out.print("vec["+i+"]:"+vec[i]+" -> ");
            if(i%5==0 && i>0)System.out.println("");
        }
    }
}
