import javax.swing.JOptionPane;

public class Punto
{
    /**
     *
     */
    private static final int INFO = 1;
    private int x;
    private int y;

    public Punto()
    {
        this(0,0);
    }
    public Punto(int x, int y)
    {
        setX(x);
        setY(y);
    }

    public void setX(int x)
    {
        this.x = x;
    }
    public void setY(int y)
    {
        this.y = y;
    }

    public int getX()
    {
        return this.x;
    }
    public int getY()
    {
        return y;
    }
    public void imprimir_cuadrante(int x, int y) {
        if (getX() > 0 && getY() > 0) {
            System.out.println("El punto esta en el primer cuadrante");
        } else if (getX() < 0 && getY() > 0) {
            System.out.println("El punto esta en el segundo cuadrante");
        } else if (getX() < 0 && getY() < 0) {
            System.out.println("El punto esta en el tercer cuadrante");
        } else {
            System.out.println("El punto esta en el cuarto cuadrante");
        }
        System.out.println("x:"+getX()+", y:"+getY());
    }

    public double calcular_Distancia(int x, int y)
    {
        float a = (float) Math.pow((x-getX()),2);
        float b = (float) Math.pow((y-getY()),2);
        return Math.sqrt(a+b);
    }
    public String PuntoMedio(int x, int y)
    {
        float xm = (getX()+x)/2;
        float ym = (getY()+y)/2;
        return "Punto medio es: ("+xm+", "+ym+")";
    }

    public Punto init()
    {
        int x = (int)(1 + Math.random()*30);
        int y = (int)(1 + Math.random()*30);
        return new Punto(x,y);
    }

    public static void main(String args[])
    {
        Punto punto;
        punto = new Punto();
        punto = punto.init();

        punto.imprimir_cuadrante(punto.getX(), punto.getY());
        String str_x = JOptionPane.showInputDialog(null, "Ingrese un valor para x:");
        String str_y = JOptionPane.showInputDialog(null, "Ingrese un valor para y:");
        
        int temp_x = Integer.parseInt(str_x);
        int temp_y = Integer.parseInt(str_y);

        String salida = "Distancia es de :"+punto.calcular_Distancia(temp_x, temp_y)+
        "\n"+punto.PuntoMedio(temp_x, temp_y);
        JOptionPane.showMessageDialog(null, salida, "PUNTO", INFO);
        
    }
}