/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author Yusuf Isra
 */
public class sekolahku extends Main{
    
    public void judul() {
        System.out.println("--- ISI DATA TENTANG SEKOLAH ANDA ---");
    }

    public void Siswa(String negara) {
        System.out.println("PENGISIAN TAHAP 1");
        System.out.println("><><><><><><><><><><><><><><><><><><");
        System.out.println("Negara : " + negara);
    }

    public void Siswa(String negara, String yayasan) {
        System.out.println("\nPENGISIAN TAHAP 2");
        System.out.println("><><><><><><><><><><><><><><><><><><");
        System.out.println("Negara : "+negara);
        System.out.println("Yayasan : "+yayasan);
    }

    public void Siswa(String negara, String yayasan, String sekolah) {
        System.out.println("\nPENGISIAN TAHAP 3");
        System.out.println("><><><><><><><><><><><><><><><><><><");
        System.out.println("Negara : "+negara);
        System.out.println("Yayasan : "+yayasan);
        System.out.println("Nama Sekolah : "+sekolah);
    }
}
