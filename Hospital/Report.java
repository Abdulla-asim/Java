package Hospital;

public class Report {
    private String name;
    private String description;

    public Report(String name, String description)
    {
        this.name = name;
        this.description = description;
    }

    public String getReport() {
        return name + "'s Report : \n" + description;
    }
}

