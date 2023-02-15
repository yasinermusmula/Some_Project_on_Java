package veteriner_birligi;

import java.util.ArrayList;

public class Veteriner extends Kisi{

    private String mezunOlduguOkul;
    private int calismaSuresi;
    private ArrayList<Musteri> veterinerMusterileri;
    private int musteriSayisi;

    public Veteriner(String isim, String tcKimlik, String mezunOlduguOkul, int calismaSuresi) {
        super(isim, tcKimlik);
        this.mezunOlduguOkul = mezunOlduguOkul;
        this.calismaSuresi = calismaSuresi;
        veterinerMusterileri = new ArrayList<>();
        musteriSayisi = 0; // Musteri sayisini tutma ihtiyaci olabilir. Bu yuzden ilk olusturulma aninda 0'a atamış olduk.
    }
    public void musteriEkle(Musteri musteri){ // Polymorphsm ile butun ozellikleri kullanabildik.
        veterinerMusterileri.add(musteri);
        musteriSayisi++;
        System.out.println(musteri + " " + getIsim() + " veterinerine eklendi.");
    }
    public void musterileriListele(){
        for (Musteri m : veterinerMusterileri){
            m.kendiniTanit();
        }
    }

    @Override
    void kendiniTanit() {
        System.out.println(this.toString() + " ben bir veterinerim.");
    }

    @Override
    public String toString() {
        return super.toString() + "Veteriner{" +
                "mezunOlduguOkul='" + mezunOlduguOkul + '\'' +
                ", calismaSuresi=" + calismaSuresi +
                '}';
    }
}
