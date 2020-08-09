package DAO;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import p5.Ingresos;
import p5.Ingreso;

public class XmlIngresoDAO implements IIngresoDAO {
    private JAXBContext jaxbContext = null;
    private String nombreFichero = null;
    
    public XmlIngresoDAO() throws JAXBException {
        jaxbContext = JAXBContext.newInstance(Ingresos.class);
        nombreFichero = "Ingresos.xml";
    }
    
    @Override
    public void Guardar(Ingresos ingresos) throws JAXBException {
        Marshaller ms = jaxbContext.createMarshaller();
        ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        ms.marshal(ingresos, new File(nombreFichero));
        System.out.println();
        System.out.println("Se ha escrito el fichero " + nombreFichero + " con el siguiente contenido:");
        System.out.println();
        ms.marshal(ingresos, System.out);
    }
    
    @Override
    public Ingresos ListarIngresos() throws JAXBException {
        Unmarshaller um = jaxbContext.createUnmarshaller();
        Ingresos ingresos = (Ingresos)um.unmarshal(new File(nombreFichero));
        System.out.println();
        System.out.println("Estas son las delegaciones contenidas en el fichero " + nombreFichero);
        for(Ingreso ingreso : ingresos.getIngresos()) {
            System.out.println();
            System.out.println("Ref: \t" + ingreso.getRef());
            System.out.println("Fecha: \t" + ingreso.getFecha());
            System.out.println("Importe: \t" + ingreso.getImporte());
        }
        return null;
    }
}
