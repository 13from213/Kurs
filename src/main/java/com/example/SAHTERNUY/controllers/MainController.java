package com.example.SAHTERNUY.controllers;

import com.example.SAHTERNUY.models.Kursant;
import com.example.SAHTERNUY.models.Unit;
import com.example.SAHTERNUY.models.User;
import com.example.SAHTERNUY.repo.KursantRepo;
import com.example.SAHTERNUY.repo.UnitRepo;
import com.example.SAHTERNUY.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class MainController {
    @Autowired
    UnitRepo unitRepo;
    @Autowired
    UserRepo userRepo;
    @Autowired
    KursantRepo kursantRepo;
    @GetMapping("/")
    public String index() {
        return "index";
    }
    @PostMapping("/registration")
    public String registration(@RequestParam String login, @RequestParam String password, Model model) {
        if (login.isEmpty() || password.isEmpty()) {
            return "redirect:/";
        }
        User user = new User(login, password);
        userRepo.save(user);
        return "redirect:/units";
    }
    @PostMapping("/login")
    public String login(@RequestParam String login, @RequestParam String password, Model model) {
        Iterable<User> users = userRepo.findAll();
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return "redirect:/units";
            }
        }
        return "redirect:/";
    }
    @GetMapping("/units")
    public String units(Model model) {
        Iterable<Unit> units = unitRepo.findAll();
        model.addAttribute("units", units);
        return "units";
    }
    @GetMapping("/detail")
    public String detail(Model model, @RequestParam long unitId) {
        Iterable<Kursant> kursants = kursantRepo.findAll();
        ArrayList<Kursant> kursantList = new ArrayList<>();
        for (Kursant kursant : kursants) {
            if (kursant.getUnitId() == unitId) {
                kursantList.add(kursant);
            }
        }
        model.addAttribute("soldiers", kursantList);
        model.addAttribute("unitId", unitId);
        model.addAttribute("unitName", unitRepo.findById(unitId).get().getName());
        return "/detail";
    }
    @PostMapping("/create")
    public String create(@RequestParam String mil_rank, @RequestParam String name,
                         @RequestParam String lastName, @RequestParam int total_lessons,
                         @RequestParam int total_attended, @RequestParam int total_missed,
                         @RequestParam int total_late, @RequestParam long unitId, Model model) {
        Kursant kursant = new Kursant(mil_rank, name, lastName, total_lessons, total_attended, total_missed, total_late, unitId);
        kursantRepo.save(kursant);
        return "redirect:/units";
    }
    @PostMapping("/delete")
    public String delete(@RequestParam long personId, Model model) {
        Kursant kursant = kursantRepo.findById((int) personId).get();
        kursantRepo.delete(kursant);
        return "redirect:/units";
    }
}
