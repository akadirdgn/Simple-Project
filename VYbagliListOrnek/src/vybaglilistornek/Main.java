package vybaglilistornek;

import java.util.Random;
import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BagliListeYapisi b = new BagliListeYapisi();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int data;

        String islemler = "Bagli listeye eleman ekleme icin 1'e\n"
                + "Bagli listeyi siralamak icin 2'e basiniz\n"
                + "Bagli listeyi yazdirmak icin 3'ye\n"
                + "Cikmak icin 0'a basiniz";

        System.out.println(islemler);

        do {

            System.out.print("Islem giriniz:");
            int islem = scanner.nextInt();

            switch (islem) {
                case 1:
                    data = random.nextInt(101);
                    b.ekle(data);
                    System.out.println("Bagli listeye eleman eklendi...");
                    break;

                case 2:
                    b.sırala();
                    break;

                case 3:
                    b.yazdir();
                    break;

                case 0:
                    System.out.println("Isleminiz sonlanmistir.");
                    System.exit(0);
                default:
                    System.out.println("Hatalı giriş!");
                    System.exit(0);

            }

        } while (true);

    }

}
