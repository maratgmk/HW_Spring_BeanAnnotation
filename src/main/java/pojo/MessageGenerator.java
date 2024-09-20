package pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component("generator")
@Scope("prototype")
public class MessageGenerator {

    public String  generateMessage()  {
        return "New message from generator : " + System.currentTimeMillis();
    }
}
