package p5;

import java.util.Date;
import javax.xml.bind.annotation.*;

@XmlRootElement(name="proyecto")
@XmlAccessorType(XmlAccessType.FIELD)
public class Proyecto {
    @XmlElement(name="id")
    private String id;
    @XmlElement(name="localidad")
    private String localidad;
    @XmlElement(name="lineaAccion")
    private String lineaAccion;
    @XmlElement(name="fechaIni")
    private Date fechaIni;
    @XmlElement(name="fechaFin")
    private Date fechaFin;
    @XmlElement(name="socioLocal")
    private String socioLocal;
    @XmlElement(name="financiador")
    private String financiador;
    @XmlElement(name="cantidadAportada")
    private float cantidadAportada;
    
    public Proyecto(String miId, String miLocalidad, String miLineaAccion, Date miFechaIni, Date miFechaFin, String miSocioLocal, String miFinanciador, float miCantidadAportada) {
        id = miId;
        localidad = miLocalidad;
        lineaAccion = miLineaAccion;
        fechaIni = miFechaIni;
        fechaFin = miFechaFin;
        socioLocal = miSocioLocal;
        financiador = miFinanciador;
        cantidadAportada = miCantidadAportada;
    }
    
    public String getId() {
        return id;
    }
    
    public String getLocalidad() {
        return localidad;
    }
    
    public String getLineaAccion() {
        return lineaAccion;
    }
}
