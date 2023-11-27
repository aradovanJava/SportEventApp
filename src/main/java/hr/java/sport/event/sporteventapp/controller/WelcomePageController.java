package hr.java.sport.event.sporteventapp.controller;

import hr.java.sport.event.sporteventapp.domain.Championship;
import hr.java.sport.event.sporteventapp.domain.Club;
import hr.java.sport.event.sporteventapp.service.ChampionshipService;
import hr.java.sport.event.sporteventapp.service.ClubService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/welcome")
@AllArgsConstructor
public class WelcomePageController {

    private ChampionshipService championshipService;
    private ClubService clubService;

    @GetMapping
    public String showWelcomePage(Model model) {
        List<Championship> championshipList = championshipService.getChampionships();
        model.addAttribute("championshipList", championshipList);
        return "welcome";
    }

    @GetMapping("/editClub.html")
    public String editClub(@RequestParam Integer id, Model model) {
        List<Championship> championshipList =
                championshipService.getChampionships();

        Club clubForEdit = clubService.findById(id).get();

        model.addAttribute("championshipList", championshipList);
        model.addAttribute("club", clubForEdit);

        return "editClub";
    }


    @PostMapping("/editClub.html")
    public String editClub(@ModelAttribute Club club, Model model) {
        clubService.update(club);
        return "redirect:/welcome";
    }

    @PostMapping("/addNewClub.html")
    public String addNewClub(@ModelAttribute Club club, Model model) {
        clubService.save(club);
        return "redirect:/welcome";
    }


}
