package task4;

public class Name {
    private String firstName;
    private String lastName;
    private String middleName;

    public Name(String firstName) {
        this.firstName = firstName;
    }

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Name(String firstName, String lastName, String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        if (firstName != null) {
            result.append(firstName).append(" ");
        }
        if (middleName != null) {
            result.append(middleName).append(" ");
        }
        if (lastName != null) {
            result.append(lastName);
        }

        return result.toString().trim();
    }
}