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
        int numEquipos = pedirNum();

        for (int i = 0; i < numEquipos; i++) {
            System.out.println("Ingrese el nombre del equipo:");
            String nombreEquipo = pedirString();
            System.out.println("Ingrese el nombre del primer piloto:");
            String piloto1 = pedirString();
            System.out.println("Ingrese el nombre del segundo piloto:");
            String piloto2 = pedirString();
        }
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

    public static void setInstance(PitLane instance) {
        PitLane.instance = instance;
    }

    public ArrayList<Equipo> getLstEquipo() {
        return lstEquipo;
    }

    public void setLstEquipo(ArrayList<Equipo> lstEquipo) {
        this.lstEquipo = lstEquipo;
    }

    public ArrayList<Monoplaza> getBox() {
        return box;
    }

    public void setBox(ArrayList<Monoplaza> box) {
        this.box = box;
    }
}

