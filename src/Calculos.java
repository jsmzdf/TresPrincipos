
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
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
public class Calculos {

    long codPersona;
    long valorPasaje;
    String nombrePer;
    long saldo;
    Calendar fecha;

    public Calculos() {
        this.codPersona = 0000;
        this.nombrePer = "         ";
        this.saldo = 0000;
        this.valorPasaje = 2300;
        this.fecha = Calendar.getInstance();
    }

    String NomPer(String a) {
        this.nombrePer = a;
        return null;
    }

    long CodPer(long b) {
        this.codPersona = b;
        return 0;
    }

    int actualizarFech() {
        this.fecha = Calendar.getInstance();
        return 0;
    }

    long modifiSaldo(long c) {
        this.saldo = c;
        return 0;
    }

    long recargar(long c) {

        this.saldo = this.saldo + c;

        return 0;
    }

    long Pagar() {
        if (this.saldo >= -2300) {
            this.saldo = this.saldo - this.valorPasaje;
            this.fecha = Calendar.getInstance();

        } else {
            JOptionPane.showMessageDialog(null, "Susaldo no es suficiente, por favot recargue ", "Importante", 1);
        }
        return 0;
    }

    boolean validar(long a) {
        if (this.codPersona == a) {

            return true;
        } else {

            return false;
        }

    }

}
