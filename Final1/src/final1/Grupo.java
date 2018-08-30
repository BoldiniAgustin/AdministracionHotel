package final1;

public class Grupo {

    private String grupo;
    private Ganancia ganancia;

    public Grupo() {
        grupo = "";
        ganancia = new Ganancia();
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
    
    

}
