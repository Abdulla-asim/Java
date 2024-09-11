public class Student extends Person{
    private final String status;

    public Student(String name, String address, String phoneNumber, String email, String status) {
        super(name, address, phoneNumber, email);
        if (status.equalsIgnoreCase("freshman") || status.equalsIgnoreCase("sophomore") || status.equalsIgnoreCase("junior") || status.equalsIgnoreCase("senior")) 
            this.status = status;
        else 
            throw new IllegalArgumentException("Invalid status");
    }

    @Override
    public String toString() {
        return String.format("Student: %s", name);
    }

    public String getStatus() {
        return status;
    }
}
