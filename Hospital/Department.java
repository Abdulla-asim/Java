package Hospital;

import java.util.ArrayList;

public class Department{
    private String name;
    private ArrayList<Staff> staff;

    public Department(String name) {
        this.name = name;
        this.staff = new ArrayList<Staff>();
    }

    public String getName() {
        return name;
    }

    public void addStaff(Staff staffMember) {
        staff.add(staffMember);
    }

    public void removeStaff(Staff staffMember) {
        staff.remove(staffMember);
    }
}
