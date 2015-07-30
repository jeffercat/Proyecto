/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author AndreaVeronica
 */
public class Time {
    
    String dia ;
    String mes;
    String anio;
    int hour;
    int min;

    public Time() {
    }

    public Time(String dia, String mes, String anio, int hour, int min) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.hour = hour;
        this.min = min;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    
    
   
    
    
    
}
