package com.collega.nilai.service;

import java.util.List;

import com.collega.nilai.model.NilaiModel;

public interface NilaiService {
    void addNilai(NilaiModel nilai);

    List<NilaiModel> getNilaiList();

    NilaiModel getNilaiByNim(String nim);

    void updateNilai(NilaiModel nilai);

    boolean deleteNilaiByNim(String nim);
}
