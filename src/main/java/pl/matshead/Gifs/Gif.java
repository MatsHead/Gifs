package pl.matshead.Gifs;

import java.util.ArrayList;
import java.util.List;

public class Gif {
    private String name;
    private Boolean favorite;
    private String categoryId;

    public Gif(String name, Boolean favorite, String categoryId) {
        this.name = name;
        this.favorite = favorite;
        this.categoryId = categoryId;
    }

    public static List<Gif> getGifs() {
        List<Gif> gifs = new ArrayList<>();
        gifs.add(new Gif("android-explosion", false, "1"));
        gifs.add(new Gif("ben-and-mike", true, "2"));
        gifs.add(new Gif("compiler-bot", false, "2"));
        gifs.add(new Gif("cowboy-coder", false, "3"));
        gifs.add(new Gif("infinite-andrew", true, "3"));
        return gifs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

    public Gif(String name, Boolean favorite) {
        this.name = name;
        this.favorite = favorite;
    }

}
