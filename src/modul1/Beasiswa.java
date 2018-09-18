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
public class Beasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);
        System.out.print("Masukkan nilai TPA            : "); int TPA = masukkan.nextInt();
        System.out.print("Masukkan nilai Bahasa Inggris : "); int BahasaInggris = masukkan.nextInt();
        if((TPA > 85) && (BahasaInggris > 80))
            System.out.println("Siswa dapat Beasiswa");
        else
            System.out.println("Siswa tidak dapat Beasiswa");
    }
    
}
