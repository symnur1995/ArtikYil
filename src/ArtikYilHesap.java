import java.util.Scanner;

public class ArtikYilHesap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen artik yil hesaplamasini yapmak istediginiz bir yil giriniz.");
        int sayi = scan.nextInt();
        if(sayi%4 == 0 && sayi%100 != 0){
            System.out.println(sayi + " bir artik yildir !");
        }
        if(sayi%400 == 0){
            System.out.println(sayi + " bir artik yildir!");
        }
        else if(sayi%100 == 0 && sayi%400 != 0){
            System.out.println(sayi + " bir artik yil degildir !");
        }
        else if(sayi%4 != 0){
            System.out.println(sayi + " bir artik yil degildir !");
        }
    }
}
