package areas.y.perimetros;
/**
 *la clase circulo contiene los metodos necesarios para calcular el perimetro
   y el area de un circulo
 * @author Juan Ricardo Rodriguez Campos
 * @verion 2.0.0
 * @since Areas y Perimetros 2.0.0
 */
 
import java.lang.Math ;
public class Circulo extends Figura{

    /**
    *Constructor de la clase que inicializa la variable radio. 
     * @param punto1
     * @param punto2
     * @param punto3    
     */
    public Circulo(Punto punto1, Punto punto2, Punto punto3){
        super(punto1,punto2,punto3);
    }
     
   /**
    *retorna el area del circulo 
    * @return 
    */
    @Override
    public double darArea(){
        super.darLado1();
         area =(float)(Math.PI*((darLado1())*(darLado1())));
         return area;
    }
    /**
    * retorna el perimetro del circulo 
    *@return 
    */
    @Override
    public double darPerimetro(){
        super.darLado1();
        perimetro=(float)(Math.PI*(2*darLado1()));
        return perimetro;
    }
    /**
    * Muestra los resultados de la clase
    */
    @Override
    public void darResultados() {
            System.out.println("Area del circulo : " + darArea());
            System.out.println("Perimetro del circulo: " + darPerimetro());           
    }
}
