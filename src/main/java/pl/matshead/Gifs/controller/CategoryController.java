package pl.matshead.Gifs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.matshead.Gifs.Category;

@Controller
public class CategoryController {


    @GetMapping("/categories")
    public String index(ModelMap map){
        map.put("categories", Category.getCategories());
        return "categories";
    }




}
