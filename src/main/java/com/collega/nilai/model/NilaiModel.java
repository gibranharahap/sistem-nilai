package com.collega.nilai.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "nilai")
public class NilaiModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @NotNull
    @Column(name = "nim", nullable = false)
    private String nim;

    public String getNim() {
        return this.nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    @NotNull
    @Column(name = "mata_kuliah", nullable = false)
    private Integer mataKuliah;

    public Integer getMataKuliah() {
        return this.mataKuliah;
    }

    public void setMataKuliah(Integer mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    @NotNull
    @Column(name = "nilai", nullable = false)
    private Integer nilai;

    public Integer getNilai() {
        return this.nilai;
    }

    public void setNilai(Integer nilai) {
        this.nilai = nilai;
    }

}
