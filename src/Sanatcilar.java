
import java.util.ArrayList;


public class Sanatcilar {
    
    private ArrayList<String> sanatciListesi = new ArrayList<String>();
    
    public void sanatcilariBastir(){
        System.out.println("Sanatçı Listesinde "+ sanatciListesi.size() + " Sanatçı vardır" );
        
        for ( int i = 0 ; i< sanatciListesi.size() ; i++ ){
            System.out.println((i+1)+". Sanatçı : "+ sanatciListesi.get(i));
        }
    }
    
    public void sanatciEkle(String isim){
        sanatciListesi.add(isim);
        System.out.println("Sanatçı Listesi Güncellendi ");
    }
    public void sanatciGuncelle(String yeniSarkici,int pozisyon){
        sanatciListesi.set(pozisyon, yeniSarkici);
        
        System.out.println("Şarkıcı Listesi Güncellendi ");
    }
    public void sanatciSil(int pozisyon){
        String isim = sanatciListesi.get(pozisyon);
        
        sanatciListesi.remove(pozisyon);
        
        System.out.println(isim+" İsimli Sanatçı Listeden Kaldırıldı");
        
    }
    public void sanatciAra ( String sanatciİsmi ){
        
        int pozisyon = sanatciListesi.indexOf(sanatciİsmi);
        
        if (pozisyon >= 0){
            System.out.println("Şarkıcı Bulundu");
            System.out.println(sanatciİsmi+" isimli sarkici "+(pozisyon+1)+". Pozisyonda");
        }else{
            System.out.println("Şarkıcı Bulunamadı...");
        }
        
    }
}
