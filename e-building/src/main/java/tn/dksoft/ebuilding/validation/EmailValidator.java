package tn.dksoft.ebuilding.validation;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.regex.Pattern;
//load file and a variable environment
@Component
@PropertySource("classpath:application.yml")
public class EmailValidator {

    private final Pattern USER_INPUT_PATTERN;

    @Autowired
    public EmailValidator(@Value("${string.regex}") String regex) {
        this.USER_INPUT_PATTERN = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
    }

    public boolean checkMailPattern(String emailAddress) {
        return USER_INPUT_PATTERN.matcher(emailAddress).matches();
    }
}
