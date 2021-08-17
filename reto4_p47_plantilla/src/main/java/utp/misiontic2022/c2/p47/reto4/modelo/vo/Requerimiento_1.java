package utp.misiontic2022.c2.p47.reto4.modelo.vo;

public class Requerimiento_1 {
    private String Lider;
    private String Cargo;
    private Integer Proyectos;
    
    public Requerimiento_1() {
    }

    public Requerimiento_1(String Lider, String Cargo, Integer Proyectos) {
        this.Lider = Lider;
        this.Cargo = Cargo;
        this.Proyectos = Proyectos;
    }   
    public String getLider() {
        return Lider;
    }

    public void setLider(String lider) {
        Lider = lider;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    public Integer getProyectos() {
        return Proyectos;
    }

    public void setProyectos(Integer proyectos) {
        Proyectos = proyectos;
    }
}

