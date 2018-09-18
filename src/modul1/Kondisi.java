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
public class Kondisi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);
        int nilai;
        System.out.print("Masukkan nilai akhir PBO = "); nilai = masukkan.nextInt();
        if(nilai < 70){
            System.out.println("Siswa tidak LULUS");
        }
        if(nilai > 70){
            System.out.println("Siswa LULUS");
        }
        
    }
    
}
