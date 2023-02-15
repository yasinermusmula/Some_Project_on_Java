package veteriner_birligi;

public class Kopek extends Hayvan{
    private String tur;
    private String cinsi;
    private int asiSayisi;

    public Kopek(String dogumTarihi, boolean kayitli,String cinsi,int asiSayisi) {
        super(dogumTarihi, kayitli);
        this.tur = "Kopek";
        this.cinsi = cinsi;
        this.asiSayisi = asiSayisi;
    }

    @Override
    void bilgileriGoster() {
        System.out.println(toString() + " " + super.toString());
    }

    @Override
    public String toString() {
        return "Kopek{" +
                "tur='" + tur + '\'' +
                ", cinsi='" + cinsi + '\'' +
                ", asiSayisi=" + asiSayisi +
                '}';
    }
}
