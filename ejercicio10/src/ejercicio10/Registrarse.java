package ejercicio10;

public class Registrarse {
    private double importe;
    private Actividad actividad;
    private Socio socio;

    public Registrarse() {
        this.importe = 0;
        this.actividad =  null;
        this.socio = null;
    }
    
     public Registrarse(double importe, Actividad actividad, Socio socio) {
        this.importe = importe;
        this.actividad = actividad;
        this.socio = socio;
    }
    
     public Registrarse(Registrarse r1) {
        this.importe = r1.importe;
        this.actividad = r1.actividad;
        this.socio = r1.socio;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    @Override
    public String toString() {
        return "Registrarse{" + "importe=" + importe + ", actividad=" + actividad + ", socio=" + socio + '}';
    }
    
}
