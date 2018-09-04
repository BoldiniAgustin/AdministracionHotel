package final1;

public class Grupo {

    private String grupo;
    private Ganancia ganancia;
    private Habitacion habitacion;

    public Grupo() {
        grupo = "";
        ganancia = new Ganancia();
        habitacion = new Habitacion();
    }

    public Grupo(String grupo) {
        this.grupo = grupo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public Ganancia getGanancia() {
        return ganancia;
    }

    public void setGanancia(Ganancia ganancia) {
        this.ganancia = ganancia;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
    
    

}
