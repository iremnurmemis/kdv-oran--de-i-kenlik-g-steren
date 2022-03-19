package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner deger = new Scanner(System.in);

        float fiyat;
        System.out.println("Lutfen almak istediginiz urunun fiyatini giriniz : ");
        fiyat = deger.nextFloat();

        int kdv_oran=(fiyat> 1000) ? 8:18; //KDV oranini buluyoruz.
        float kdv_bedeli=(fiyat*kdv_oran)/100; //KDV tutarini buluyoruz.
        float kdvli_fiyat=fiyat+kdv_bedeli;     //Toplam bedeli buluyoruz.

        System.out.println("Urununuzun KDV oranı : %" + kdv_oran +" KDV bedeli ise : " + kdv_bedeli+" TL'dir.");
        System.out.println("Urunun KDV dahil fiyati : " +kdvli_fiyat+" TL'dir.");
    }
}
