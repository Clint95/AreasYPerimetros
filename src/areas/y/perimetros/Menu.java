package areas.y.perimetros;
import java.util.Scanner;
/**
 * esta clase contiene el menu del programa y este es lo primero que ve el usuario
 * @author Juan Ricardo Rodriguez Campos
 * @verion 1.0.0
 * @since Areas y Perimetros 1.0.0
 */
public class Menu {
    Scanner entrada=new Scanner(System.in);
    //objeto Scanner para leer datos por teclado
    public void menu() {
        //variables donde se guardaran los resultados de los metodos
        float areaTrian=0,perimeTrian=0;
        float radioCirculo=0;
        float areaCir=0,perimetroCir=0;
        float areaRect=0,perimetroRect=0;
        float areaCua=0,perimetroCua=0;
        int Desea=0;
        int opcion=0;
        do{
        //Menu con las opciones a escojer
        System.out.printf("\nHola este programa calcula el area y el perimetro de las figuras geometricas \n");
        System.out.printf("\nElije una opcion para seguir ");
        System.out.printf("\n1 para Triangulo \n");
        System.out.printf("2 para Circulo \n");
        System.out.printf("3 para Rectangulo \n");
        System.out.printf("4 para Cuadrado \n");
        System.out.printf("-1 para Terminar \n");        
        
        opcion= entrada.nextInt();
        switch(opcion){
           case 1:
                System.out.printf("Calculadora de Triangulos\n");
                System.out.printf("\n Esta funcion necesita las tres coordenadas (x,y) del triangulo");
                Triangulo TrianguloI = new Triangulo();
                areaTrian = TrianguloI.areaCoordenadas();
                perimeTrian= TrianguloI.perimeCoordenadas();
                TrianguloI.Resultado(areaTrian, perimeTrian);
                TrianguloI.TipoTriangulo();
               break;
           case 2:
                System.out.printf("Calculadora de Circulos \n");
                Circulo CirculoI = new Circulo();
                radioCirculo = CirculoI.RadioIngresado();
                areaCir=CirculoI.calculaArea(radioCirculo);
                perimetroCir=CirculoI.calcularPerimetro(radioCirculo);
                CirculoI.Resultado(areaCir, perimetroCir);
                break;
           case 3:
               System.out.printf("Calculadora de Rectangulos \n");
               Rectangulo RectanguloI = new Rectangulo();
               areaRect= RectanguloI.area();
               perimetroRect= RectanguloI.perimetro();
               RectanguloI.Resultado(areaRect, perimetroRect);
               break;
           case 4:
               System.out.print("Calculadora de Cuadrados \n");
               Cuadrado CuadradoI = new Cuadrado();
               areaCua=CuadradoI.area();
               perimetroCua=CuadradoI.perimetro();
               CuadradoI.Resultado(areaCua, perimetroCua);
               break;
           case -1:
               System.out.printf("Eligio Terminar \n");
               break;
           default:
               System.out.printf("Opción no válida \n");

        }//fin switch
        //bucle while para preguntar si se desea utlizar otra funcion del programa
        System.out.print("\nDesea seguir utilizando el programa(S=1 , N=0) :  ");
        Desea= entrada.nextInt();
        }while(Desea== 1);
    }
}
