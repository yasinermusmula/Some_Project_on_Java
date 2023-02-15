package HastaneUygulamasi;

import java.util.ArrayList;

public class GenelCerrah extends Doktorlar{
    private int hastaSayisi;
    private ArrayList<Hastalar> cerrahHastalari;

    public GenelCerrah(String name, String sehir, int yas, String mezunOlduguOkul) {
        super(name, sehir, yas, mezunOlduguOkul);
        cerrahHastalari = new ArrayList<>();
        this.hastaSayisi =0;
    }

    @Override
    public void generalInfo() {
        System.out.println(toString() + " hasta sayisi: " + hastaSayisi);
    }

    public void hastaEkle(Hastalar hasta){
        cerrahHastalari.add(hasta);
        hastaSayisi++;
        System.out.println(hasta + " " +  getName() + " dokturana eklendi");
    }

    public void kacTaneHastaVar(){
        for (Hastalar h : cerrahHastalari){
        }
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
