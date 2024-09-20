package pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Sms")
//@Scope("prototype")
public class SmsSender {
    private final MessageGenerator messageGenerator;

    @Autowired
    public SmsSender( MessageGenerator messageGenerator) {
        this.messageGenerator = messageGenerator;
    }

    public void sendSms(){
        System.out.println("Sending SMS : " + messageGenerator.generateMessage());
    }
}
