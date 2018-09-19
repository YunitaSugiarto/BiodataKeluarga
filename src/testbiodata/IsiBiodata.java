
package testbiodata;

import java.util.Scanner;

public class IsiBiodata {

    public static void main(String args[]) {
        TugasBiodata biodata = new TugasBiodata();
        Scanner masukan = new Scanner(System.in);

        System.out.println("-----BIODATA KELUARGA-----");
        System.out.println();

        System.out.print("Nama Ayah : ");
        String namaAyah = masukan.next();
        biodata.setNamaA(namaAyah);

        System.out.print("Nama Ibu : ");
        String namaIbu = masukan.next();
        biodata.setNamaI(namaIbu);

        System.out.print("Nama Adik : ");
        String namaAdik = masukan.next();
        biodata.setNamaS(namaAdik);

        System.out.print("Nama Saya : ");
        String namaSaya = masukan.next();
        biodata.setNamaKu(namaSaya);

        System.out.print("Alamat : ");
        String Alamat = masukan.next();
        biodata.setAlamat(Alamat);

        System.out.print("Tempat Lahir : ");
        String TempatLahir = masukan.next();
        biodata.setTmpLhr(TempatLahir);

        System.out.print("Tanggal Lahir : ");
        int TanggalLahir = masukan.nextInt();
        biodata.setTgLahir(TanggalLahir);

        System.out.print("Hobi : ");
        String Hobi = masukan.next();
        biodata.setHobi(Hobi);

        System.out.print("Cita-cita : ");
        String Cita = masukan.next();
        biodata.setCita(Cita);

        System.out.print("No Telpon : ");
        String NoTelpon = masukan.next();
        biodata.setNoTelp(NoTelpon);
    }
}
