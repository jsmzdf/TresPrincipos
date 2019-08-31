/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author (╯°□°)╯︵ ┻━┻
 */
public class Main {
     public static void main(String[] args){
     Calculos mod=new Calculos();
     Vista vis=new Vista();
     Controlador contr= new Controlador(vis,mod);
     vis.asignaOyente(contr);
     vis.mostrar();
     }
}
