package areas.y.perimetros;
import java.util.Scanner;
/**
 * esta clase contiene los metodos necesarios para calcular el area y perimetro de un cuadrado 
 * @author Juan Ricardo Rodriguez Campos
 * @verion 1.0.0
 * @since Areas y Perimetros 1.0.0
 */
public class Cuadrado {
        public float lado=0;
        public float area1=0;
        public float perimetro1=0; 
        Scanner entrada=new Scanner(System.in);
    /**
     * metodo que calcula el area del cuadrado y retorna el valor del area
     * @return   area1     
     */    
    public float area(){
        System.out.print("\nDigite la longitud de uno de los lados del cuadrado");
        this.lado=entrada.nextFloat();
               area1=lado*lado;
        return area1;
    }
    /**
    *metodo que calcula el perimetro del cuadrado 
    * @return  retorna el perimetro
    */
    public float perimetro(){
        perimetro1= lado*4;
        return perimetro1;
    }   
    /**
     * metodo que imprime los resultados obtenidos
     * @param area1    
     * @param perimetro1    
    */
    public void Resultado(float area1, float perimetro1){
         System.out.printf("El area del Rectangulo es %.2f cm2 \n", area1);
         System.out.printf("El perimetro del Rectangulo es %.2f \n", perimetro1);
    }  
}
