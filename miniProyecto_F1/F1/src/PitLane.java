import java.util.ArrayList;
import java.util.Scanner;

public final class PitLane {
    private static PitLane instance;
    private Equipo vEquipo[];
    private Monoplaza box[];

    private PitLane() {
        this.vEquipo = new Equipo[10];
        this.box = new Monoplaza[10];
    }

    private PitLane(ArrayList<Equipo> lstEquipo, ArrayList<Monoplaza> box) {
        this.lstEquipo = new ArrayList<Equipo>();
        this.box = new ArrayList<Monoplaza>();
    }


    public void intrBox() {

    }

    public String pedirString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("    Valor :");
        String val = scanner.nextLine();
        return val;
    }

    public int pedirNum() {
        Scanner scanner = new Scanner(System.in);
        boolean min = false;
        int val = 0;
        while (!min) {
            System.out.println("¿Cuantos equipos hay en el pitlane?");
            val = scanner.nextInt();
            if (val < 2) {
                System.out.println("Porfavor introduzca un numero mayor de 2");
            } else {
                min = true;
            }
        }
        return val;
    }

    public static PitLane getInstance(ArrayList<Equipo> lstEquipo, ArrayList<Monoplaza> box) {
        if (instance == null) {
            instance = new PitLane(lstEquipo, box);
        }
        return instance;
    }
}
