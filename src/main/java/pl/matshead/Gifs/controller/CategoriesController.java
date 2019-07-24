package pl.matshead.Gifs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.matshead.Gifs.Category;
import pl.matshead.Gifs.Gif;
import pl.matshead.Gifs.repositories.GifRepository;

@Controller
public class CategoriesController {

    @Autowired
    GifRepository gifRepository;

    @GetMapping("/categories")
    public String index(@RequestParam(required = false) String q, ModelMap map){
        map.put("categories", Category.getCategories());
        return "categories";
    }




}
