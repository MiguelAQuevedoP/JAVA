/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alcancia;

import java.util.Scanner;

/**
 *
 * @author INGESIS
 */
public class clsAlcancia {
    private int total, option, num, mon50, mon100, mon200, mon500, mon1000;
    private boolean flag, flagExit=true;
    
    public clsAlcancia() {
    }
    /*
    public clsAlcancia(int mon50, int mon100, int mon200, int mon500, int mon1000) {
        this.mon50 = mon50;
        this.mon100 = mon100;
        this.mon200 = mon200;
        this.mon500 = mon500;
        this.mon1000 = mon1000;
    }*/
    public int getMon50() {
        return mon50;
    }

    public void setMon50(int mon50) {
        this.mon50 = mon50;
    }

    public int getMon100() {
        return mon100;
    }

    public void setMon100(int mon100) {
        this.mon100 = mon100;
    }

    public int getMon200() {
        return mon200;
    }

    public void setMon200(int mon200) {
        this.mon200 = mon200;
    }

    public int getMon500() {
        return mon500;
    }

    public void setMon500(int mon500) {
        this.mon500 = mon500;
    }

    public int getMon1000() {
        return mon1000;
    }

    public void setMon1000(int mon1000) {
        this.mon1000 = mon1000;
    }

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    public int leerNum(){
        Scanner sc = new Scanner(System.in);
        num = Integer.parseInt(sc.nextLine());
        return num;
    }
    
    public boolean comprobarVal(int valMoneda){
        if (valMoneda==50||valMoneda==100||valMoneda==200||valMoneda==500||valMoneda==1000){
            flag = true;
        }
        else{
            flag = false;
        }
        return flag;
    }
    
    public int totalDinero(){
        total = (mon50*50)+(mon100*100)+(mon200*200)+(mon500*500)+(mon1000*1000);
        return total;
    }
    
    public void MenuCasos(){
        while(flagExit){
            System.out.println("SELECCIONE UNA OPCIÓN");
            switch(leerNum()){
                case 1:  
                    System.out.println("¡MONEDA DE 50 INGRESADA!");
                    setMon50(mon50+1);
                    System.out.println("Tienes "+getMon50()+" de 50");
                    break;
                case 2:
                    System.out.println("¡MONEDA DE 100 INGRESADA!");
                    setMon100(mon100+1);
                    System.out.println("Tienes "+getMon100()+" de 100");
                    break;
                case 3:
                    System.out.println("¡MONEDA DE 200 INGRESADA!");
                    setMon200(mon200+1);
                    System.out.println("Tienes "+getMon200()+" de 200");
                    break;
                case 4:
                    System.out.println("¡MONEDA DE 500 INGRESADA!");
                    setMon500(mon500+1);
                    System.out.println("Tienes "+getMon500()+" de 500");
                    break;
                case 5:
                    System.out.println("¡MONEDA DE 1000 INGRESADA!");
                    setMon1000(mon1000+1);
                    System.out.println("Tienes "+getMon1000()+" de 1000");
                    break;
                case 6:
                    System.out.println("TOTAL DE ALCANCIA: "+totalDinero());
                    System.out.println("Monedas de 50: "+getMon50());
                    System.out.println("Monedas de 100: "+getMon100());
                    System.out.println("Monedas de 200: "+getMon200());
                    System.out.println("Monedas de 500: "+getMon500());
                    System.out.println("Monedas de 1000: "+getMon1000());
                    break;
                case 7:
                    setMon50(0);
                    setMon100(0);
                    setMon200(0);
                    setMon500(0);
                    setMon1000(0);
                    System.out.println("¡ALCANCIA VACIADA!");
                    break;
                case 8:
                    flagExit = false;
                    System.out.println("¡ALCANCIA CERRADA!");
                    System.exit(0);
                    break;
            }
        }
    }
}
