package utp.misiontic2022.c2.p47.reto4.vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import utp.misiontic2022.c2.p47.reto4.controlador.ControladorRequerimientos;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_3;

public class VistaRequerimientos extends JFrame{

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();
  
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextArea textArea;
    
    public VistaRequerimientos(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(50, 50, 800, 630);
        setTitle("APP RETO No 5");
        setAutoRequestFocus(true);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder (5,5,5,5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
               

        JLabel lblAutor  =  new JLabel("GABRIEL PEREZ GRUPO 47");
        lblAutor.setBounds(28, 10, 208, 16);
        contentPane.add(lblAutor);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(28, 35, 737, 480);
        contentPane.add(scrollPane);

        textArea = new JTextArea();
        scrollPane.setViewportView(textArea);

        JButton btnRequerimiento1 = new JButton("Requerimiento 1");
        btnRequerimiento1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                requerimiento1();
            }
        });
        btnRequerimiento1.setBounds(20, 540, 180, 30);
        contentPane.add(btnRequerimiento1);

        JButton btnRequerimiento2 = new JButton("Requerimiento 2");
        btnRequerimiento2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                requerimiento2();
            }
        });
        btnRequerimiento2.setBounds(220, 540, 180, 30);
        contentPane.add(btnRequerimiento2);

        JButton btnRequerimiento3 = new JButton("Requerimiento 3");
        btnRequerimiento3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                requerimiento3();
            }
        });
        btnRequerimiento3.setBounds(420, 540, 180, 30);
        contentPane.add(btnRequerimiento3);


        JButton btnLimpiar = new JButton("Limpiar");
        btnLimpiar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
            }
        });
        btnLimpiar.setBounds(650, 537, 117, 29);
        contentPane.add(btnLimpiar);
    }
  //private VistaRequerimientos(){}
    
    public void requerimiento1(){
        try {
            ArrayList<Requerimiento_1> registros1 = controlador.ConsultarRequerimiento1();
            String resultado1 = "--PROYECTOS POR LIDER--\n \n" + "LIDER\t\t" + "CARGO\t\t" + "# PROYECTOS\n\n"; 
            for (Requerimiento_1 requerimiento1 : registros1){
                 resultado1 += requerimiento1.getLider();
                 resultado1 += "\t\t";
                 resultado1 += requerimiento1.getCargo();
                 resultado1 += "\t\t";
                 resultado1 += requerimiento1.getProyectos();
                 resultado1 += "\n";
                 
             }
             textArea.setText(resultado1);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    public void requerimiento2(){
        try {
            ArrayList<Requerimiento_2> registros2 = controlador.ConsultarRequerimiento2();
            String resultado2 = "--MATERIALES POR PRECIO--\n \n" + "ID_MATERIAL\t\t" + "NOMBRE\t\t " 
            + "CANTIDAD\t\t" + "PRECIO UNIDAD\t" + "PRECIO TOTAL\n\n";
            for (Requerimiento_2 requerimiento2 : registros2){
                 resultado2 += requerimiento2.getID_MaterialConstruccion();
                 resultado2 += "\t\t";
                 resultado2 += requerimiento2.getNombre_Material();
                 resultado2 += "\t\t";
                 resultado2 += requerimiento2.getCantidad();
                 resultado2 += "\t\t";
                 resultado2 += requerimiento2.getPrecio_Unidad();
                 resultado2 += "\t\t";
                 resultado2 += requerimiento2.getPrecio_Total();
                 resultado2 += "\n";
             }

             textArea.setText(resultado2);

        } catch (Exception e) {
            System.err.println(e);
        }
    }
    public void requerimiento3(){
        try {
            ArrayList<Requerimiento_3> registros3 = controlador.ConsultarRequerimiento3();
            String resultado3 = "--PROYECTOS --\n \n" + "ID_PROYECTO\t\t" + "CIUDAD\t\t " 
            + "CLASIFICACION\t" + "COSTO PROYECTO\n\n"; 
            for (Requerimiento_3 requerimiento3 : registros3){
                 resultado3 += requerimiento3.getID_Proyecto();
                 resultado3 += "\t\t";
                 resultado3 += requerimiento3.getCiudad();
                 resultado3 += "\t\t";
                 resultado3 += requerimiento3.getClasificacion();
                 resultado3 += "\t\t";
                 resultado3 += requerimiento3.getCosto_Proyecto();
                 resultado3 += "\n";
             }
             textArea.setText(resultado3);

        } catch (Exception e) {
            System.err.println(e);
        }
    }
}

    