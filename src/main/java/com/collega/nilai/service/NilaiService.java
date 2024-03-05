package com.collega.nilai.service;

import java.util.List;

import com.collega.nilai.model.NilaiModel;

public interface NilaiService {
    void addNilai(NilaiModel nilai);

    List<NilaiModel> getNilaiList();

    NilaiModel getNilaiById(Long id);

    NilaiModel updateNilai(NilaiModel nilai);

    NilaiModel deleteNilai(Long id);
}
