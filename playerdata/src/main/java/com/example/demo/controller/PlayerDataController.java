package com.example.demo.controller;

import com.example.demo.domain.PlayerData;
import com.example.demo.repository.PlayerDataRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PlayerDataController {

    private PlayerDataRepository playerDataRepository;

    public PlayerDataController(PlayerDataRepository playerDataRepository) {
        this.playerDataRepository = playerDataRepository;
    }

    @GetMapping("/")
    public String index(Model model){

        List<PlayerData> allList = playerDataRepository.findAll();
        model.addAttribute("allList",allList);
        return "index";
    }


}
