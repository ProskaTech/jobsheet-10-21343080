/*
*Created by 21343080_Andi Sultan Al Ayyubi
*/

public class MobilUtama {
    public static void main(String[] args){
        Mobil Honda = new Mobil();
        Honda.merk = "Civic";
        Honda.warna = "Hitam";
        Honda.tahunproduksi = 2020;
        System.out.println("Merk\t: " + Honda.merk);
        System.out.println("Warna\t: " + Honda.warna);
        System.out.println("Tahun\t: " + Honda.tahunproduksi);
        Honda.Maju();
        Honda.Maju();
        Honda.Mundur();

    }
}
