import java.util.Scanner;

public class UsHesap {
    static int hesapla(int tb, int us) {
        if(us<1){
            return 1;
        }
        return tb*hesapla(tb,us-1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Taban degeri giriniz:");
        int tb = sc.nextInt();
        System.out.print("Us degeri giriniz:");
        int us = sc.nextInt();
        int res = hesapla(tb,us);
        System.out.println("Sonuç: "+res);
    }
}
