
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author (╯°□°)╯︵ ┻━┻
 */
public class Usuario {

   private long codPersona;

    private String nombrePer;
    private long saldo;
    private Calendar fecha;

    public String getNombrePer() {
        return nombrePer;
    }

    public void setNombrePer(String nombrePer) {
        this.nombrePer = nombrePer;
    }

    public long getCodPersona() {
        return codPersona;
    }

    public void setCodPersona(long codPersona) {
        this.codPersona = codPersona;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public Usuario() {
        this.codPersona = 0000;
        this.nombrePer = "         ";
        this.saldo = 0000;

        this.fecha = Calendar.getInstance();
    }

    int actualizarFech() {
        this.fecha = Calendar.getInstance();
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
