package CookingContest;

import java.util.ArrayList;

public class Recipe implements Ratable{
    private String name;
    private String description;
    private ArrayList<Float> ratings;
    
    public Recipe(String name, String description) {
        this.description = description;
        this.name = name;
        this.ratings = new ArrayList<Float>();
    }

    @Override
    public boolean equals(Object object) {
        // return true in case both references point to the same object.
        if (this == object) return true;

        // return false if the object is not of type Recipe
        if (object.getClass() != this.getClass()) return false;

        // returns true if the recipe names and description are equal (by comparing strings)
        return ((Recipe) object).name.equals(this.name) && (((Recipe) object).description).equals(this.description);
    }

    @Override
    public void rate(Float rating) {
        ratings.add(rating);
    }

    @Override
    public void printRating() {
        System.out.println("Rating table:");
        System.out.printf("%7s |\t %7s", "Index", "Rating");
        for (Float i : ratings)
            System.out.printf("%7d |\t %6.1f",  ratings.indexOf(i)+1 , (float) i);
    }
}
