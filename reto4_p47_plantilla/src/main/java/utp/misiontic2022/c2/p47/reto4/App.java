package utp.misiontic2022.c2.p47.reto4;

import java.awt.EventQueue;
import utp.misiontic2022.c2.p47.reto4.vista.VistaRequerimientos;

public class App {   
    public static void main(String[] args) {
    
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try{
                    VistaRequerimientos frame = new VistaRequerimientos();
                    frame.setVisible(true);
                } catch(Exception e ){
                    e.printStackTrace();
                }
           }
        });
        
    }
} 

