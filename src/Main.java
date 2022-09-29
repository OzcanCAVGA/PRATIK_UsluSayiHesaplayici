/*
Ödev
Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner yazici = new Scanner(System.in);
        System.out.println("Taban degerini giriniz: ");
        int taban,us,deger=1;
        taban=yazici.nextInt();

        System.out.println("Us degerini giriniz: ");
        us=yazici.nextInt();

        for (int i=1;i<=us;i++){
            deger=deger*taban;
        }
        System.out.println(deger);

    }
}
