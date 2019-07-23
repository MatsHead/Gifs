package pl.matshead.Gifs;


import java.util.ArrayList;
import java.util.List;

public class Category {
    private Integer id;
    private String name;

    public static List<Category> getCategories(){
        List<Category> categories = new ArrayList<>();
        categories.add(new Category(1,"programming"));
        categories.add(new Category(2,"bot"));
        categories.add(new Category(3,"others"));

        return categories;

    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
