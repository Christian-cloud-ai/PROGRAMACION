package ejercicio10;

public class Actividad {
    private int horario;
    private String responsable;

    public Actividad() {
        this.horario =  0;
        this.responsable = "";
    }
    
    public Actividad(int horario, String responsable) {
        this.horario = horario;
        this.responsable = responsable;
    }
    
    public Actividad(Actividad actividad1) {
        this.horario = actividad1.horario;
        this.responsable = actividad1.responsable;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    @Override
    public String toString() {
        return "Actividad{" + "horario=" + horario + ", responsable=" + responsable + '}';
    }
    
    
}
