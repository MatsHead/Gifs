package pl.matshead.Gifs;

import java.util.ArrayList;
import java.util.List;

public class Gif {
    private String name;
    private Boolean favorite;
    private static List<Gif> gifs = new ArrayList<>();

    public static List<Gif> getGifs() {
        gifs.add(new Gif("android-explosion", false));
        gifs.add(new Gif("ben-and-mike", true));
        gifs.add(new Gif("compiler-bot", false));
        gifs.add(new Gif("cowboy-coder", false));
        gifs.add(new Gif("infinite-andrew", true));
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
