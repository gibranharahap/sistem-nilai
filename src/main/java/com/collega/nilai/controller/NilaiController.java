package com.collega.nilai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.collega.nilai.model.NilaiModel;
import com.collega.nilai.service.NilaiService;


@Controller
public class NilaiController {

    @Autowired
    private NilaiService nilaiService;

    // @RequestMapping("/")
    // public String home(){

    //     return "nilai";
    // }

    @RequestMapping("/nilai")
    public String listNilai(Model model){
        List<NilaiModel> listNilai = nilaiService.getNilaiList();

        NilaiModel nilai = new NilaiModel(null, null, null);
        
        model.addAttribute("nilai", nilai);
        model.addAttribute("listNilai", listNilai);

        return "nilai";
    }

    @RequestMapping(value = "/nilai_add", method = RequestMethod.POST)
    public String addNilai(@ModelAttribute NilaiModel nilai) {
        nilaiService.addNilai(nilai);
        return "redirect:/nilai";
    }

    @RequestMapping(value="/nilai_edit/{nim}", method = RequestMethod.POST)
    public String editNilai(@PathVariable String nim, @ModelAttribute NilaiModel nilai) {
        nilaiService.updateNilai(nilai);
        return "redirect:/nilai";
    }
    
    @GetMapping("/nilai/{nim}")
    public String deleteNilai(@PathVariable String nim) {
        nilaiService.deleteNilaiByNim(nim);
        return "redirect:/nilai";
    }
    
    
}
