package com.furkantokgoz.controller;


import com.furkantokgoz.utils.ModelConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ThymeleafController {
    private final String navActive = "nav-link active";
    private final String navInactive = "nav-link";

    //https://localhost:8080/thymeleaf
    @GetMapping("/thymeleaf/thymeleaf")
    public String getTymeleaf(){
        return "thymeleaf";
    }
    @GetMapping("/homepage")
    public String getHomepage(Model model){
        ModelConfig.navbarModelConfig(model,navActive,navInactive,navInactive,navInactive);
        return "homepage";
    }

    @GetMapping("/thymeleaf/model")
    public String getThymeleafModel(Model model){
        model.addAttribute("p1Model","model message");
        model.addAttribute("p2Model","model2 message");
        model.addAttribute("navbarVar", "nav-link active");
        ModelConfig.navbarModelConfig(model,navInactive,navActive,navInactive,navInactive);
        return "thymeleaf";
    }

    @GetMapping("/thymeleaf/messages")
    public String getThymeleafMessages(Model model){
        ModelConfig.navbarModelConfig(model,navInactive,navInactive,navActive,navInactive);
        return "thymeleafmessages";
    }


}
