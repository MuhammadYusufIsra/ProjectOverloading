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
public class Main {

    public static void main(String args[]) {
        sekolahku data = new sekolahku();
        data.judul();
        data.Siswa("Indonesian");
        data.Siswa("Indonesian", "Yayasan Pendidikan Telkom");
        data.Siswa("Indonesian", "Yayasan Pendidikan Telkom", "SMK Telkom Malang");
    }
}

