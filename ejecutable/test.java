package ejecutable;

import controlador.Controlador;
import modelo.Telefonia;
import vista.VentanaPrincipal;

public class test 
{
    public static void main (String[] args)
    {
       VentanaPrincipal miVentana= new VentanaPrincipal();
       Telefonia miModelo = new Telefonia(0,"", 0,0);  
       Controlador miControlador = new Controlador(miVentana,miModelo);

    }   
} {
    
}
