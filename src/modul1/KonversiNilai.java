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
public class KonversiNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);
        System.out.print("Masukkan Nilai WEB = "); int nilai = masukkan.nextInt();
        if(nilai >= 90){
            System.out.println("Nilai A");
        }else if(nilai >= 75){
            System.out.println("NILAI B");
        }else if(nilai >= 50){
            System.out.println("NILAI C");
        }else if(nilai >= 35){
            System.out.println("NILAI D");
        }else
            System.out.println("NILAI E");
    }
    
}
