package CookingContest;

import java.time.LocalDate;
import java.util.ArrayList;

class CookingContest {
    private ArrayList<Chef> chefs;
    private LocalDate contestDate;
    private double prize;

    public CookingContest(ArrayList<Chef> chefs, LocalDate contestDate, double prize) {
        this.chefs = chefs;
        this.contestDate = contestDate;
        this.prize = prize;
    }

    public CookingContest(LocalDate date) {
        this(null, date, 0);
        this.chefs = new ArrayList<Chef>();
    }

    public void setChefs(ArrayList<Chef> chefs) {
        this.chefs = chefs;
    }

    public void setContestDate(LocalDate contestDate) {
        this.contestDate = contestDate;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    public void addChef(Chef chef) {
        chefs.add(chef);
    }

    public void removeChef(Chef chef) {

    }


    public static void main(String[] args)
    {
        SeniorChef seniorChef = new SeniorChef(1,"senior", 12);

        seniorChef.addRecipe(new Recipe("Pasta Carbonara", "Spaghetti, eggs, bacon" +
                "1. Cook spaghetti according to package instructions. " +
                "2. In a bowl, whisk together eggs, grated Parmesan cheese, and black pepper."));

        seniorChef.rate(4.5f);

        JuniorChef juniorChef = new JuniorChef(2,"junior", seniorChef);

        juniorChef.addRecipe(new Recipe("Vegetable Lasagna", "Lasagna noodles, marinara sauce, ricotta cheese" +
                "1. Cook lasagna noodles according to package instructions. 2. In a baking dish, layer marinara " +
                        "sauce, lasagna noodles, ricotta cheese, spinach, sliced zucchini, and bell peppers."));

        juniorChef.rate(4.3f);

        // creating a contest
        CookingContest contest = new CookingContest(LocalDate.of(2023, 12, 1));
        contest.addChef(seniorChef);
        contest.addChef(juniorChef);

        //Rating Recipe of  chef

        juniorChef.rate(4.5f);
        seniorChef.rate(7f);


        //get ratings
        seniorChef.printRating();
        juniorChef.printRating();

    }
}
