/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class KoversiSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);
        double Celcius = 78;
        System.out.println("Diketahui Suhu = 78 derajat Celcius");
        System.out.println("Maka = ");
        System.out.println();
        double reamur = 4f / 5f * Celcius;
                System.out.println("Reamur      = "+reamur+     " Derajat Reamur ");
        double farenheit = (9f/5f*Celcius)+32f;
                System.out.println("Fareneit    = "+farenheit+  " Derajat Farenheit ");
        double kelvin = Celcius + 273f;
                System.out.println("Kelvin      = "+kelvin+     " Derajat Kelvin ");
                
    }
    
}
