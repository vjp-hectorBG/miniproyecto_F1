import java.util.ArrayList;
import java.util.Scanner;

public class PitLane {
    private static PitLane instance;
    private ArrayList<Equipo> lstEquipo;
    private ArrayList<Monoplaza> box;

    private PitLane() {
        this.lstEquipo = new ArrayList<>();
        this.box = new ArrayList<>();
    }

    private PitLane(ArrayList<Equipo> lstEquipo, ArrayList<Monoplaza> box) {
        this.lstEquipo = lstEquipo;
        this.box = box;
    }

    
    public void intrBox() {

    }

    public String pedirString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un valor:");
        return scanner.nextLine();
    }

    public int pedirNum() {
        Scanner scanner = new Scanner(System.in);
        int val;
        do {
            System.out.println("¿Cuántos equipos hay en el pitlane?");
            val = scanner.nextInt();
            if (val < 2) {
                System.out.println("Por favor, introduzca un número mayor o igual a 2.");
            }
        } while (val < 2);
        return val;
    }

    public static PitLane getInstance() {
        if (instance == null) {
            instance = new PitLane();
        }
        return instance;
    }
}

