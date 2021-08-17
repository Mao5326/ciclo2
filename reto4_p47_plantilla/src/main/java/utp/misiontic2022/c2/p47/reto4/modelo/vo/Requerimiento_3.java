package utp.misiontic2022.c2.p47.reto4.modelo.vo;

public class Requerimiento_3 {
    // Su código
    private Integer ID_Proyecto;
    private String Ciudad;
    private String Clasificacion;
    private Integer Costo_Proyecto;

    public Requerimiento_3() {
    }
    public Requerimiento_3(Integer ID_Proyecto, String Ciudad, String Clasificacion, Integer Costo_Proyecto) {
        this.ID_Proyecto = ID_Proyecto;
        this.Ciudad = Ciudad;
        this.Clasificacion = Clasificacion;
        this.Costo_Proyecto = Costo_Proyecto;
    }   
    public Integer getID_Proyecto() {
        return ID_Proyecto;
    }

    public void setID_Proyecto(Integer iD_Proyecto) {
        ID_Proyecto = iD_Proyecto;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public String getClasificacion() {
        return Clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        Clasificacion = clasificacion;
    }

    public Integer getCosto_Proyecto() {
        return Costo_Proyecto;
    }

    public void setCosto_Proyecto(Integer costo_Proyecto) {
        Costo_Proyecto = costo_Proyecto;
    }
    
}
