import java.util.Scanner;
public class manavKasapProgramı {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double armutKilo, elmaKilo, domatesKilo, muzKilo, patlıcanKilo;
        double  armutFiyat = 2.14, elamaFiyat = 1, domatesFiyat = 3.67, muzFiyat = 0.95, patlicanFiyat = 5;
        double toplamFiyat;

        System.out.println("Armutun Kilosunu Girinizi : ");
        armutKilo = inp.nextDouble();

        System.out.println("Elama'nın Kilosunu Giriniz : ");
        elmaKilo = inp.nextDouble();

        System.out.println("Domatesin Kilosunu Giriniz : ");

        domatesKilo = inp.nextDouble();

        System.out.println("Muzun Kilosunu Giriniz : ");
        muzKilo = inp.nextDouble();

        System.out.println("Patlıca'nın Kilosnunu Giriniz : ");
        patlıcanKilo = inp.nextDouble();

        toplamFiyat = (armutKilo * armutFiyat) + (elmaKilo * elamaFiyat) + (domatesKilo * domatesFiyat) +
                (muzKilo * muzFiyat) + (patlıcanKilo * patlicanFiyat);

        System.out.println("Toplam Fiyat : " + toplamFiyat);
        System.out.println("Manavımızı Tercih Ettiğiniz İçin Teşekkür Ederiz");
        System.out.println("Şikayetleriniz İçin Lütfen (0326)0000000  Arayınız");
        System.out.println("Hafta içi ve Hafta sonu 08:00-22:00 saatleri arasında hizmet vermekteyiz.");






    }
}
