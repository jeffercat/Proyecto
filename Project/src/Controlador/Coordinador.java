/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;
import Modelo.Car;
import Modelo.Time;
import Modelo.TimeDao;
import Vista.PicoYPlaca;


/**
 *
 * @author JEFFERSON
 */
public class Coordinador {
    private TimeDao miTimeDao;
    private PicoYPlaca MiPicoYPlaca;

    public TimeDao getMiTimeDao() {
        return miTimeDao;
    }

    public void setMiTimeDao(TimeDao miTimeDao) {
        this.miTimeDao = miTimeDao;
    }

    public PicoYPlaca getMiPicoYPlaca() {
        return MiPicoYPlaca;
    }

    public void setMiPicoYPlaca(PicoYPlaca MiPicoYPlaca) {
        this.MiPicoYPlaca = MiPicoYPlaca;
    }
    
    public void mostrarVentana(){
        MiPicoYPlaca.setVisible(true);
    }
    public void Validacion(Time myTime,Car myCar){
        miTimeDao.ValidacionPicoyPlaca(myTime, myCar);
    }
}
