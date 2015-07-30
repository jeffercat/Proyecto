/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import Modelo.Car;

import Modelo.Time;
import java.util.Calendar;
import Vista.PicoYPlaca;
import Controlador.Coordinador;
/**
 *
 * @author AndreaVeronica
 */
public class TimeDao {
    private Coordinador miCoordinador;

    public void setMiCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;
    }
    
    public void ValidacionPicoyPlaca(Time myTime,Car myCar){
        char UD=myCar.getPlaca().charAt(myCar.getPlaca().length()-1);
        PicoYPlaca obj;
        Calendar calendario = Calendar.getInstance();
        
        //calendario.set(year, month, date);
        calendario.set(Integer.parseInt(myTime.getAnio()), Integer.parseInt(myTime.getMes()),Integer.parseInt(myTime.getDia()));  // 2011-04-08
        int dia = calendario.get(Calendar.DAY_OF_WEEK);
        int t=myTime.getHour()*60+myTime.getMin();
        switch(dia){
            case 1:
                if((UD=='7' || UD=='8')&&(t>=420 && t<=570 )||(t>=960 && t<=1170)){
                    myCar.setResultado("Tine Pico Y Placa");
                }
                else
                    myCar.setResultado("No posee Pico y Placa");
                break;
            case 2:
                if((UD=='9' || UD=='0')&&(t>=420 && t<=570 )||(t>=960 && t<=1170)){
                    myCar.setResultado("Tine Pico Y Placa");
                }
                else
                    myCar.setResultado("No posee Pico y Placa");
                break;
            case 3:
                    myCar.setResultado("No posee Pico y Placa");
                break;
            case 4:
                myCar.setResultado("No posee Pico y Placa");
                break;
            case 5:
                if((UD=='1' || UD=='2')&&(t>=420 && t<=570 )||(t>=960 && t<=1170)){
                    myCar.setResultado("Tine Pico Y Placa");
                }
                else
                    myCar.setResultado("No posee Pico y Placa");
                break;
            case 6:
                if((UD=='3' || UD=='4')&&(t>=420 && t<=570 )||(t>=960 && t<=1170)){
                    myCar.setResultado("Tine Pico Y Placa");
                }
                else
                    myCar.setResultado("No posee Pico y Placa");
                break;
            case 7:
                if((UD=='5' || UD=='6')&&(t>=420 && t<=570 )||(t>=960 && t<=1170)){
                    myCar.setResultado("Tine Pico Y Placa");
                }
                else
                    myCar.setResultado("No posee Pico y Placa");
                break;
        }
            
    }
    
    
}
