package pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Email")
//@Scope("prototype")
public class EmailSender  {
    private final MessageGenerator messageGenerator;

    @Autowired
    public EmailSender( MessageGenerator messageGenerator) {
        this.messageGenerator = messageGenerator;
    }
    public void sendEmail(){
        System.out.println("Sending Email : " + messageGenerator.generateMessage());
    }
}
