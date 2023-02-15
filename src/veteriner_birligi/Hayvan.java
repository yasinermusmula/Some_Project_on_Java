package veteriner_birligi;

abstract public class Hayvan {
    //Hayvan sinifindan nesne olusturmayip, sadece referans verileri kullanmak istedigimiz icin abstract sinif tanimladik.

    private String dogumTarihi;
    private boolean kayitli;

    // Nesne uretmesek bile constructor yaptik cunku alt siniflarimiz bu constructor'i kullanacak
    public Hayvan(String dogumTarihi, boolean kayitli) {
        this.dogumTarihi = dogumTarihi;
        this.kayitli = kayitli;
    }

    public String getDogumTarihi()   {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public boolean isKayitli() {
        return kayitli;
    }

    public void setKayitli(boolean kayitli) {
        this.kayitli = kayitli;
    }

    abstract void bilgileriGoster();

    @Override
    public String toString() {
        return "Hayvan{" +
                "dogumTarihi='" + dogumTarihi + '\'' +
                ", kayitli=" + kayitli +
                '}';
    }
}

