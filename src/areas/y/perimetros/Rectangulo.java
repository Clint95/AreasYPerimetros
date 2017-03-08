package areas.y.perimetros;
/**
 *la clase Rectangulo contiene los metodos necesarios para calcular el perimetro
   y el area de un circulo
 * @author Juan Ricardo Rodriguez Campos
 * @verion 1.0.0
 * @since Areas y Perimetros 1.0.0
 */
public class Rectangulo {
     
    /**
     * Atributo que contiene la cordenada x1 y1
     */
    private Punto punto1;
    
    /**
     * Atributo que contiene la cordenada x2 y2
     */    
    private Punto punto2;
    /**
     * Atributo que contiene la cordenada x3 y3
     */        
    private Punto punto3;
    /**
     * Atributo que contiene la coordenada x4 y4
     */
    private Punto punto4;
    
    /**
     * Guarda el perimetro del Rectangulo
     */
    private double perimetro;

    /**
     * Constuctor de la clse que inicializa las variables
     * @param punto1
     * @param punto2
     * @param punto3 
     */
    public Rectangulo(Punto punto1, Punto punto2, Punto punto3, Punto punto4) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
        this.punto4 = punto4;
    }
    
    /**
     * Metodo que imprime los resultados del Rectangulo
     */
    public void darResultados() {
        if(isRectangulo()) {
            System.out.println("Lado1: " + darLado1());
            System.out.println("Lado2: " + darLado2());
            System.out.println("Lado3: " + darLado3());
            System.out.println("Lado4: " + darLado4());
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
    private boolean isRectangulo() {
        if(darLado1()==darLado2() && darLado1()==darLado4() && darLado2()==darLado3()){
        }
        if(darLado1()==darLado2() || darLado1()==darLado4() || darLado2()==darLado3()){
        }
        return true;
    }
    /**
    * retorna si la figura es un rectangulo o un cuadrado 
    * @return 
    */
        public String TipoFigura() {
            String salida=" ";
            double lado1=  darLado1();
            double lado2 = darLado2();
            double lado3 = darLado3();
            double lado4 = darLado4();
            if(lado1==lado2 && lado1==lado4 && lado2==lado3){
            salida="es un Cuadrado";
            }
            else
            {
            if(lado1==lado2 || lado1 == lado4 || lado2 == lado3){
           
            salida="es un Rectangulo";
            }
            }
        return salida;
        }
    /**
     * Retorna longitud de lado 1
     * @return 
     */
    private double darLado1(){
        double auxiliarX = Math.pow(punto2.getX() - punto1.getX(), 2);
        double auxiliarY = Math.pow(punto2.getY() - punto1.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    
    /**
     * Retorna longitud de lado 2
     * @return 
     */
    private double darLado2(){
        double auxiliarX = Math.pow(punto3.getX() - punto2.getX(), 2);
        double auxiliarY = Math.pow(punto3.getY() - punto2.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    
    /**
     * Retorna longitud del lado 3
     * @return 
     */
    private double darLado3(){
        double auxiliarX = Math.pow(punto1.getX() - punto4.getX(), 2);
        double auxiliarY = Math.pow(punto1.getY() - punto4.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    } 
    /**
    * Retorna longitud del lado 4
    * @return
    */
    private double darLado4(){
        double auxiliarX = Math.pow(punto3.getX() - punto4.getX(), 2);
        double auxiliarY = Math.pow(punto3.getY() - punto4.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    /**
     * 
     * Metodo que retorna el perimetro del Rectangulo o Cuadrado
     * @return Perimetro
     */
    private double darPermietro() {        
        this.perimetro =(2*(darLado1())+2*(darLado2())+2*(darLado3())+2*(darLado4()))/2;
        return this.perimetro;
    }
    
    /**
     * Metodo que retorna el area de un Rectangulo o Cuadrado
     * @return  Area
     */
    private double darArea() {
        double semiperimetro = this.perimetro / 2;
        double lado1 = darLado1();
        double lado2 = darLado2();
        double lado3 = darLado3();
        double lado4 = darLado4();
        
        double area = (lado1*lado2)+(lado3*lado4)/2;
        return area;
    }
    
    /**
     * Retorna la cordenada x1 y1
     * @return 
     */
    public Punto getPunto1() {
        return punto1;
    }

    /**
     * Modifica la cordenada x1 y1
     * @param punto1 
     */
    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    /**
     * Retorna la cordenada x2 y2
     * @return 
     */    
    public Punto getPunto2() {
        return punto2;
    }

    /**
     * Modifica la cordenada x2 y2
     * @param punto1 
     */    
    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }

    /**
     * Retorna la cordenada x3 y3
     * @return 
     */    
    public Punto getPunto3() {
        return punto3;
    }

    /**
     * Modifica la cordenada x3 y3
     * @param punto1 
     */    
    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }
    /**
     * Retorna la cordenada x4 y4
     * @return 
     */    
    public Punto getPunto4() {
        return punto4;
    }

    /**
     * Modifica la cordenada x4 y4
     * @param punto4
     */    
    public void setPunto4(Punto punto4) {
        this.punto4 = punto4;
    }
}
//fin de la clase Rectangulo