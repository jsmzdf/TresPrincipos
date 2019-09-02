
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.ir.CatchNode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Estudiantes
 */
public class Controlador implements ActionListener {

    Vista vis = new Vista();
    Modelo mod = new Modelo();

    public Controlador(Vista vis, Modelo mod) {
        this.vis = vis;
        this.mod = mod;
    }

    @Override
    public void actionPerformed(ActionEvent evento1) {
        try {
            if (evento1.getSource() == vis.agregar & mod.usuario.validar(Long.parseLong(vis.codigo.getText())) == false) {

                mod.NomPer(vis.nombre.getText());
                mod.CodPer(Long.parseLong(vis.codigo.getText()));
                mod.usuario.setSaldo(Long.parseLong(vis.saldo.getText())) ;

                vis.verDatosReg.setText("Nombre pasajero: " + mod.usuario.getNombrePer()
                        + "\nNombre pasajero: " + mod.usuario.getCodPersona()
                        + "\nSaldo del  pasajero: " + mod.usuario.getSaldo());
                vis.nombre.setText(null);
                vis.codigo.setText(null);
                vis.saldo.setText(null);
            }

            if (evento1.getSource() == vis.consultar & mod.usuario.validar(Long.parseLong(vis.codigo.getText())) == true) {
                vis.nombre.setEnabled(false);
                vis.agregar.setEnabled(false);
                vis.codigo.setEnabled(false);
                vis.recargar.setEnabled(true);
                vis.pagar.setEnabled(true);
                vis.saldo.setText(null);
                vis.verDatosReg.setText("Nombre pasajero: " + mod.usuario.getNombrePer()
                        + "\nNombre pasajero: " + mod.usuario.getCodPersona()
                        + "\nSaldo actual del  pasajero: " + mod.usuario.getSaldo()
                        + "\nFecha de ultimo pago: " + mod.usuario.getFecha().getTime().toString());

            }
            if (evento1.getSource() == vis.recargar) {
                vis.nombre.setEnabled(true);
                vis.codigo.setEnabled(true);
                mod.recargar(Long.parseLong(vis.saldo.getText()));
                vis.verDatosReg.setText("Nombre pasajero: " + mod.usuario.getNombrePer()
                        + "\nNombre pasajero: " + mod.usuario.getCodPersona()
                        + "\nSaldo del  pasajero: " + mod.usuario.getSaldo()
                        + "\nFecha de ultimo pago: " + mod.usuario.getFecha().getTime().toString());
                vis.recargar.setEnabled(false);
                vis.pagar.setEnabled(false);
                vis.nombre.setText(null);
                vis.codigo.setText(null);
                vis.saldo.setText(null);
                vis.agregar.setEnabled(true);
            }

            if (evento1.getSource() == vis.pagar) {
                vis.nombre.setEnabled(true);
                vis.codigo.setEnabled(true);
                mod.Pagar();
                vis.verDatosReg.setText("Nombre pasajero: " + mod.usuario.getNombrePer()
                        + "\nNombre pasajero: " + mod.usuario.getCodPersona()
                        + "\nSaldo del  pasajero: " + mod.usuario.getSaldo()
                        + "\nFecha de pago: " + mod.usuario.getFecha().getTime().toString());
                vis.recargar.setEnabled(false);
                vis.pagar.setEnabled(false);
                vis.nombre.setText(null);
                vis.codigo.setText(null);
                vis.saldo.setText(null);
                vis.agregar.setEnabled(true);
            }

        } catch (ArithmeticException e) {

            JOptionPane.showMessageDialog(null, "Error uno de los datos ingresados no"
                    + "\n es correct, por favor ingreselos nuevamente. ", "Error", JOptionPane.ERROR_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ingrese valores para "
                    + "\n agregar o consultar. ", "Importante", 1);
        }
    }

//
}
