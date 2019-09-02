
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
public class Modelo {

    Usuario usuario;
Calculos calculos;
    public Modelo() {
        usuario = new Usuario();
        calculos = new Calculos();
    }

    public void NomPer(String a) {
        this.usuario.setNombrePer(a);
    }

    public void CodPer(long b) {
        this.usuario.setCodPersona(b);

    }

    public void actualizarFech() {
        usuario.actualizarFech();
    }

    public void modifiSaldo(long c) {
        this.usuario.setSaldo(c);

    }

    public void recargar(long c) {
        usuario.setSaldo(calculos.recargar(usuario.getSaldo(), c));
      usuario.actualizarFech();
       
    }

    public void Pagar() {
       usuario.setSaldo(calculos.Pagar(usuario.getSaldo()));
       usuario.actualizarFech();
    }

    

    

}
