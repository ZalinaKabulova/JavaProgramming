package replitTasks;

import java.util.Scanner;

public class Saniye {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a secs");

        int kullanicisaniye = scanner.nextInt();


        int saat = kullanicisaniye / 3600; //burda saati bulmak icin 3600(yani bir saatteki saniye sayisina) boluyoruz// ornek 9000 / 3600

        int dakika = (kullanicisaniye % 3600) / 60; //9000 i 3600 e boldugumuzde saati, saati ise 60 a bolup kalani aldigimizda dakikayi buluruz

        int saniye = (kullanicisaniye % 3600) % 60; //kullanici saniyeyi 3600 e boldugumuzde kalan sayi bize dakikayi gosterir, kalan dakikada kac saniye var
        //oldugunu gormek icin ise 60 a bolup kalan sayiya bakmak gerekir//

        int remainder = (kullanicisaniye % 3600);
        System.out.println(remainder);
        System.out.println(saat+"saat"+dakika+"dakika"+saniye+"saniye");
    }

}
