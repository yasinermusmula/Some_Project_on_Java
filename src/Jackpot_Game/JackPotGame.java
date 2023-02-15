package Jackpot_Game;

public class JackPotGame {
    public static void main(String[] args) {
        System.out.println(kelimeyiHarfTekrarsizYaz("alpaslan"));
    }

    public static String kelimeyiHarfTekrarsizYaz(String kelime) {
        String yeniKelime = "";
        for (int i = 0; i < kelime.length(); i++) {
            char x = kelime.charAt(i);
            if (yeniKelime.indexOf(x) < 0) {
                yeniKelime += kelime.charAt(i);
            }
        }
        return yeniKelime;
    }
}
