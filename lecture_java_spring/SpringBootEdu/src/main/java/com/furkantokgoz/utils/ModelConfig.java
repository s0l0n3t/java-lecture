package com.furkantokgoz.utils;

import org.springframework.ui.Model;

public class ModelConfig {
    //navbar rotate method
    public static void navbarModelConfig(Model model,String home,String thymeleaf, String projects,String contact) {
        model.addAttribute("navbarVarHome", home);
        model.addAttribute("navbarVarThymeleaf", thymeleaf);
        model.addAttribute("navbarVarProjects", projects);
        model.addAttribute("navbarVarContact", contact);
    }
}
