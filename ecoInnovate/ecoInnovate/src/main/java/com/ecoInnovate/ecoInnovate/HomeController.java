package com.ecoInnovate.ecoInnovate;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
private static final Home home = new Home("Vi är ett litet familje företag", "Göra miljön bättre", "Bli störst i världen");

@GetMapping("/home")
String homePage(Model model){
   model.addAttribute("aboutUs", home.getAboutUs());
   model.addAttribute("vision", home.getVision());
   model.addAttribute("goal", home.getGoal());
    
    return "home";
}
}
    

  

   










    
   

   

   
    
    

   
    
   


