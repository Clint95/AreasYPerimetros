package areas.y.perimetros;
/**
 *la clase circulo contiene los metodos necesarios para calcular el perimetro
   y el area de un circulo
 * @author Juan Ricardo Rodriguez Campos
 * @verion 1.0.0
 * @since Areas y Perimetros 1.0.0
 */
import java.lang.Math ;
public class Circulo {
    /**
    *atributos que alojan radio, perimetro y area
    */
    private float radio;
    private float perimetro;
    private float area;
    
    /**
    *Constructor de la clase que inicializa la variable radio. 
    * @param radio    
    */
    public Circulo(float radio) {
        this.radio = radio;
    }
    
    /**
    * modifica la variable radio
    * @param radio
    */
    public void setRadio(float radio) {
        this.radio = radio;
    }
    /**
    * retorna la variable radio
    * @return 
    */
    public float getRadio() {
        return radio;
    }
    
    /**
    *retorna el area del circulo 
    * @return 
    */
    private double ObtenerArea(){
         area =(float)(Math.PI*(radio*radio));
         return area;
    }
    /**
    * retorna el perimetro del circulo 
    *@return 
    */
    private double ObtenerPerimetro(){
        perimetro=(float)(Math.PI*(2*radio));
        return perimetro;
    }
    /**
    * Muestra los resultados de la clase
    */
    public void darResultados() {
            System.out.println("Area del circulo : " + ObtenerArea());
            System.out.println("Perimetro del circulo: " + ObtenerPerimetro());           
    }
}
