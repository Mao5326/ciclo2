package utp.misiontic2022.c2.p47.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;

public class Requerimiento_1Dao {
    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException {
            ArrayList<Requerimiento_1> registros1 = new ArrayList<>();
            
            Requerimiento_1 registro1 = null;

            String sql = "SELECT Nombre || ' ' || Primer_Apellido 'Lider', Cargo, COUNT(ID_Proyecto) as '# Proyectos' "
                            +"from Lider l "
                            +"join Proyecto p on (l.ID_Lider = p.ID_Lider) "
                            +"where p.Constructora = 'Arquitectura S.A.' "
                            +"group by p.ID_Lider "
                            +"ORDER BY Cargo, Lider;";
            try (
                Connection conn = JDBCUtilities.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
            ){
                while (rs.next()){
                    registro1 = new Requerimiento_1();
                    
                    registro1.setLider(rs.getString("Lider"));
                    registro1.setCargo(rs.getString("Cargo"));
                    registro1.setProyectos(rs.getInt("# Proyectos"));
            
                    registros1.add(registro1);
                       
                }
            }            
            return registros1;    
    }
}