package CookingContest;

public abstract class Chef implements Ratable{
    protected int id;
    protected String name;

    public Chef(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
