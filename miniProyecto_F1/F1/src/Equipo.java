import java.util.Scanner;

public class Equipo {

    private String nombre;
    private Monoplaza [] monoplazas;

    //Contructor por defecto de la clase
    public Equipo() {
        nombre=" ";
        monoplazas = new Monoplaza[2];
    }

    //Contructor parametrizado de la clase 
    public Equipo(String nombre) {
        this.nombre = nombre;
        this.monoplazas = new Monoplaza[2];
    }

    //Pedir texto (String)
    public String pedirString (){
        Scanner scanner = new Scanner (System.in);
        System.out.println("    Valor :");
        String val = scanner.nextLine();
        return val;
    }

    //Pedir numero (int)
    public int pedirNum (){
        Scanner scanner = new Scanner (System.in);
        System.out.println("    Valor :");
        int val = scanner.nextInt();
        return val;
    }

    //en este metodo se añaden todos los datos a un objeto de la clase Monoplaza y se devuelve
    public Monoplaza generarMonoplaza(){
        System.out.println("Piloto: ");
        String pilot = pedirString();
        System.out.println("Velocidad: ");
        int vel = pedirNum();
        System.out.println("Num Box: ");
        int box = pedirNum();
        System.out.println("Cantidad de vueltas: ");
        int vueltas = pedirNum();

        Monoplaza monoplaza = new Monoplaza(pilot, vel, box, vueltas);
        return monoplaza;
    }

    //Metodo para añador los dos dos monoplazas al arrays
    public void rellenarArray(){
        for(int i =0 ; i<monoplazas.length ; i++){
            monoplazas[i]=generarMonoplaza();
        }
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monoplaza[] getMonoplazas() {
        return monoplazas;
    }

    public void setMonoplazas(Monoplaza[] monoplazas) {
        this.monoplazas = monoplazas;
    }

    //Metodo para enseñar el objeto de la clase equipo

    public void mostrarEquipo(){
        System.out.println(nombre);
        for(int i=0 ; i<monoplazas.length ; i++){
            System.out.println("    " + monoplazas[i].toString());
        }
    }
}
