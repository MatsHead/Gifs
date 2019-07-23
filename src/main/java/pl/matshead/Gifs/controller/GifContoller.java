package pl.matshead.Gifs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class GifContoller {
    @GetMapping("/")
    public String home(ModelMap modelMap){
        List<String> gifsPath = new ArrayList<>();
        gifsPath.add("android-explosion");
        gifsPath.add("ben-and-mike");
        gifsPath.add("compiler-bot");
        gifsPath.add("cowboy-coder");
        gifsPath.add("infinite-andrew");
        modelMap.put("paths", gifsPath);
        return "home";
    }

    @GetMapping("/favorites")
    public String getFavorites(){
        return "favorites";
    }

}
