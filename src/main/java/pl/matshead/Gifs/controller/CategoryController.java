package pl.matshead.Gifs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.matshead.Gifs.Category;
import pl.matshead.Gifs.Gif;
import pl.matshead.Gifs.repositories.GifRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CategoryController {

    @Autowired
    private GifRepository gifRepository;

    @GetMapping("/category/{param}")
    public String getSingleCategory(@PathVariable String param, ModelMap map){
        List<Gif> gifForCategory = gifRepository.getGifsForCategory(param);
        map.put("category", gifRepository.getCategory(param));
        map.put("paths", gifForCategory);
        return "category";
    }
}
