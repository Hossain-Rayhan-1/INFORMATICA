import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Smartphone telefono = new Smartphone(64000, "Samsung", "A52");

        int scelta;

        do {
            telefono.mostraStato();

            System.out.println("1) Accendi / Spegni");
            System.out.println("2) Apri Play Store");
            System.out.println("3) Ricarica batteria");
            System.out.println("0) Esci");
            System.out.print("Scelta: ");

            scelta = input.nextInt();

            switch (scelta) {
                case 1:
                    telefono.toggleAccensione();
                    break;

                case 2:
                    telefono.apriPlayStore(input);
                    break;

                case 3:
                    telefono.ricarica();
                    break;

                case 0:
                    System.out.println("Uscita...");
                    break;
            }

        } while (scelta != 0);

        input.close();
    }
}
