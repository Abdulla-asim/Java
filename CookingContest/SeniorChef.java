package CookingContest;

import java.util.ArrayList;

public class SeniorChef extends Chef{
    private int experience;
    private ArrayList<Float> ratings;
    private ArrayList<Recipe> recipes;

    public SeniorChef(int id, String name, ArrayList<Recipe> recipes, int experience) {
        super(id, name);
        this.recipes = recipes;
        this.experience = experience;
        ratings = new ArrayList<Float>();
    }

    public SeniorChef(int id, String name, int experience) {
        this(id, name, null, experience);
        recipes = new ArrayList<Recipe>();
    }

    @Override
    public boolean equals(Object object) {
        // return true in case both references point to the same object.
        if (this == object) return true;

        // return false if the object is not of type SeniorChef
        if (object.getClass() != this.getClass()) return false;

        // returns true if the names and experience are equal
        return ((SeniorChef) object).experience == this.experience && (((SeniorChef) object).name).equals(this.name);
    }

    @Override
    public void rate(Float rating) {
        ratings.add(rating);
    }

    @Override
    public void printRating() {
        System.out.println(name);
        System.out.println("Rating table:");
        System.out.printf("%7s |\t %7s", "Index", "Rating\n");
        for (Float i : ratings)
            System.out.printf("%7d |\t %6.1f \n",  ratings.indexOf(i)+1 , (float) i);
    }

    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }
}
