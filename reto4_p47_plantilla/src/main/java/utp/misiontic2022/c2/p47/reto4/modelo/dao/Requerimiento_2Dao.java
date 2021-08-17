package utp.misiontic2022.c2.p47.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;

public class Requerimiento_2Dao {
    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
        ArrayList<Requerimiento_2> registros2 = new ArrayList<>();
            
            Requerimiento_2 registro2 = null;

            String sql = "SELECT c.ID_MaterialConstruccion, Nombre_Material, "
                    +"c.Cantidad, mc.Precio_Unidad, mc.Precio_Unidad * c.Cantidad 'Precio_Total' "
                    +"FROm Compra c "
                    +"join MaterialConstruccion mc on (c.ID_MaterialConstruccion = mc.ID_MaterialConstruccion) "
                    +"WHERE c.ID_Proyecto IN (10, 14, 23, 24, 38, 50, 29) "
                    +"ORDER by c.ID_Proyecto, mc.Precio_Unidad DESC;";

            try (
                Connection conn = JDBCUtilities.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
            ){
                while (rs.next()){
                    registro2 = new Requerimiento_2();
                    
                    registro2.setID_MaterialConstruccion(rs.getInt("ID_MaterialConstruccion"));
                    registro2.setNombre_Material(rs.getString("Nombre_Material"));
                    registro2.setCantidad(rs.getInt("Cantidad"));
                    registro2.setPrecio_Unidad(rs.getInt("Precio_Unidad"));
                    registro2.setPrecio_Total(rs.getInt("Precio_Total"));
            
                    registros2.add(registro2);
                       
                }
            }            
            return registros2;    
    }
}