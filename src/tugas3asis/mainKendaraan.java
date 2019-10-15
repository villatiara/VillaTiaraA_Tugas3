/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3asis;

/**
 *
 * @author sunarto
 */
import java.util.Scanner;
public class mainKendaraan {
public static void main(String[]args){
Scanner masuk = new Scanner(System.in);

    System.out.println("Masukkan Nama Kendaraan\t\t\t : ");
    String nama = masuk.nextLine();

    System.out.println("Masukkan Tipe Kendaraan\t\t\t : ");
    String tipe = masuk.next();
    
    System.out.println("Masukkan Kapasitas Kendaraan\t\t : ");
    int kapasitas = masuk.nextInt();
    
    System.out.println("Masukkan Bahan Bakar Kendaraan\t\t : ");
    float bahanBakar = masuk.nextFloat();
    double a = 13.42134;
    
    System.out.println("Masukkan ID Kendaraan\t\t\t : ");
    int id = masuk.nextInt();
    
    System.out.println("Masukkan Jarak Tempuh Awal Kendaraan\t : ");
    float awal = masuk.nextFloat();
    
    System.out.println("Masukkan Jarak Tempuh Kendaraan\t\t : ");
    float akhir = masuk.nextFloat();
    System.out.println();

    System.out.println("=============================================");
    System.out.println();
    kendaraan test;
    
    if (nama.length()>5){
        test = new sepedaMotor();
    }
    else{
        test = new mobil();
    }
    
    test.setNamaKendaraan(nama);
    test.setTipeKendaraan(tipe);
    test.setKapasitasMesin(kapasitas);
    test.setBahanBakar(bahanBakar);
    test.setIdKendaraan(id);
    test.setJarakTempuhAwal(awal);
   test.setJarakTempuh(akhir);
    test.infoKendaraan();
}
}    
