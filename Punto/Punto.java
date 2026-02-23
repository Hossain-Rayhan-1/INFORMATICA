public class Punto {  //Classe Punto
    private double x; //Attributi
    private double y;

    public Punto(double x, double y) { //Costruttore
        this.x = x;
        this.y = y;
    }

    public double getX() {  //Getter (restituiscono il valore di X di quel Oggetto)
        return this.x;  //This (generico)
    }

    public void setX(double cx) { //Setter 
        this.x = cx;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double cy) {
        this.y = cy;
    }
}

