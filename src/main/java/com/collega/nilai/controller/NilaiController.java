package com.collega.nilai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.collega.nilai.model.NilaiModel;
import com.collega.nilai.service.NilaiService;

@Controller
public class NilaiController {

    @Autowired
    private NilaiService nilaiService;

    @GetMapping("/nilai")
    public String listNilai(Model model) {
        List<NilaiModel> listNilai = nilaiService.getNilaiList();

        NilaiModel nilai = new NilaiModel();

        model.addAttribute("nilai", nilai);
        model.addAttribute("listNilai", listNilai);

        return "nilai";
    }

    @PostMapping(value = "/add")
    public String addNilai(@ModelAttribute NilaiModel nilai) {
        nilaiService.addNilai(nilai);
        return "redirect:/nilai";
    }

    @PostMapping(value = "/edit/{id}")
    public String editNilai(@PathVariable Long id, @ModelAttribute NilaiModel nilai) {
        nilaiService.updateNilai(nilai);
        return "redirect:/nilai";
    }

    @GetMapping(value = "/delete/{id}")
    public String deleteNilai(@PathVariable Long id) {
        nilaiService.deleteNilai(id);
        return "redirect:/nilai";
    }

}
