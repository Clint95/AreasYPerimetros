package areas.y.perimetros;
/**
 * la clase Punto captura las coordenadas que se necesitan para calcular las areas y perimetros
 * @author Juan Ricardo Rodriguez Campos
 * @verion 2.0.0
 * @since Areas y Perimetros 2.0.0
 */
public class Punto {
    
    /**
     * Atributo que aloja la cordenada x
     */
    private double x;

    /**
     * Atributo que aloja la cordenada y
     */    
    private double y;

    /**
     * Constructor de la clase que inicializa las variables
     * @param x
     * @param y 
     */
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Retorna el valor de x de la cordenada
     * @return x
     */
    public double getX() {
        return x;
    }

    /**
     * Modifica cordenada x
     * @param x 
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Retorna el valor de y de la cordenada
     * @return y
     */    
    public double getY() {
        return y;
    }

    /**
     * Modifica cordenada y
     * @param y
     */    
    public void setY(double y) {
        this.y = y;
    }
                
}

