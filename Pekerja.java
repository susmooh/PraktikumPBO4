/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum4;

/**
 *
 * @author ACER
 */
public class Pekerja extends Manusia {
    private int gaji;
    
    public Pekerja(String nama, int usia, String pekerjaan, int gaji) {
        super(nama, usia, pekerjaan);
        this.gaji = gaji;
    }
    //setter dan getter gaji
    public int getGaji(){
        return gaji;
    }
    
    public void setGaji(int gaji){
        this.gaji = gaji;
    }
    //method menampilkan orang
    
    @Override
    public String toString() {
        return "Nama" + getNama()+ "\n"+
               "Usia: "+getUsia()+ "\n"+
               "Pekerjaan: "+getPekerjaan()+ "\n"+
               "Gaji: "+gaji;
    }
}
