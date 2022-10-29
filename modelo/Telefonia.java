package modelo;
public class Telefonia 
{
    //---------------------
    //Atributos
    //---------------------
    public long numeroCelular;
    public String operador;
    public int NumeroMin;
    public int valorMin;
    private final int COS_MINUTO = 300;

    //---------------------
    //Métodos
    //---------------------

    //Constructor comun u ordinario
    public Telefonia(long nCel, String Oper, int cMin, int vMin)
    {
        this.numeroCelular = nCel;
        this.operador = Oper;
        this.NumeroMin = cMin;
        this.valorMin= vMin;
    }

    public Telefonia(Telefonia pt)
    {
        this.NumeroMin = pt.getNumeroMin();
        this.numeroCelular = pt.getNumeroCelular();
        this.valorMin = (int) pt.getvalorMin();
        this.operador = pt.getOperador();
    }

    //Metodos de acceso

    public long getNumeroCelular() 
    {
        return numeroCelular;
    }

    public void setNumeroCelular(long numeroCelular) 
    {
        this.numeroCelular = numeroCelular;
    }

    public String getOperador() 
    {
        return operador;
    }

    public void setOperador(String operador) 
    {
        this.operador = operador;
    }

    public int getNumeroMin() 
    {
        return NumeroMin;
    }

    public void setNumeroMin(int NumeroMin) 
    {
        this.NumeroMin = NumeroMin;
    }

    public double getvalorMin() 
    {
        return valorMin;
    }

    public void setvalorMin(int valorMin) 
    {
        this.valorMin = valorMin;
    }

    public String toString()
    {
        return "El Costo de plan es de: :"+ "\nTu numero de celular es: " + numeroCelular +"\nLa cantidad de minutos es: " + NumeroMin + "\nEl costo de minutos es: "+valorMin+"\nEl costo de tu plan es: "+ calcularCostoPlan(); 
    }

    public double calcularCostoPlan()
    {
        double costoTotal = COS_MINUTO * NumeroMin;
        if(operador.equals("Movilujo"))
        {
            costoTotal = costoTotal * 0.5;
        }
        return costoTotal;
    }

    public void getNumeroCelular(long parseLong) {
    }    
}

