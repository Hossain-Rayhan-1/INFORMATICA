import java.util.Scanner;

public class Main { //classe Main
    public static void main(String[] args) {  //metodo
        Scanner input = new Scanner(System.in); //metodo di importazione "Scanner"

        System.out.print("Inserisci la coordinata X di P1: "); //Chiede la cordinata X 
        double cx = input.nextDouble(); 

        System.out.print("Inserisci la coordinata Y di P1: "); //Chieda la cordinata Y
        double cy = input.nextDouble(); 

        Punto p1 = new Punto(cx, cy); // aspetti essenziali riga 5/13/16/17
 
        System.out.print("Inserisci la coordinata X di P2: "); //Chiede la cordinata X
         cx = input.nextDouble();

        System.out.print("Inserisci la coordinata Y di P2: "); //Chieda la cordinata Y
        cy = input.nextDouble(); 

        Punto p2 = new Punto(cx, cy); // aspetti essenziali riga 5/13/16/17


        System.out.println("Hai creato un punto con coordinate:");
        System.out.println("X = " + p1.getX()); //getter (restituiscono il valore di un punto)
        System.out.println("Y = " + p1.getY()); //Applica il metodo sull oggetto P


        System.out.println("Hai creato un punto con coordinate:");
        System.out.println("X = " + p2.getX()); //getter (restituiscono il valore di un punto)
        System.out.println("Y = " + p2.getY()); //Applica il metodo sull oggetto P

        input.close();
    }
}


