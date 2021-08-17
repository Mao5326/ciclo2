package utp.misiontic2022.c2.p47.reto4.modelo.vo;

public class Requerimiento_2 {
    private Integer ID_MaterialConstruccion;
    private String Nombre_Material;
    private Integer Cantidad;
    private Integer Precio_Unidad;
    private Integer Precio_Total;
    
    public Requerimiento_2() {
    }
    
    public Integer getID_MaterialConstruccion() {
        return ID_MaterialConstruccion;
    }


    public void setID_MaterialConstruccion(Integer iD_MaterialConstruccion) {
        ID_MaterialConstruccion = iD_MaterialConstruccion;
    }


    public String getNombre_Material() {
        return Nombre_Material;
    }


    public void setNombre_Material(String nombre_Material) {
        Nombre_Material = nombre_Material;
    }


    public Integer getCantidad() {
        return Cantidad;
    }


    public void setCantidad(Integer cantidad) {
        Cantidad = cantidad;
    }
    public Requerimiento_2(Integer ID_MaterialConstruccion, String Nombre_Material, Integer Cantidad, Integer Precio_Unidad, Integer Precio_Total) {
        this.ID_MaterialConstruccion = ID_MaterialConstruccion;
        this.Nombre_Material = Nombre_Material;
        this.Cantidad = Cantidad;
        this.Precio_Unidad = Precio_Unidad;
        this.Precio_Total = Precio_Total;

    }    
        public Integer getPrecio_Unidad() {
        return Precio_Unidad;
    }


    public void setPrecio_Unidad(Integer precio_Unidad) {
        Precio_Unidad = precio_Unidad;
    }


    public Integer getPrecio_Total() {
        return Precio_Total;
    }


    public void setPrecio_Total(Integer precio_Total) {
        Precio_Total = precio_Total;
    }
}
    
      
 