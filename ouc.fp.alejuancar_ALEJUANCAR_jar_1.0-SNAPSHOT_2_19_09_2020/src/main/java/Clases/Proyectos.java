package Clases;

import java.util.ArrayList;
import java.util.List;

public class Proyectos {

    private List<Proyecto> proyectos;

    public List<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(List<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

    public void addProyectos(Proyecto proyecto) {
        if (this.proyectos == null) {
            this.proyectos = new ArrayList<>();
        }
        this.proyectos.add(proyecto);
    }
}
