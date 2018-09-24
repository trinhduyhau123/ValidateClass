public class ValidateTest {
    private static Validate validate;

    public static final String[] validClass = {"C0318G"};
    public static final String[] invalidClass = {"M0318G"," P0323A"};

    public static void main(String[] args) {
        validate = new Validate();

        for (String item : validClass) {
            boolean isValid = validate.validate(item);
            System.out.println("Class: "+ item + " is valid: "+ isValid);
        }

        for (String item : invalidClass) {
            boolean isValid = validate.validate(item);
            System.out.println("Class: "+ item+ " is valid: "+ isValid);
        }
    }

}
