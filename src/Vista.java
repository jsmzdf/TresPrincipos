
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Estudiantes
 */
public class Vista extends JFrame {

    
    JLabel verNom = new JLabel("Nombre:  ");
    JTextField nombre = new JTextField(25);
    JLabel vercodper = new JLabel("Codigo:   ");
    JTextField codigo = new JTextField(25);
    JLabel verSaldo = new JLabel("Saldo:     ");
    JTextField saldo = new JTextField(25);
    JButton agregar = new JButton("Agregar");
    JButton recargar = new JButton("Recargar");
    JButton pagar = new JButton("pagar");
    JButton consultar = new JButton("Consultar");
    JTextArea verDatosReg = new JTextArea(10,25);

    
    void mostrar() {
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }

    public Vista() {
        super("Gestor de la tarjeta");
        Container c = getContentPane();
       
        c.setLayout(new FlowLayout());
        
        c.add(verNom);
        c.add(nombre);
        c.add(vercodper);
        c.add(codigo);
        c.add(verSaldo);
        c.add(saldo);
        ///////
        c.add(agregar);
        c.add(consultar);
        c.add(recargar);
        recargar.setEnabled(false);
        c.add(pagar);
        pagar.setEnabled(false);
        c.add(verDatosReg);
        

    }

    void asignaOyente(Controlador c) {
        agregar.addActionListener(c);
        recargar.addActionListener(c);
        pagar.addActionListener(c);
        consultar.addActionListener(c);
    }

}
