package Studikasus2_tiket;

import java.util.Scanner;

public class Studikaus2_tiket {
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
  
  //Masukan tipe Data
  String Tiket,Tujuan;
  int Jumlah_Tiket, Harga_Satuan, Total_Harga, Total_Bayar = 0;
  
        System.out.println("DAFTAR HARGA TIKET");
        System.out.println("Malang-Probolinggo = " + 45000);
        System.out.println("Malang-Sidoarjo = " + 40000);
        System.out.println("Malang-Surabaya = " + 35000);
  
  //Input
  System.out.println("\nPEMBELIAN ");
  System.out.print("Tiket  : ");
  Tujuan = scan.nextLine();
  System.out.print("Jumlah Tiket  : ");
  Jumlah_Tiket = scan.nextInt();
  System.out.print("Harga Satuan  : ");
  Harga_Satuan = scan.nextInt();
  
  //proses
  Total_Harga = Harga_Satuan * Jumlah_Tiket;
  
  //output
  System.out.print("Total Bayar  : "+Total_Harga);
    }
 }
   

