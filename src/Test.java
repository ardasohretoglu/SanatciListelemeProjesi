
import java.util.Scanner;


public class Test {
    
    private static Sanatcilar sanatcilar = new Sanatcilar();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void islemleriBastir(){
        System.out.println("\t 0-İslemleri Görüntüle");
        System.out.println("\t 1-Sanatçıları Görüntüle");
        System.out.println("\t 2-Sanatçı Ekle");
        System.out.println("\t 3-Sanatçı Güncelle");
        System.out.println("\t 4-Sanatçı Sil");
        System.out.println("\t 5-Sanatçı Ara");
        System.out.println("\t 6-Uygulamadan Çık");
    }
    
    public static void sanatcilariGoruntule(){
        sanatcilar.sanatcilariBastir();
    }
    
    public static void sanatciEkle(){
        
        System.out.println("Eklemek İstediğiniz Sanatçının adını giriniz ");
        
        String isim = scanner.nextLine();
        
        sanatcilar.sanatciEkle(isim);
    }
    public static void sanatciGuncelle(){
        
        System.out.println("Güncel Sanatçının İsmini Giriniz : ");
        
        String yeniSarkici = scanner.nextLine();
        
        System.out.println("Güncel Sanatçının İndexi : ");
        
        int pozisyon = scanner.nextInt();
        
        scanner.nextLine();
        
        sanatcilar.sanatciGuncelle(yeniSarkici, pozisyon-1);
    }
    
    public static void sil(){
        System.out.println("Silmek İstediğiniz Sanatçının İndexi : ");
        
        int pozisyon = scanner.nextInt();
        
        
        sanatcilar.sanatciSil(pozisyon-1);
    }
    
    public static void ara(){
        System.out.println("Aramak İstediğiniz Sanatçının Adı Nedir : ");
        
        String isim = scanner.nextLine();
        
        sanatcilar.sanatciAra(isim);
    }
    
    public static void main(String[] args) {
        System.out.println("\t Sanatçılar Uygulamasına Hoş Geldiniz ");
        
        islemleriBastir();
        
        boolean cikis = false;
        
        int islem;
        
        while (!cikis) {            
            
            System.out.print("Bir İşlem Seçiniz : ");
            islem = scanner.nextInt();
            
            scanner.nextLine();
            
            switch(islem){
                case 0:
                islemleriBastir();
                break;
                case 1:
                    sanatcilariGoruntule();
                break;
                case 2:
                    sanatciEkle();
                break;
                case 3:
                    sanatciGuncelle();
                break;
                case 4:
                    sil();
                break;
                case 5:
                    ara();
                break;
                case 6:
                    cikis = true;
                    System.out.println("Uygulamadan Çıkılıyor...");
                break;
                    
            }
            
        }
        
    }
}
