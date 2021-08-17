package utp.misiontic2022.c2.p47.reto4.controlador;

import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.dao.Requerimiento_1Dao;
import utp.misiontic2022.c2.p47.reto4.modelo.dao.Requerimiento_2Dao;
import utp.misiontic2022.c2.p47.reto4.modelo.dao.Requerimiento_3Dao;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_3;

public class ControladorRequerimientos {

    private final Requerimiento_1Dao requerimiento1Dao;
    private final Requerimiento_2Dao requerimiento2Dao;
    private final Requerimiento_3Dao requerimiento3Dao;

 public  ControladorRequerimientos(){
     this.requerimiento1Dao = new Requerimiento_1Dao();
     this.requerimiento2Dao = new Requerimiento_2Dao();
     this.requerimiento3Dao = new Requerimiento_3Dao();
 }   
public ArrayList<Requerimiento_1> ConsultarRequerimiento1() throws SQLException{
    return requerimiento1Dao.requerimiento1();
}
public ArrayList<Requerimiento_2> ConsultarRequerimiento2() throws SQLException{
    return requerimiento2Dao.requerimiento2();
}
public ArrayList<Requerimiento_3> ConsultarRequerimiento3() throws SQLException{
    return requerimiento3Dao.requerimiento3();
}
}