package com.collega.nilai.model;


public class NilaiModel{
    private String nim;
    private Integer mataKuliah;
    private Integer nilai;


    public NilaiModel(String nim, Integer mataKuliah, Integer nilai){
        this.nim = nim;
        this.mataKuliah = mataKuliah;
        this.nilai = nilai;

    }

    public String getNim() {
        return this.nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public Integer getMataKuliah() {
        return this.mataKuliah;
    }

    public void setMataKuliah(Integer mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public Integer getNilai() {
        return this.nilai;
    }

    public void setNilai(Integer nilai) {
        this.nilai = nilai;
    }




}
