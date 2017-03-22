package areas.y.perimetros;
/**
 * esta clase contiene los metodos para calcular el area y el perimetro de un triangulo
 * @author Juan Ricardo Rodriguez Campos
 * @verion 1.0.0
 * @since Areas y Perimetros 1.0.0
 */
public class Triangulo extends Figura {

    
    public Triangulo(Punto punto1, Punto punto2, Punto punto3){
        super(punto1,punto2,punto3);
    }

   
    /**
     * Metodo que da los resultados del triangulo
     */
    @Override
    public void darResultados() {
        super.darLado1();
        super.darLado2();
        super.darLado3();
       
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
     * 
     * Metodo que retorna el perimetro del triangulo
     * @return Perimetro
     */
    private double darPermietro() { 
        super.darLado1();
        super.darLado2();
        super.darLado3();
        this.perimetro =  darLado1() + darLado2() + darLado3();
        return this.perimetro;
    }
    
    /**
     * Metodo que retorna el area de un trianguo
     * @return  Area
     */
    @Override
    public double darArea() {
        super.darLado1();
        super.darLado2();
        super.darLado3();
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
        super.darLado1();
        super.darLado2();
        super.darLado3();
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
    
}