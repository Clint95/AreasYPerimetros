package areas.y.perimetros;
/**
 * esta clase contiene los metodos para calcular el area y el perimetro de un triangulo
 * @author Juan Ricardo Rodriguez Campos
 * @verion 1.0.0
 * @since Areas y Perimetros 1.0.0
 */
import java.lang.Math ;
import java.util.Scanner;
public class Triangulo {
    
    public float base=0;
    public float altura=0;
    public float area1=0;
    public float perimetro1=0;
    public float p1=0,p2=0,p3=0,p4=0,p5=0,p6=0;
    public float a1,a2=0,c1=0,c2=0,b1=0,b2=0;
    
    Scanner entrada=new Scanner(System.in);
    /**
    *este metodo captura las coordenadas digitadas por el usuario para poder calcular
     el area y retornarla
    * @return area1
    */
    public float areaCoordenadas(){
        System.out.printf("\nDigite las coordenadas de las vertices");
        System.out.printf("\nDigite la coordenada A1 : ");
        this.a1=entrada.nextFloat();
        System.out.printf("\nDigite la coordenada A2 : ");
        this.a2=entrada.nextFloat();
        System.out.printf("\nDigite la coordenada B1 : ");
        this.b1=entrada.nextFloat();
        System.out.printf("\nDigite la coordenada B1 : ");
        this.b2=entrada.nextFloat();
        System.out.printf("\nDigite la coordenada C1 : ");
        this.c1=entrada.nextFloat();
        System.out.printf("\nDigite la coordenada C2 : ");
        this.c2=entrada.nextFloat();
        area1=((a1*(c2-b2)+c1*(b2-a2)+b1*(a2-c2))/2);
        return area1;
        }
    /**
    * este metodo calcula el perimetro del triangulo
    * @return    retorna el perimetro del triangulo
    */
    public float perimeCoordenadas(){
        
        this.p1 = (float) Math.pow((b1-a1),2);
        this.p2 = (float) Math.pow((b2-a2),2);
        this.p3 = (float) Math.pow((c1-b1),2);
        this.p4 = (float) Math.pow((c2-b2),2);
        this.p5 = (float) Math.pow((c1-a1),2);
        this.p6 = (float) Math.pow((c2-a2),2);
        this.perimetro1= (float)((Math.sqrt(p1+p2))+(Math.sqrt(p3+p4)+(Math.sqrt(p5+p6))));
        return perimetro1;
    }    
    /**
    *este metodo evalua si el triangulo que se ingreso es isosceles,equilatero o escaleno.
    */
    public void TipoTriangulo(){
        float lado1=(float)(Math.sqrt(p1+p2));
        float lado2=(float)(Math.sqrt(p3+p4));
        float lado3=(float)(Math.sqrt(p5+p6));
        if(lado1==lado2&&lado1==lado3){
            System.out.printf("\n es un triangulo equilatero");          
        }
            if((lado1==lado2&&lado1!=lado3)||(lado2==lado3&&lado2!=lado1)||(lado3==lado1&&lado3!=lado2)){
                System.out.printf("\nes un triangulo isosceles");                            
            }
                if(lado1!=lado2&&lado1!=lado3&&lado2!=lado3){
                    System.out.printf("\nes un triangulo escaleno");                   
                }
    }
    /**
     * este metodo imprime los resultados obtenidos en pantalla
     * @param area1   el area que se calculo en los metodos anteriores
     * @param perimetro1    el perimetro que se calculo en los metodos anteriores
    */
    public void Resultado(float area1, float perimetro1){
         System.out.printf("El area del triangulo es %.2f  \n", area1);
         System.out.printf("El perimetro del triangulo es %.2f  \n", perimetro1);
    }
}
