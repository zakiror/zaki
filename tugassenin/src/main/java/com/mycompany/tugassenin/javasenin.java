/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tugassenin;

import java.util.Scanner;

/**
 *
 * @author A-13
 */
public class javasenin {
    public static void main(String[] args) {

    int nilaiA = 5;
    int nilaiB = 10;
    
    double nilaiC = 15;
    double nilaiD = 20;
    boolean isPlus = true;
    
    System.out.println("nilai A: " + nilaiA);
    System.out.println("nilai B: " + nilaiB);
    System.out.println("nilai C: " + nilaiC);
    System.out.println("nilai D: " + nilaiD);
    System.out.println("isPlus: + " + isPlus);
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("masukkan angka variabel A");
    nilaiA = input.nextInt();
    System.out.println("masukkan angka variabel B");
    nilaiB = input.nextInt();
    System.out.println("masukkan angka variabel C");
    nilaiC = input.nextDouble();
    System.out.println("masukkan angka variabel D");
    nilaiD = input.nextDouble();
    
    System.out.println("masukkan teks");
    String teks = input.nextLine();
    teks = input.nextLine();
    
    System.out.println("nilai A: " + nilaiA);
    System.out.println("nilai B: " + nilaiB);
    System.out.println("nilai C: " + nilaiC);
    System.out.println("nilai D: " + nilaiD);
    System.out.println("isPLUS: " + isPlus);
    System.out.println("teks: " + teks);
    
    
}
}