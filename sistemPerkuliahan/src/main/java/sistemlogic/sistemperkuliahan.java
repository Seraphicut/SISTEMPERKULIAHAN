/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemlogic;

/**
 *
 * @author A-27
 */
public class sistemperkuliahan {
    private Perkuliahan[] dataPerkuliahans;
    private Dosen[] dataDosens;
    private Mahasiswa[] dataMahasiswas;
    private Staff[] dataStaffs;

    public sistemperkuliahan() {
    }

    public sistemperkuliahan(int maxPerkuliahan[] dataPerkuliahans, int maxDosen[] dataDosens, Mahasiswa[] dataMahasiswas, Staff[] dataStaffs) {
        this.dataPerkuliahans = dataPerkuliahans;
        this.dataDosens = dataDosens;
        this.dataMahasiswas = dataMahasiswas;
        this.dataStaffs = dataStaffs;
    }
   
    
    
}
