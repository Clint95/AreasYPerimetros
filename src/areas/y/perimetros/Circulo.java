package areas.y.perimetros;
/**
 *la clase circulo contiene los metodos necesarios para calcular el perimetro
   y el area de un circulo
 * @author Juan Ricardo Rodriguez Campos
 * @verion 1.0.0
 * @since Areas y Perimetros 1.0.0
 */
import java.util.Scanner;
import java.lang.Math ;
public class Circulo {    
    public float radio=0;
    public float area1=0;
    public float perimetro1=0;
    Scanner entrada=new Scanner(System.in);
    /**
    * @return retorna el radio para poder procesarlo   
    */
    public float RadioIngresado(){
        System.out.printf("Ingrese el radio del circulo \n");
        this.radio=entrada.nextFloat();
        return radio;       
    }
    /**
     * Método para calcular el área del círculo  pasándo como parámetro el radio (r)
     * @param r    
     * @return area1 retorna el area del circulo 
    */
    public float calculaArea(float r){
        this.area1 =(float)Math.PI*(float)Math.pow(r, 2);
        return area1;       
    }        
    /**
     * metodo que calcula el perimetro pasando como parametro el radio (r)
     * @param r    
     * @return     
    */
    public float calcularPerimetro(float r){
        this.perimetro1 = 2*(float)Math.PI*r; 
        return perimetro1;       
    }
    /**
     * Metodo que imprime los resultados en pantalla
     * @param area    
     * @param perimetro    
    */
    public void Resultado(float area, float perimetro){
        System.out.printf("El area del circulo es %.2f cm2 \n", area1);
        System.out.printf("El perimetro del circulo es %.2f  \n", perimetro1);
    }
}//fin clase Circulo
