package com.mresitcagan.web.controller;

import com.mresitcagan.web.dto.ClubDto;
import com.mresitcagan.web.service.impl.ClubServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ClubController {

    private ClubServiceImpl clubService;

    public ClubController(ClubServiceImpl clubService) {
        this.clubService = clubService;
    }

    @GetMapping(path = "/clubs")
    public String listClubs(Model model){
        List<ClubDto> clubs = clubService.findAllClubs();
        model.addAttribute("clubs", clubs);
        return "clubs-list";
    }

}
