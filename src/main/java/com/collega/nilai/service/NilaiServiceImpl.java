package com.collega.nilai.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.collega.nilai.model.NilaiModel;

@Service
public class NilaiServiceImpl implements NilaiService {
    
    private List<NilaiModel> listNilai;

    public NilaiServiceImpl(){
        listNilai = new ArrayList<>();
    }

    @Override
    public List<NilaiModel> getNilaiList(){
        return listNilai;
    }

    @Override
    public void addNilai(NilaiModel nilai){
        listNilai.add(nilai);
    }

    @Override
    public NilaiModel getNilaiByNim(String nim){
        for (NilaiModel temp: listNilai){
            if(temp.getNim().equals(nim)){
                return temp;
            }
        }
        return null;
    }

    @Override
    public void updateNilai(NilaiModel nilai){
        NilaiModel targetNilai = getNilaiByNim(nilai.getNim());
        targetNilai.setNilai(nilai.getNilai());
    }

    @Override
    public boolean deleteNilaiByNim(String nim){
        return listNilai.remove(getNilaiByNim(nim));
    }


}
