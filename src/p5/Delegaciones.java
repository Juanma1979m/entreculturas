package p5;

import java.util.ArrayList;
import java.util.List;

public class Delegaciones {
    private List<Delegacion> delegaciones;
    
    public List<Delegacion> getDelegaciones() {
        return delegaciones;
    }
    
    public void setDelegaciones(List<Delegacion> delegaciones) {
        this.delegaciones = delegaciones;
    }
    
    public void addDelegacion(Delegacion delegacion) {
        if(this.delegaciones == null) {
            this.delegaciones = new ArrayList<Delegacion>();
        }
        this.delegaciones.add(delegacion);
    }
}
