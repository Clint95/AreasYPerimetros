
package areas.y.perimetros;

/**
 * clase madre que contiene los atributos y meodos geneales del proyecto
 * @author Juan Ricardo Rodriguez Campos
 * @verion 2.0.0
 * @since Areas y Perimetros 2.0.0
 */
public class Figura {
   
    
    /**atributos area y perimetro
    *
    */
    public double area;
    public double  perimetro;

      /**
     * Constuctor de la clse que inicializa las variables
     * @param punto1
     * @param punto2
     * @param punto3 
     */
    public Figura(Punto punto1, Punto punto2, Punto punto3) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
        
    }
    
    public Figura(){
        
    }
    /** gets y sets de los atributos de la clase
    *
    */
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public Figura(double area, double perimetro) {
        this.area = area;
        this.perimetro = perimetro;
    }
    /**
     * Atributo que contiene la cordenada x1 y1
     */
    public Punto punto1;
    
    /**
     * Atributo que contiene la cordenada x2 y2
     */    
    public Punto punto2;
    
        /**
     * Atributo que contiene la cordenada x3 y3
     */        
    public Punto punto3;
  
    
      
    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }

    public Punto getPunto3() {
        return punto3;
    }

    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }
    /** retorna el lado 1
    *
    * @return 
    */
    public double darLado1(){
        
        double auxiliarX = Math.pow(punto2.getX() - punto1.getX(), 2);
        double auxiliarY = Math.pow(punto2.getY() - punto1.getY(), 2);
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
    
        return lado;
    }
    
    /**
     * Retorna longitud de lado 2
     * @return 
     */
    public double darLado2(){
        double auxiliarX = Math.pow(punto3.getX() - punto2.getX(), 2);
        double auxiliarY = Math.pow(punto3.getY() - punto2.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    
    /**
     * Retorna longitud del lado 3
     * @return 
     */
    public double darLado3(){
        double auxiliarX = Math.pow(punto1.getX() - punto3.getX(), 2);
        double auxiliarY = Math.pow(punto1.getY() - punto3.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    } 
    /** metodo que retorna el area
    * @return 
    */
    public double darArea(){
        
        return area;
    }
    /**
    *metodo que retorna el perimetro
    * @return 
    */
    public double darPerimetro(){
        
        return perimetro;
    }
    /**
    * metodo que muestra los datos
    */
    public void darResultados(){
        
    }
    
}
