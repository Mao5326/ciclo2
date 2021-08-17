package utp.misiontic2022.c2.p47.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_3;
import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;

public class Requerimiento_3Dao {
    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
        // Su código
        ArrayList<Requerimiento_3> registros3 = new ArrayList<>();
            
            Requerimiento_3 registro3 = null;

        String sql = "SELECT sc.ID_Proyecto, Ciudad, Clasificacion, "
                    +"sum(Precio_Total) Costo_Proyecto "
                    +"from (select ID_Proyecto, ID_MaterialConstruccion, "
                    +"Cantidad * Precio_Unidad Precio_Total "
                    +"from MaterialConstruccion mc "
                    +"join Compra c "
                    +"using (ID_MaterialConstruccion)) sc, Proyecto p "
                    +"where sc.ID_Proyecto = p.ID_Proyecto and Ciudad in ('Monteria', 'Santa Marta') "
                    +"group by Ciudad, Clasificacion, sc.ID_Proyecto "
                    +"HAVING SUM(Precio_Total) > 70000;";

            try (
                Connection conn = JDBCUtilities.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
            ){
                while (rs.next()){
                    registro3 = new Requerimiento_3();
                    
                    registro3.setID_Proyecto(rs.getInt("ID_Proyecto"));
                    registro3.setCiudad(rs.getString("Ciudad"));
                    registro3.setClasificacion(rs.getString("Clasificacion"));
                    registro3.setCosto_Proyecto(rs.getInt("Costo_Proyecto"));
                    
            
                    registros3.add(registro3);
                       
                }
            }            
            return registros3;    
    }
}