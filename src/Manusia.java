/*
*Created by 21343080_Andi Sultan Al Ayyubi
*/

import java.util.Scanner;

public class Manusia {
    String nama, tempat_lahir, tanggal_lahir;
    String berat_badan;
    String tinggi_badan;

    public void inputdata() {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan nama lengkap\t: ");
        
        nama = input.nextLine();
        System.out.println("Masukkan tempaat lahir\t: ");
        tempat_lahir = input.nextLine();
        System.out.println("Masukkan tanggal lahir\t: ");
        tanggal_lahir = input.nextLine();
        System.out.println("Masukkan Berat Badan\t: ");
        berat_badan = input.nextLine();
        System.out.println("Masukkan Tinggi Badan\t: ");
        tinggi_badan = input.nextLine();
    }

    public void indentitas(){
        System.out.println("Nama saya \t: " +nama);
        System.out.println("Tempat lahir \t: " +tempat_lahir);
        System.out.println("Tanggal lahir \t: " +tanggal_lahir);
        System.out.println("Berat Badan \t: " + berat_badan + " kg");
        System.out.println("Tinggi Badan \t: " + tinggi_badan + " cm");
    }

    public static void main(String[] args) {
        Manusia A = new Manusia();
        A.inputdata();
        A.indentitas();
    }
}
