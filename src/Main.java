import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Lütfen Sayıyı giriniz :");
        int a = number.nextInt();
         System.out.println(a+isPolindrom(a));
    }
    static String isPolindrom(int sayi){
        int kalan=0,yeniSayi=0;
        int a=sayi;
        while(a!=0){
            kalan=a%10;
            yeniSayi=yeniSayi*10+kalan;
            a/=10;
        } if(sayi==yeniSayi){
            return " Sayı palindrondur";}
        else return " Sayı palindron değildir";
        }
    }

