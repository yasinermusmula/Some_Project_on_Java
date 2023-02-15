package veteriner_birligi;

public class Kedi extends Hayvan{
    private String tur;
    private String cinsi;

    public Kedi(String dogumTarihi, boolean kayitli, String cinsi) {
        super(dogumTarihi, kayitli);
        this.tur="Kedi";
        this.cinsi=cinsi;
    }
    // Abstract sinifta olusturdugumuz metotu kullanip,icine istedigimiz seyleri yazdirk
    @Override
    void bilgileriGoster() {
        System.out.println(toString() + " kayitli mi :" + isKayitli()+ " dogum tarihi:" + getDogumTarihi());
    }

    @Override
    public String toString() {
        return "Kedi{" +
                "tur='" + tur + '\'' +
                ", cinsi='" + cinsi + '\'' +
                '}';
    }
}
