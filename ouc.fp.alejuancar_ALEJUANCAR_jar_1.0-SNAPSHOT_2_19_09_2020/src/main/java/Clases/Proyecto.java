package Clases;

import java.util.Date;
import javax.xml.bind.annotation.*;

@XmlRootElement(name="proyecto")
@XmlAccessorType(XmlAccessType.FIELD)
public class Proyecto {
    @XmlElement(name="id")
    protected String id;
    @XmlElement(name="localidad")
    protected String localidad;
    @XmlElement(name="lineaAccion")
    protected String lineaAccion;
    @XmlElement(name="fechaIni")
    protected Date fechaIni;
    @XmlElement(name="fechaFin")
    protected Date fechaFin;
    @XmlElement(name="socioLocal")
    protected String socioLocal;
    @XmlElement(name="financiador")
    protected String financiador;
    @XmlElement(name="cantidadAportada")
    protected float cantidadAportada;
    
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
