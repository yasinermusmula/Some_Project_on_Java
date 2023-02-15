package Algorithm;

import java.util.Scanner;

public class minMax {
    public static void main(String[] args) {
        int list[] = {4,7,5,1,28,23,4,6,12,56,2,80,90,12,4,5};

        int max = 0;
        int min = list[0];
        for (int i = 0; i< list.length; i++){
            if (list[i] > max){
                max=list[i];
            }
            if (list[i] < min){
                min=list[i];
            }
        }
        System.out.println("En buyuk: " +max);
        System.out.println("En kucuk: " + min);
        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.println("Bir kelime giriniz: ");
        String kelime = input.next();
        String yeniKelime = "";
        for (int i = (kelime.length()-1); i>=0; i--){
            yeniKelime += kelime.charAt(i);
        }
        if (yeniKelime.equals(kelime)){
            System.out.println(kelime + " palindorimik kelimedir.");
        }else {
            System.out.println(kelime + " polindiromik kelime degildir.");
        }

        System.out.println();
        System.out.println("Bir kelime giriniz");
        String k1 = input.next();
        String yk = "";
        for (int i = (k1.length()-1); i>=0; i--){
            yk += k1.charAt(i);
        }
        System.out.println(k1 + " kelimesinin tersi: " + yk);
    }
}
