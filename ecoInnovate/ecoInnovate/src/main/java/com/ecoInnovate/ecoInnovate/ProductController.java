package com.ecoInnovate.ecoInnovate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {
    private static final List<Product> products = new ArrayList<>();

    static{
        
       products.add(new Product("product 1", 500.0,0));
       products.add(new Product("product 2" , 1000.0,1));
       products.add(new Product("product 3", 12000.0,2));
       products.add(new Product("product 4",50000.0,3));
    }

     @GetMapping("/product")
    String product(Model model){
        model.addAttribute("products", products);
        model.addAttribute("newItem", new Product(null, 0,0));
        return "product";
        
    }
     @PostMapping("/new-item")
    String newItem(@RequestParam("name") String name, @RequestParam("price") double price){
        System.out.println("postmapping " + name);
        products.add(new Product(name, 0,0));
        return "redirect:/product";

    }

    @GetMapping("/remove-item/{itemName}")
    String removeItem(@PathVariable String itemName){
        System.out.println("det funkar " + itemName);
        products.removeIf(item -> item.getName() == itemName);
        return"redirect:/product";
    }
  
}
