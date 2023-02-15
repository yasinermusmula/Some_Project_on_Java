package veteriner_birligi;

import java.util.ArrayList;

public class Musteri extends Kisi{
    private String adres;
    private ArrayList<Hayvan> musteriHayvanlari;

    public Musteri(String isim, String tcKimlik, String adres) {
        super(isim, tcKimlik);
        this.adres = adres;
        musteriHayvanlari = new ArrayList<>(); // Bunu yazmadan bir arrayliste veri atamamiz dogru degildir. Ve mumkunde degildir
    }
    public void musteriyeHayvanEkle(Hayvan hayvan){ // Hem kedi ve hem kopek ekleyebilmek icin Hayvan sinifini polymorphsm ile kullaniriz
        musteriHayvanlari.add(hayvan);
        System.out.println(hayvan + " " + getIsim() + " musterisine eklendi.");
    }

    public void musteriHayvanlariniListele(){ // Tanimladigimiz Arraylisti kullanmak için bir metot olusturduk.
        for (Hayvan h : musteriHayvanlari){
            System.out.println(h);
        }
    }

    @Override
    void kendiniTanit() {
        System.out.println(this.toString() + " Ben bir musteriyim");
    }

    @Override
    public String toString() {
        return super.toString() + "Musteri{" +
                "adres='" + adres + '\'' +
                '}';
    }
}
