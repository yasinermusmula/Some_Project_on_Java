package HastaneUygulamasi;

public class Kontrol {
    public void nesneleriOlustur() {
        GenelCerrah dc = new GenelCerrah("Mahmut","Istanbul",43,"Ege");
        GenelCerrah dc2 = new GenelCerrah("Ahmet","Izmir",68,"Dokuz Eylul");
        GenelCerrah dc3 = new GenelCerrah("Ayse","Ankara",97,"Akdeniz");
        GenelCerrah dc4 = new GenelCerrah("Zeynep","Mardin",53,"İyte");

        Hastalar h1 = new Hastalar("Muko","Kars",54,"Bagirsak problemi");
        Hastalar h2 = new Hastalar("Eko","Adana",24,"Mide yanmasi");
        Hastalar h3 = new Hastalar("Zico","Antep",45,"Kafa problemi");
        dc.hastaEkle(h1);
        dc.hastaEkle(h2);
        dc2.hastaEkle(h3);
        dc.generalInfo();


    }
}
