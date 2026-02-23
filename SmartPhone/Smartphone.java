import java.util.ArrayList;
import java.util.Scanner;

public class Smartphone {

    private int memoriaTotale;
    private int memoriaUsata;
    private int livelloBatteria;
    private String marca;
    private String modello;

    private boolean acceso;

    private ArrayList<App> appInstallate;

    public Smartphone(int memoriaTotale, String marca, String modello) {
        this.memoriaTotale = memoriaTotale;
        this.marca = marca;
        this.modello = modello;

        memoriaUsata = 0;
        livelloBatteria = 100;
        acceso = false;

        appInstallate = new ArrayList<>();
    }

    // ACCENSIONE / SPEGNIMENTO
    public void toggleAccensione() {
        if (acceso) {
            acceso = false;
            System.out.println("Smartphone spento.");
        } else {
            if (livelloBatteria > 0) {
                acceso = true;
                System.out.println("Smartphone acceso.");
            } else {
                System.out.println("Batteria scarica.");
            }
        }
    }

    // PLAY STORE
    public void apriPlayStore(Scanner input) {

        if (!acceso) {
            System.out.println("Accendere il telefono prima.");
            return;
        }

        consumaBatteria();

        System.out.println("\n--- PLAY STORE ---");
        System.out.println("1) WhatsApp (200MB)");
        System.out.println("2) Instagram (150MB)");
        System.out.println("3) Spotify (600MB)");
        System.out.println("0) Indietro");
        System.out.print("Scelta: ");

        int scelta = input.nextInt();

        switch (scelta) {
            case 1:
                installaApp(new App("WhatsApp", 200, 10));
                break;
            case 2:
                installaApp(new App("Instagram", 150, 15));
                break;
            case 3:
                installaApp(new App("Spotify", 600, 40));
                break;
        }
    }

    private void installaApp(App app) {

        for (App a : appInstallate) {
            if (a.getNome().equalsIgnoreCase(app.getNome())) {
                System.out.println("App già installata.");
                return;
            }
        }

        if (memoriaUsata + app.getDimensioneMB() <= memoriaTotale) {
            appInstallate.add(app);
            memoriaUsata += app.getDimensioneMB();
            System.out.println("App installata: " + app.getNome());
        } else {
            System.out.println("Memoria insufficiente.");
        }
    }

    public void ricarica() {
        livelloBatteria = 100;
        System.out.println("Batteria ricaricata.");
    }

    private void consumaBatteria() {
        livelloBatteria -= 10;
        if (livelloBatteria <= 0) {
            livelloBatteria = 0;
            acceso = false;
            System.out.println("Batteria scarica. Smartphone spento.");
        }
    }

    public void mostraStato() {
        System.out.println("\n==============================");
        System.out.println("SMARTPHONE " + marca + " " + modello);
        System.out.println("Acceso: " + (acceso ? "SI" : "NO"));
        System.out.println("Batteria: " + livelloBatteria + "%");
        System.out.println("Memoria: " + memoriaUsata + "/" + memoriaTotale + " MB");
        System.out.println("App installate: " + appInstallate.size());
        System.out.println("==============================");
    }
}
