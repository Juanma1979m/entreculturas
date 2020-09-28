package Clases;

import java.util.ArrayList;
import java.util.List;

public class Ingresos {

    private List<Ingreso> ingresos;

    public List<Ingreso> getIngresos() {
        return ingresos;
    }

    public void setIngresos(List<Ingreso> ingresos) {
        this.ingresos = ingresos;
    }

    public void addIngreso(Ingreso ingreso) {
        if (this.ingresos == null) {
            this.ingresos = new ArrayList<>();
        }
        this.ingresos.add(ingreso);
    }
}
