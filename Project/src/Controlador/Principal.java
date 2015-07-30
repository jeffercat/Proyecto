/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;
import Vista.PicoYPlaca;
/**
 *
 * @author JEFFERSON
 */
public class Principal {
    private PicoYPlaca MiPicoYPlaca;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Principal miPrincipal=new Principal();
        miPrincipal.iniciar();
        
    }
    public void iniciar(){
        MiPicoYPlaca=new PicoYPlaca();
        MiPicoYPlaca.setVisible(true);
    }
    
}
