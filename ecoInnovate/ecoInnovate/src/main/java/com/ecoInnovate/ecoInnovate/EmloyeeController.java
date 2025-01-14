package com.ecoInnovate.ecoInnovate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmloyeeController {
     private static final List<Employee> employees = new ArrayList<>(); 
    static{
        employees.add(new Employee("Kajsa","Kajsasson", "VD", 012452, "kajsa@.com"));
        employees.add(new Employee("Ove","Ovesson", "ekonomi", 012455, "ove@.com"));
    }

    @GetMapping("/employee")
    String employee(Model model) {
        model.addAttribute("employees", employees);
        model.addAttribute("newEmployee", new Employee(null,null, null, 0, null));
        return "employee";
    }
    @PostMapping("/new-empolyee")
    String newItem(@RequestParam("firstName")String firstName, @RequestParam("lastName")String lastName,  @RequestParam("title")String title,  @RequestParam("number")int number,@RequestParam("email")String email){
        System.out.println("postmapping "+ firstName);
        employees.add(new Employee(firstName, lastName, title,number, email));
        return "redirect:/employee";
        
    }  
    
    
   
   

}
