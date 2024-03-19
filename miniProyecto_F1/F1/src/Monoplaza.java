public class Monoplaza {
    //Atributos de la clase
    private String piloto;
    private int velocidad;
    private double tVuelta;
    private int numBox;
    private int vCombustible;

    //Constructor por defecto
    public Monoplaza () {
        piloto = "";
        velocidad = 0;
        tVuelta = 0;
        numBox = 0;
        vCombustible = 0;
    }
    //Constructor parametrizado
    public Monoplaza(String piloto, int velocidad, int numBox, int vCombustible) {
        this.piloto = piloto;
        this.velocidad = velocidad;
        this.tVuelta = generarTiempo();
        this.numBox = numBox;
        this.vCombustible = vCombustible;
    }
    //Getters and Setters
    public String getPiloto() {
        return piloto;
    }
    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }
    public int getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    public double gettVuelta() {
        return tVuelta;
    }
    public void settVuelta(double tVuelta) {
        this.tVuelta = tVuelta;
    }
    public int getNumBox() {
        return numBox;
    }
    public void setNumBox(int numBox) {
        this.numBox = numBox;
    }
    public int getvCombustible() {
        return vCombustible;
    }
    public void setvCombustible(int vCombustible) {
        this.vCombustible = vCombustible;
    }
    //Motodo que genera un num aleatorio entre 70 y 75 y lo devuelve
    public double generarTiempo () {
        double numAleatorio = 0;
        numAleatorio = Math.random() * (75 -70) + 70;
        return numAleatorio;
    }
    @Override
    public String toString() {
        return "Monoplaza [piloto=" + piloto + ", velocidad=" + velocidad + ", tVuelta=" + tVuelta + ", numBox="
                + numBox + ", vCombustible=" + vCombustible + "]";
    }
    

}
