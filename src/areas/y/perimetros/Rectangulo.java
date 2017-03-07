package areas.y.perimetros;
/**
 *la clase Rectangulo contiene los metodos necesarios para calcular el perimetro
   y el area de un circulo
 * @author Juan Ricardo Rodriguez Campos
 * @verion 1.0.0
 * @since Areas y Perimetros 1.0.0
 */
import java.lang.Math ;
import java.util.Scanner;
public class Rectangulo {
    public float base=0;
    public float altura=0;
    public float area1=0;
    public float perimetro1=0; 
    
    Scanner entrada=new Scanner(System.in);
    /**
     * metodo que captura y calcula el area de un rectangulo
     * @return retorna el area del rectangulo
    */        
    public float area(){
        System.out.printf("Digite la base del rectangulo");
        this.base=entrada.nextFloat();
        System.out.printf("Digite la altura del rectangulo");
        this.altura=entrada.nextFloat();
               area1=base*altura;
        return area1;  
    }
    /**
     * metodo que calcula el perimetro del rectrangulo
     * @return perimetro1  retorna el perimetro     
    */
    public float perimetro(){
        perimetro1= altura+altura+base+base;
        return perimetro1;
    }    
    
    /**
     * metodo que imprime los resultados
     * @param area1 area del rectangulo del metodo area   
     * @param perimetro1  perimetro del rectangulo del metodo perimetro  
    */
    public void Resultado(float area1, float perimetro1){
         System.out.printf("El area del Rectangulo es %.2f cm2 \n", area1);
         System.out.printf("El perimetro del Rectangulo es %.2f  \n", perimetro1);
    }  
}
//fin de la clase Rectangulo