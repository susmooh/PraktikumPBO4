/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum4;

/**
 *
 * @author ACER
 */
public class Praktikum_PBO4 {
    public static void main(String[] args) {
        // Create an instance of Mobil
        Pekerja worker = new Pekerja("Yanto", 35, "Dokar", 2000000);
        
        // Call the method to display mobil information
        System.out.println(worker.toString());
        
        worker.setNama("Joni");
        System.out.println("Nama Diupdate: "+worker.toString());
    }
}

