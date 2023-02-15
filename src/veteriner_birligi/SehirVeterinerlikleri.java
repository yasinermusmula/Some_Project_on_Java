package veteriner_birligi;

import java.util.ArrayList;

public class SehirVeterinerlikleri {

    private String sehir;
    private int toplamVeterinerSayisi;
    private ArrayList<Veteriner> sehirdekiVeterinerler;

    public SehirVeterinerlikleri(String sehir) {
        this.sehir = sehir;
        sehirdekiVeterinerler = new ArrayList<>();
        toplamVeterinerSayisi = 0;
    }

    public void sehireVeterinerEkle (Veteriner veteriner){
        toplamVeterinerSayisi++;
        sehirdekiVeterinerler.add(veteriner);
    }
    public void sehirdekiToplamVeterinerSayisiniBul(){
        System.out.println("Toplam veteriner:" + toplamVeterinerSayisi);
    }
}

