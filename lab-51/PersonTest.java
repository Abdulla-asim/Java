public class PersonTest {
    public static void main(String[] args) {
        Person myPerson = new Person("John Doe", "1234 Elm St", "123-456-7890", "johnDoe@mail.com");
        System.out.println(myPerson);

        Employee1 employee = new Employee1("Jane Doe", "1234 Elm St", "123-456-7890", "johnDoe@mail.com", "Office 1", 100000);
        System.out.println(employee);

        Faculty faculty = new Faculty("John Doe", "1234 Elm St", "123-456-7890", "johnDoe@mail.com", "Office 1", 100000, "9-5", "Professor");
        System.out.println(faculty);

        Staff staff = new Staff("John Doe", "1234 Elm St", "123-456-7890", "johnDoe@mail.com", "Secretary", 50000);
        System.out.println(staff);

        Student student = new Student("John Doe", "1234 Elm St", "123-456-7890", "johnDoe@mail.com", "Freshman");
        System.out.println(student);
    }
}
