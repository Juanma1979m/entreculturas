package Clases;

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
    public void setDelegaciones(List<Delegacion> listaDelegaciones) {
        this.listaDelegaciones = listaDelegaciones;
    }

    public void addDelegacion(Delegacion delegaciones) {
        if (this.listaDelegaciones == null) {
            this.listaDelegaciones = new ArrayList<>();
        }
        this.listaDelegaciones.add(delegaciones);
    }
}
