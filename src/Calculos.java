
import java.util.Calendar;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author (╯°□°)╯︵ ┻━┻
 */
import java.util.Calendar;
import java.util.Date;

public class Calculos {
     private long valorPasaje;

   

    public Calculos() {
        this.valorPasaje = 2400;
        
    }
    
    public long recargar(long saldo, long c) {

        saldo = saldo + c;

        return saldo;
    }

    long Pagar(long saldo ) {
        if (saldo >= -2400) {
           saldo = saldo - valorPasaje;


        } else {
            JOptionPane.showMessageDialog(null, "Susaldo no es suficiente, por favot recargue ", "Importante", 1);
        }
        return saldo;
    }
}
