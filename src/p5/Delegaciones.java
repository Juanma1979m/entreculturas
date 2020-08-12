package p5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Delegaciones")
public class Delegaciones {
    private List<Delegacion> listaDelegaciones;
    
    public List<Delegacion> getDelegaciones() {
        return listaDelegaciones;
    }
     @XmlElement(name = "Delegacion")
    public void setDelegaciones(List<Delegacion> delegaciones) {
        this.listaDelegaciones = listaDelegaciones;
    }
    
    public void addDelegacion(Delegacion delegaciones) {
        if(this.listaDelegaciones == null) {
            this.listaDelegaciones = new ArrayList<Delegacion>();
        }
        this.listaDelegaciones.add(delegaciones);
    }
}
