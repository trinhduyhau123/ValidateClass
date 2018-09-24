import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    public static final String ACCOUNT_CLASSROOM = "^|A|P|C[0-9]{4}G|H|I|K|L|M$";

    public Validate() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(ACCOUNT_CLASSROOM);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
