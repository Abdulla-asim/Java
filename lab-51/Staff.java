public class Staff extends Employee1 {
    protected String title;

    public Staff(String name, String address, String phoneNumber, String email, String title, double salary) {
        super(name, address, phoneNumber, email, title, salary);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff: " + name;
    }
}
