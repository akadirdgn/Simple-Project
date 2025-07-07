package veriyapilarodev7;

import java.util.Scanner;

public class Main {
    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Uygulama uyg = new Uygulama();
        
        int data,islem=1;
        
        String islemler = "Agaca eleman eklemek icin 1'e"
                + "\neleman silmek icin 2'ye"
                + "\narama islemi icin 3'e"
                + "\nyazdirma islemi icin 4'e "
                + "\nmatris olarak yazdirmak icin 5'e"
                + "\ncikmak icin 0'a basiniz.";
        
        System.out.println(islemler);
        
        while (islem != 0) {
            System.out.println("*******************---------------*******************");
            System.out.print("Islemi giriniz: ");
            islem = scanner.nextInt();
            
            switch (islem) {
                case 1:
                    System.out.print("Eklemek istediginiz elemani giriniz: ");
                    data = scanner.nextInt();
                    uyg.root = uyg.add(uyg.root, data);
                    System.out.println("Eleman eklendi.");
                    break;

                case 2:
                    System.out.print("Silmek istediginiz elemani giriniz: ");
                    data = scanner.nextInt();
                    uyg.root = uyg.delete(uyg.root, data);
                    System.out.println(data + " elemani silindi.");
                    break;

                case 3:
                    System.out.print("Aramak istediginiz degeri giriniz: ");
                    data = scanner.nextInt();
                    uyg.search(data);
                    break;

                case 4:
                    uyg.yazdir();
                    break;
                    
                case 5:
                    int[][] transitionMatrix = uyg.gecisMatrix();
                    printMatrix(transitionMatrix);
                    break;
                    
                default:
                    System.out.println("Islem sonlanmistir...");
                    System.exit(0);
            }
        }

    }
    
}
