/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final1;

/**
 *
 * @author francobustos
 */
public class Habitacion {

    private int habitacion;
    private int piso;
    private boolean ocupacion;
    private int dias;

    public Habitacion() {
        habitacion = 0;
        piso = 0;
        ocupacion = false;
        dias = 0;
    }

    public Habitacion(int habitacion, int piso, boolean ocupacion, int dias) {
        this.piso = piso;
        this.habitacion = habitacion;
        this.ocupacion = ocupacion;
        this.dias = dias;
    }

    public int getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(int habitacion) {
        this.habitacion = habitacion;
    }

    public int valor() {
        switch (piso) {
            case 0:
                if (habitacion <= 15) {
                    return 100;
                } else {
                    return 150;
                }
            case 1:
                if (piso == 1) {
                    if (habitacion <= 15) {
                        return 200;
                    } else if (habitacion <= 25) {
                        return 250;
                    } else {
                        return 270;
                    }
                }
                break;
            case 3:
                if (habitacion <= 15) {
                    return 300;
                } else if (habitacion <= 25) {
                    return 350;
                } else {
                    return 500;
                }
        }
        return 0;

    }
}
