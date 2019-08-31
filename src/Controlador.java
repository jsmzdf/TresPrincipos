
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
    Calculos mod = new Calculos();

    public Controlador(Vista vis, Calculos mod) {
        this.vis = vis;
        this.mod = mod;
    }

    @Override
    public void actionPerformed(ActionEvent evento1) {
        try {
            if (evento1.getSource() == vis.agregar & mod.validar(Long.parseLong(vis.codigo.getText())) == false) {

                mod.NomPer(vis.nombre.getText());
                mod.CodPer(Long.parseLong(vis.codigo.getText()));
                mod.saldo = Long.parseLong(vis.saldo.getText());

                vis.verDatosReg.setText("Nombre pasajero: " + mod.nombrePer
                        + "\nNombre pasajero: " + mod.codPersona
                        + "\nSaldo del  pasajero: " + mod.saldo);
                vis.nombre.setText(null);
                vis.codigo.setText(null);
                vis.saldo.setText(null);
            }

            if (evento1.getSource() == vis.consultar & mod.validar(Long.parseLong(vis.codigo.getText())) == true) {
                vis.nombre.setEnabled(false);
                vis.agregar.setEnabled(false);
                vis.codigo.setEnabled(false);
                vis.recargar.setEnabled(true);
                vis.pagar.setEnabled(true);
                vis.nombre.setText(null);
                vis.saldo.setText(null);
                vis.verDatosReg.setText("Nombre pasajero: " + mod.nombrePer
                        + "\nNombre pasajero: " + mod.codPersona
                        + "\nSaldo actual del  pasajero: " + mod.saldo
                        + "\nFecha de ultimo pago: " + mod.fecha.getTime().toString());

            }
            if (evento1.getSource() == vis.recargar) {
                vis.nombre.setEnabled(true);
                vis.codigo.setEnabled(true);
                mod.recargar(Long.parseLong(vis.saldo.getText()));
                vis.verDatosReg.setText("Nombre pasajero: " + mod.nombrePer
                        + "\nNombre pasajero: " + mod.codPersona
                        + "\nSaldo del  pasajero: " + mod.saldo
                        + "\nFecha de ultimo pago: " + mod.fecha.getTime().toString());
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
                vis.verDatosReg.setText("Nombre pasajero: " + mod.nombrePer
                        + "\nNombre pasajero: " + mod.codPersona
                        + "\nSaldo del  pasajero: " + mod.saldo
                        + "\nFecha de pago: " + mod.fecha.getTime().toString());
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
