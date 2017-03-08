package areas.y.perimetros;
import java.util.Scanner;
/**
 * esta clase contiene el menu del programa y este es lo primero que ve el usuario
 * @author Juan Ricardo Rodriguez Campos
 * @verion 1.0.0
 * @since Areas y Perimetros 1.0.0
 */
import java.util.Scanner;

public class Menu {

    private Scanner teclado;
    
    /**
     * Constructor de la clase
     */
    public Menu() {
        teclado = new Scanner(System.in);        
        mensajeBienvenida();
        iniciar();
    }
    
    /**
     * Metodo que da la bienvenida al programa
     */
    private void mensajeBienvenida(){
        System.out.println("------BIENVENIDO-----");
    }
    
    /**
     * Metodo que da inicio al menu de opciones
     */
    private void iniciar() {        
        OUTER:
        while (true) {
            System.out.println("1. Triangulo ");
            System.out.println("2. Rectangulo o cuadrado ");
            System.out.println("3. Circulo");
            System.out.println("4.Salir");
            byte opcion =  teclado.nextByte();
            switch (opcion) {
                case 1:
                    iniciarTriangulo();
                    break;
                case 2:
                    iniciarRectangulo();
                    break;
                case 3:
                    iniciarCirculo();
                    break;
                case 4:
                    break OUTER;
                default:
                    System.out.println("Numero no valido");
                    break;
            }
        }
    }
    
    /**
     * Metodo que toma las cordenadas del triangulo y llama al objeto para las operaciones
     */
    private void iniciarTriangulo(){
        double x, y;
        System.out.println("Digite lado x1");
        x = teclado.nextDouble();
        System.out.println("Digite lado y1");
        y = teclado.nextDouble();
        Punto punto1 = new Punto(x, y);
        System.out.println("Digite lado x2");
        x = teclado.nextDouble();
        System.out.println("Digite lado y2");
        y = teclado.nextDouble();
        Punto punto2 = new Punto(x, y);
        System.out.println("Digite lado x3");
        x = teclado.nextDouble();
        System.out.println("Digite lado y3");
        y = teclado.nextDouble();
        Punto punto3 = new Punto(x, y);
        Triangulo triangulo = new Triangulo(punto1, punto2, punto3);
        triangulo.darResultados();        
    }
    /**
    * Metodo que toma las coordenadas de un rectangulo y llama al objeto
    * para realizar las operaciones corespondientes
    */
    private void iniciarRectangulo(){
        double x, y;
        System.out.println("Digite lado x1");
        x = teclado.nextDouble();
        System.out.println("Digite lado y1");
        y = teclado.nextDouble();
        Punto punto1 = new Punto(x, y);
        System.out.println("Digite lado x2");
        x = teclado.nextDouble();
        System.out.println("Digite lado y2");
        y = teclado.nextDouble();
        Punto punto2 = new Punto(x, y);
        System.out.println("Digite lado x3");
        x = teclado.nextDouble();
        System.out.println("Digite lado y3");
        y = teclado.nextDouble();
        Punto punto3 = new Punto(x, y);
        System.out.println("Digite lado x4");
        x = teclado.nextDouble();
        System.out.println("Digite lado y4");
        y = teclado.nextDouble();
        Punto punto4 = new Punto(x, y);
        Rectangulo rectangulo = new Rectangulo(punto1, punto2, punto3,punto4);
        rectangulo.darResultados();        
    }
    /**
    *Metodo que toma el radio de un circulo y llama al objeto para realizar las operaciones
    */
    private void iniciarCirculo(){
        double radio;
        System.out.println("Digite el radio del circulo");
        radio = teclado.nextDouble();
        Circulo Circulo = new Circulo((float)radio);
        Circulo.darResultados();
        
    }

}//fin de la clase Menu
