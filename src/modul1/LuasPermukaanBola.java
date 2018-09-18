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
public class LuasPermukaanBola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);
        double phi = 3.14, r, luas;

        System.out.println("============================================");
        System.out.println("Program Hitung Luas Permukaan bola dalam cm2");
        System.out.println("============================================");
        System.out.println();

        System.out.print("Masukkan jari jari Lingkaran : ");
        r = masukkan.nextDouble();
        luas = 4 * phi * r * r;
        System.out.println("Luas Permukaan bola adalah " + luas + " cm2");
    }

}
