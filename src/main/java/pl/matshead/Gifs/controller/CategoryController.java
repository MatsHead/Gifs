package pl.matshead.Gifs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import pl.matshead.Gifs.Category;
import pl.matshead.Gifs.Gif;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CategoryController {

    @GetMapping("/category/{param}")
    public String getSingleCategory(@PathVariable String param, ModelMap map){
        Category cat= null;
        for (Category category : Category.getCategories()) {
            if (category.getId().toString().equals(param)) {
                cat = category;
                break;
            }
        }
        List<Gif> gifForCategory = Gif.getGifs().stream()
                .filter(s->s.getCategoryId().toString().equals(param))
                .collect(Collectors.toCollection(ArrayList::new));
        map.put("category", cat);
        map.put("paths", gifForCategory);
        return "category";
    }
}
