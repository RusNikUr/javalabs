package task1;

public class Name {
    private String lastName;
    private String firstName;
    private String middleName;

    public Name(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        if (lastName != null) {
            result.append(lastName).append(" ");
        }
        if (firstName != null) {
            result.append(firstName).append(" ");
        }
        if (middleName != null) {
            result.append(middleName);
        }

        return result.toString().trim();
    }
}
