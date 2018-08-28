package final1;

public class Ganancia {

    private final int teatro = 50;
    private final int almuerzo = 30;
    private final int cena = 30;
    private final int desayuno = 15;
    private final int cine = 20;
    private final int pileta = 5;
    private final int spa = 7;
    private final int gasesosa = 2;
    private final int tostado = 3;
    private final int cerveza = 5;
    private final int vino = 10;
    private final int snacks = 1;
    private final int licuado = 3;
    private int cantTeatro;
    private int cantAlmuerzo;
    private int cantCena;
    private int cantDesayuno;
    private int cantCine;
    private int cantPileta;
    private int cantSpa;
    private int cantGaseosa;
    private int cantTostado;
    private int cantCerveza;
    private int cantVino;
    private int cantSnacks;
    private int cantLicuado;
    private final Habitacion habitacion;

    public Ganancia() {
        cantTeatro = 0;
        cantAlmuerzo = 0;
        cantCena = 0;
        cantDesayuno = 0;
        cantCine = 0;
        cantPileta = 0;
        cantSpa = 0;
        cantGaseosa = 0;
        cantTostado = 0;
        cantCerveza = 0;
        cantVino = 0;
        cantSnacks = 0;
        cantLicuado = 0;
        habitacion = new Habitacion();
    }

    public Ganancia(int cantTeatro, int cantAlmuerzo, int cantCena, int cantDesayuno, int cantCine, int cantPileta, int cantSpa, int cantGaseosa, int cantTostado, int cantCerveza, int cantVino, int cantSnacks, int cantLicuado, Habitacion habitacion) {
        this.cantTeatro = cantTeatro;
        this.cantAlmuerzo = cantAlmuerzo;
        this.cantCena = cantCena;
        this.cantDesayuno = cantDesayuno;
        this.cantCine = cantCine;
        this.cantPileta = cantPileta;
        this.cantSpa = cantSpa;
        this.cantGaseosa = cantGaseosa;
        this.cantTostado = cantTostado;
        this.cantCerveza = cantCerveza;
        this.cantVino = cantVino;
        this.cantSnacks = cantSnacks;
        this.cantLicuado = cantLicuado;
        this.habitacion = habitacion;
    }

    public int getCantTeatro() {
        return cantTeatro;
    }

    public void setCantTeatro(int cantTeatro) {
        this.cantTeatro = cantTeatro;
    }

    public int getCantAlmuerzo() {
        return cantAlmuerzo;
    }

    public void setCantAlmuerzo(int cantAlmuerzo) {
        this.cantAlmuerzo = cantAlmuerzo;
    }

    public int getCantCena() {
        return cantCena;
    }

    public void setCantCena(int cantCena) {
        this.cantCena = cantCena;
    }

    public int getCantDesayuno() {
        return cantDesayuno;
    }

    public void setCantDesayuno(int cantDesayuno) {
        this.cantDesayuno = cantDesayuno;
    }

    public int getCantCine() {
        return cantCine;
    }

    public void setCantCine(int cantCine) {
        this.cantCine = cantCine;
    }

    public int getCantPileta() {
        return cantPileta;
    }

    public void setCantPileta(int cantPileta) {
        this.cantPileta = cantPileta;
    }

    public int getCantSpa() {
        return cantSpa;
    }

    public void setCantSpa(int cantSpa) {
        this.cantSpa = cantSpa;
    }

    public int getCantGaseosa() {
        return cantGaseosa;
    }

    public void setCantGaseosa(int cantGaseosa) {
        this.cantGaseosa = cantGaseosa;
    }

    public int getCantTostado() {
        return cantTostado;
    }

    public void setCantTostado(int cantTostado) {
        this.cantTostado = cantTostado;
    }

    public int getCantCerveza() {
        return cantCerveza;
    }

    public void setCantCerveza(int cantCerveza) {
        this.cantCerveza = cantCerveza;
    }

    public int getCantVino() {
        return cantVino;
    }

    public void setCantVino(int cantVino) {
        this.cantVino = cantVino;
    }

    public int getCantSnacks() {
        return cantSnacks;
    }

    public void setCantSnacks(int cantSnacks) {
        this.cantSnacks = cantSnacks;
    }

    public int getCantLicuado() {
        return cantLicuado;
    }

    public void setCantLicuado(int cantLicuado) {
        this.cantLicuado = cantLicuado;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public int getTeatro() {
        return teatro;
    }

    public int getAlmuerzo() {
        return almuerzo;
    }

    public int getCena() {
        return cena;
    }

    public int getDesayuno() {
        return desayuno;
    }

    public int getCine() {
        return cine;
    }

    public int getPileta() {
        return pileta;
    }

    public int getSpa() {
        return spa;
    }

    public int getGasesosa() {
        return gasesosa;
    }

    public int getTostado() {
        return tostado;
    }

    public int getCerveza() {
        return cerveza;
    }

    public int getVino() {
        return vino;
    }

    public int getSnacks() {
        return snacks;
    }

    public int getLicuado() {
        return licuado;
    }

    public int valorTeatro() {
        return teatro*cantTeatro;
    }

    public int valorAlmuerzo() {
        return almuerzo*cantAlmuerzo;
    }

    public int valorCena() {
        return cena*cantCena;
    }

    public int valorDesayuno() {
        return desayuno*cantDesayuno;
    }

    public int valorCine() {
        return cine*cantCine;
    }

    public int valorPileta() {
        return pileta*cantPileta;
    }

    public int valorSpa() {
        return spa*cantSpa;
    }

    public int valorGasesosa() {
        return gasesosa*cantGaseosa;
    }

    public int valorTostado() {
        return tostado*cantTostado;
    }

    public int valorCerveza() {
        return cerveza*cantCerveza;
    }

    public int valorVino() {
        return vino*cantVino;
    }

    public int valorSnacks() {
        return snacks*cantSnacks;
    }

    public int valorLicuado() {
        return licuado*cantLicuado;
    }

//    public int valorTotal(){
//        return valorAlmuerzo()+valorCena()+valorCerveza()+valorCine()+valorDesayuno()+valorGasesosa()+valorLicuado()+valorPileta()+valorSnacks()+valorSpa()+valorTeatro()+valorTostado()+valorVino()+habitacion;
//    }
}
