package Hospital;

import java.util.Date;

public abstract class Staff {
    protected int id;
    protected String name;
    protected char gender;
    protected Date dateOfJoining;
    protected static final int MAX_WORKING_HOURS = 12;

    public Staff(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dateOfJoining = new Date();
    }
}
