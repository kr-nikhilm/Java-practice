import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        Pattern pt = Pattern.compile("Hello");
        Matcher matcher = pt.matcher("Hello world");

        Boolean found = matcher.find();
        if (found)
            System.out.println("Found");
        else
            System.out.println("Not found");
    }
}