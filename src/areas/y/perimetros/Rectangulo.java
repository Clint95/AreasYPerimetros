package areas.y.perimetros;
/**
 *la clase Rectangulo contiene los metodos necesarios para calcular el perimetro
   y el area de un circulo
 * @author Juan Ricardo Rodriguez Campos
 * @verion 2.0.0
 * @since Areas y Perimetros 2.0.0
 */
public class Rectangulo extends Figura {

    double perimetro;
    public Rectangulo(Punto punto1, Punto punto2, Punto punto3){
        super(punto1,punto2,punto3);
    }
    

   /**
    * Metodo que imprime los resultados del Rectangulo
    */
    
    @Override
    public void darResultados() {
       
        super.darLado1();
        super.darLado2();
        super.darLado3();

        if(isRectangulo()) {
            
            System.out.println("Lado1: " + darLado1());
            
            System.out.println("Lado2: " + darLado2());
           
            System.out.println("Perimetro: " + darPermietro());
            System.out.println("Area: " + darArea());
            System.out.println(""+TipoFigura());
            } else {
            System.out.println("No es un triangulo");
        }    
    }
    
    /**
     * Retorna verdadero si es un Rectangulo - Falso contrario
     * @return 
     */
    public boolean isRectangulo() {
        if(darLado1() != darLado2()){
        }
        if(darLado1() == darLado2()){
            
        }
        return true;
    }
    /**
    * retorna si la figura es un rectangulo o un cuadrado 
    * @return 
    */
    public String TipoFigura() {
        super.darLado1();
        super.darLado2();
        super.darLado3();
            String salida=" ";
            double lado1=  darLado1();
            double lado2 = darLado2();
            double lado3 = darLado3();
            if(lado1==lado2){
            salida="es un Cuadrado";
            }
            else
            {
            if(lado1!=lado2){
           
            salida="es un Rectangulo";
            }
            }
        return salida;
        }
    /**
     * Retorna longitud de lado 1
     * @return 
     */
    /**
     * 
     * Metodo que retorna el perimetro del Rectangulo o Cuadrado
     * @return Perimetro
     */
    
   
    public double darPermietro() {  
        super.darLado1();
        super.darLado2();
        this.perimetro =(darLado1()*2) + (2*darLado2());
        return this.perimetro;
    }
    
    /**
     * Metodo que retorna el area de un Rectangulo o Cuadrado
     * @return  Area
     */
    
    @Override
    public double darArea() {
        super.darLado1();
        super.darLado2();

        double lado1 = darLado1();
        double lado2 = darLado2();
        double area = (lado1*lado2);
        return area;
    }

}
//fin de la clase Rectangulo