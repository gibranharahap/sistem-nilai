package com.collega.nilai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collega.nilai.model.NilaiModel;
import com.collega.nilai.repository.NilaiDb;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class NilaiServiceImpl implements NilaiService {

    @Autowired
    NilaiDb nilaiDb;

    @Override
    public List<NilaiModel> getNilaiList() {
        return nilaiDb.findAll();
    }

    @Override
    public void addNilai(NilaiModel nilai) {
        nilaiDb.save(nilai);
    }

    @Override
    public NilaiModel getNilaiById(Long id) {
        return nilaiDb.findById(id).get();
    }

    @Override
    public NilaiModel updateNilai(NilaiModel nilai) {
        NilaiModel targetNilai = getNilaiById(nilai.getId());
        try {
            targetNilai.setMataKuliah(nilai.getMataKuliah());
            targetNilai.setNilai(nilai.getNilai());
            nilaiDb.save(targetNilai);
            return targetNilai;
        } catch (NullPointerException nullException) {
            return null;
        }
    }

    @Override
    public NilaiModel deleteNilai(Long id) {
        NilaiModel targetNilai = getNilaiById(id);
        nilaiDb.delete(targetNilai);
        return targetNilai;
    }

}
