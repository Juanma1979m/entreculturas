package Clases;

import java.util.Date;
import javax.xml.bind.annotation.*;

@XmlRootElement(name = "ingreso")
@XmlAccessorType(XmlAccessType.FIELD)
public class Ingreso {

    @XmlElement(name = "ref")
    private int ref;
    @XmlElement(name = "fecha")
    private Date fecha;
    @XmlElement(name = "importe")
    private float importe;

    public Ingreso(int miRef, Date miFecha, float miImporte) {
        ref = miRef;
        fecha = miFecha;
        importe = miImporte;
    }

    public int getRef() {
        return ref;
    }

    public void setRef(int miRef) {
        ref = miRef;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date miFecha) {
        fecha = miFecha;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float miImporte) {
        importe = miImporte;
    }
}
