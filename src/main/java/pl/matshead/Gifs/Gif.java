package pl.matshead.Gifs;

import java.util.ArrayList;
import java.util.List;

public class Gif {
    private String name;
    private Boolean favorite;
    private String categoryId;

    public String getCategoryId() {
        return categoryId;
    }

    public Gif(String name, Boolean favorite, String categoryId) {
        this.name = name;
        this.favorite = favorite;
        this.categoryId = categoryId;
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

    public static Gif getGifByName(String name, List<Gif> list){
        for (Gif g : list) {
            if (g.getName().equals(name)) {
                return g;
            }
        }
        return null;
    }

}
