package com.pertemuan6;

class Anggota{
    String nik,nama,alamat;
    int saldo,pinjam;
    double pajak;

    //method tanpa return dengan parameter
   public Anggota(String nik , String nama, String alamat){
        this.nik=nik;
        this.nama=nama;
        this.alamat=alamat;
    }
    Anggota(int saldo, int pinjam, Double pajak){
        this.saldo=saldo;
        this.pinjam=pinjam;
        this.pajak=pajak;
    }
    // method dengan return dan tanpa parameter
    double total () {
        //perhitungan
        return (saldo+(pinjam-(pinjam*pajak)));
    }
    //method tanpa parameter tanpa return
    void tampil (){
        System.out.println("NIK Anggota : "+ this.nik);
        System.out.println("Nama Anggota : "+ this.nama);
        System.out.println("Alamat Anggotas : "+ this.alamat);
        System.out.println();
    }
    void tampil2(){
        System.out.println("Sisa Saldo Anda : Rp."+ this.saldo);
        System.out.println("Jumlah yang ingin di pinjam : Rp."+ this.pinjam);
        System.out.println("Bunga Pinjaman : 10%");
        System.out.println();
        System.out.println("Total Saldo Sekarang : Rp."+ this.total());

    }
}
public class Main {
public static void main(String[] args) {
       Anggota anggota = new Anggota ("31742"," Muhamad Rafik","Kalibata");
       Anggota anggota2 = new Anggota (50000,30000,0.10);
        anggota.tampil();
        anggota2.tampil2();
}
}