/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progtunjangan;

import java.util.Scanner;

/**
 *
 * @author 'KoalaX'
 * NAMA     : Fiqri Akbar Pratama
 * KELAS    : PBO1/IF1
 * NIM      : 10118020
 * Deksripsi Program : Program ini berisi program untuk nemapilkan tunjangan
 * gaji pegawai dengan ketentuan yang sudah menikah atau belum
 */
public class ProgTunjangan {

    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner (System.in);
    
    double pokok;
    double tunjangan = 0,total;
    String Status1 = "Menikah";
    String Status2 = "Belum";
    
    System.out.println ("=========INPUT GAJI KARYAWAN=========");
   
    System.out.print ("Berapa gaji pokok anda perbulan.?: Rp.");
    pokok = input.nextInt();
   
    System.out.print ("Status anda.? (Menikah/Belum)\t : ");
    Scanner scanner = new Scanner(System.in);
    String status = scanner.next();
   
    System.out.println ("\n======Hasil PErhitungan Gaji=========");
    System.out.println ("Gaji Pokok\t\t\t : Rp."+pokok);
    
    if (status.equals(Status1)){
    tunjangan = pokok*35/100;
    System.out.println ("Tunjangan\t\t\t : Rp."+ tunjangan);
    } else {
    System.out.println ("Tunjangan\t\t\t : Rp."+ tunjangan);
    }      
    total = tunjangan+pokok;
    System.out.println("Total Gaji\t\t\t : Rp." + total);
               
             
    System.out.println ("(Develop by : Fiqri Akbar Pratama)");
 
}
}
