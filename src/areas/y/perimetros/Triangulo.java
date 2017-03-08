package areas.y.perimetros;
/**
 * esta clase contiene los metodos para calcular el area y el perimetro de un triangulo
 * @author Juan Ricardo Rodriguez Campos
 * @verion 1.0.0
 * @since Areas y Perimetros 1.0.0
 */
public class Triangulo {
    
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
     * Guarda el perimetro del triangulo
     */
    private double perimetro;

    /**
     * Constuctor de la clse que inicializa las variables
     * @param punto1
     * @param punto2
     * @param punto3 
     */
    public Triangulo(Punto punto1, Punto punto2, Punto punto3) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
    }
    
    /**
     * Metodo que da los resultados del triangulo
     */
    public void darResultados() {
        if(isTriangulo()) {
            System.out.println("Lado1: " + darLado1());
            System.out.println("Lado2: " + darLado2());
            System.out.println("Lado3: " + darLado3());
            System.out.println("Perimetro: " + darPermietro());
            System.out.println("Area: " + darArea());
            System.out.println("Tipo de Triangulo: "+ TipoTriangulo());
        } else {
            System.out.println("No es un triangulo");
        }    
    }
    
    /**
     * Retorna verdadero si es un triangulo Falso contrario
     * @return 
     */
    private boolean isTriangulo() {
        if((Math.abs(darLado1()-darLado3())<darLado2())&&(darLado2()<(darLado1()+darLado3()))){
            System.out.println("Si Forma un triangulo");
            }else{
            System.out.println("No Forma un triangulo");
        }
        return true;
    }
    
    /**
     * Retorma longitud de lado AB
     * @return 
     */
    private double darLado1(){
        double auxiliarX = Math.pow(punto2.getX() - punto1.getX(), 2);
        double auxiliarY = Math.pow(punto2.getY() - punto1.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    
    /**
     * Retorma longitud de lado BC
     * @return 
     */
    private double darLado2(){
        double auxiliarX = Math.pow(punto3.getX() - punto2.getX(), 2);
        double auxiliarY = Math.pow(punto3.getY() - punto2.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    
    /**
     * Retorma longitud de lado CA
     * @return 
     */
    private double darLado3(){
        double auxiliarX = Math.pow(punto1.getX() - punto3.getX(), 2);
        double auxiliarY = Math.pow(punto1.getY() - punto3.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    
    /**
     * 
     * Metodo que retorna el perimetro del triangulo
     * @return Perimetro
     */
    private double darPermietro() {        
        this.perimetro =  darLado1() + darLado2() + darLado3();
        return this.perimetro;
    }
    
    /**
     * Metodo que retorna el area de un trianguo
     * @return  Area
     */
    private double darArea() {
        double semiperimetro = this.perimetro / 2;
        double lado1 = semiperimetro - darLado1();
        double lado2 = semiperimetro - darLado2();
        double lado3 = semiperimetro - darLado3();
        
        double area =  Math.sqrt((semiperimetro * lado1 * lado2 * lado3));
        return area;
    }
    
    /**
     * Metodo que retorna el tipo de triangulo
     * @return Tipo de triangulo
     */
    public String TipoTriangulo() {
            String salida=" ";
            double lado1=  darLado1();
            double lado2 = darLado2();
            double lado3 = darLado3();
                if(lado1==lado2&&lado1==lado3){
                System.out.println("equilatero"); 
                salida="equilatero";
                }
                else {
                if((lado1==lado2&&lado1!=lado3)||(lado2==lado3&&lado2!=lado1)||(lado3==lado1&&lado3!=lado2)){
                System.out.println("isosceles");
                salida="isosceles";
                }
                else{ 
                if(lado1!=lado2&&lado1!=lado3&&lado2!=lado3){
                salida="escaleno";
                System.out.println("escaleno");
                }
                }
                }
                return salida;
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
   
}