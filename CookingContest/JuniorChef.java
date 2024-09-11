package CookingContest;

import java.util.ArrayList;

public class JuniorChef extends Chef {
    private SeniorChef supervisor;
    private ArrayList<Float> ratings;
    private Recipe recipe;

    public JuniorChef(int id, String name, Recipe recipe, SeniorChef supervisor) {
        super(id, name);
        this.recipe = recipe;
        this.supervisor = supervisor;
        ratings = new ArrayList<Float>();
    }

    public JuniorChef(int id, String name, SeniorChef supervisor) {
        this(id, name, null, supervisor);
    }

    public void setSupervisor(SeniorChef supervisor) {
        this.supervisor = supervisor;
    }

    public void addRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    @Override
    public boolean equals(Object object) {
        // return true in case both references point to the same object.
        if (this == object) return true;

        // return false if the object is not of type JuniorChef
        if (object.getClass() != this.getClass()) return false;

        // returns true if the recipe names and supervisor are equal
        return ((JuniorChef) object).supervisor.equals(this.supervisor) && (((JuniorChef) object).name).equals(this.name);
    }

    @Override
    public void rate(Float rating) {
        ratings.add(rating);
    }

    @Override
    public void printRating() {
        System.out.println(name);
        System.out.println("Rating table:");
        System.out.printf("%7s |\t %7s\n", "Index", "Rating");
        for (Float i : ratings)
            System.out.printf("%7d |\t %6.1f \n",  ratings.indexOf(i)+1 , (float) i);
    }
}
