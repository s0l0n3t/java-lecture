package com.furkantokgoz.controller;


import com.furkantokgoz.bean.PersonalBeanConfig;
import com.furkantokgoz.dto.PersonalDto;
import com.furkantokgoz.dto.ProductDto;
import com.furkantokgoz.utils.ModelConfig;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class ThymeleafController {
    private final String navActive = "nav-link active";
    private final String navInactive = "nav-link";
    @Autowired
    private PersonalBeanConfig personalBeanConfig;

    //https://localhost:8080/thymeleaf
    @GetMapping("/thymeleaf/thymeleaf")
    public String getTymeleaf(){
        return "thymeleaf";
    }

    @GetMapping({"/", "index"})
    public String index(Model model){
        ModelConfig.navbarModelConfig(model,navActive,navInactive,navInactive,navInactive);
        return "homepage";
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
//    @GetMapping("/thymeleaf/messages")
//    public String getThymeleafMessages(Model model){
//        ModelConfig.navbarModelConfig(model,navInactive,navInactive,navActive,navInactive);
//        model.addAttribute("productVar","model message");
//        return "thymeleafmessages";
//    }


    @GetMapping({"/thymeleaf/messages", "/thymeleaf/messages/{id}"})
    public String getThymeleafMessage(Model model,@PathVariable(value = "id",required = false) Long id){
        ModelConfig.navbarModelConfig(model,navInactive,navInactive,navActive,navInactive);
        if(id == null){
            model.addAttribute("productVar",new ProductDto());
            return "thymeleafmessages";
        }
        model.addAttribute("productVar",new ProductDto(id,"productName","asd",12));
        return "thymeleafmessages";
    }

    @GetMapping("/thymeleaf/object")
    public String getThymeleafObject(Model model){
        ModelConfig.navbarModelConfig(model,navInactive,navInactive,navActive,navInactive);
        ProductDto product = ProductDto.builder().productId(1).productName("pencil").productDescription("its a wooden pencil. It means you can write someting.").productPrice(100).build();
        model.addAttribute("productVar",product);
        return "thymeleafmessages";
    }

    //http://localhost:8080/thymeleaf?username=admin&password=pass
    @GetMapping("/thymeleaf")
    public String getThymeleaf(Model model, @RequestParam(name ="username",required = false) String username, @RequestParam(name ="password",required = false) String password){
        personalBeanConfig.PersonalBeanConfig().setUsername(username);
        personalBeanConfig.PersonalBeanConfig().setPassword(password);
        model.addAttribute("p1Model",personalBeanConfig.PersonalBeanConfig().getUsername());
        model.addAttribute("p2Model",personalBeanConfig.PersonalBeanConfig().getPassword());
        if(username == null || password == null){
            model.addAttribute("p1Model","bad parameters");
            model.addAttribute("modelVar","display:none;");
            return "thymeleafModel";
        }
        return "thymeleafModel";
    }

    @GetMapping("/thymeleaf/login")
    public String getThymeleafLogin(Model model){
        ModelConfig.navbarModelConfig(model,navInactive,navInactive,navInactive,navActive);
        model.addAttribute("p1Model","This is thymeleaf");
        return "thymeleafPost";
    }

    @GetMapping("/thymeleaf/error")
    public String getThymeleafError(Model model){
        ModelConfig.navbarModelConfig(model,navInactive,navInactive,navInactive,navActive);
        model.addAttribute("p0Model","bad parameters");
        model.addAttribute("modelVar","display:none;");
        return "thymeleafPost";
    }

    @PostMapping("/thymeleaf/login")
    public String postThymeleafLogin(@RequestParam(name="email",required = false) String email, @RequestParam(name = "password",required = false) String password, Model model){
        ModelConfig.navbarModelConfig(model,navInactive,navInactive,navInactive,navActive);
        personalBeanConfig.PersonalBeanConfig().setEmail(email);
        personalBeanConfig.PersonalBeanConfig().setPassword(password);
        if(email == null || password.length()<=2){
//            model.addAttribute("p0Model","bad parameters");
//            model.addAttribute("modelVar","display:none;");
            return "redirect:/thymeleaf/error";
        }
        if(personalBeanConfig.PersonalBeanConfig().getEmail().equals("admin@admin") && personalBeanConfig.PersonalBeanConfig().getPassword().equals("123")){
            model.addAttribute("p1Model","Success");
            model.addAttribute("p2Model",personalBeanConfig.PersonalBeanConfig());
            return "thymeleafPost";
        }
        model.addAttribute("p1Model","Fail");
        model.addAttribute("p2Model",personalBeanConfig.PersonalBeanConfig());
        return "thymeleafPost";
    }
}
