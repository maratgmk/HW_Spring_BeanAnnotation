import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.EmailSender;
import pojo.MessageGenerator;
import pojo.SmsSender;

public class Main {
    public static void main(String[] args)  {
       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MessageGenerator mg = context.getBean("generator",MessageGenerator.class);
        System.out.println(mg);
        System.out.println(mg.generateMessage());
        MessageGenerator mg1 = context.getBean("generator",MessageGenerator.class);
        System.out.println(mg1);
        System.out.println(mg1.generateMessage());
        System.out.println(mg==mg1);
        SmsSender sms = context.getBean("Sms", SmsSender.class);
        SmsSender sms1 = context.getBean("Sms", SmsSender.class);
        sms.sendSms();
        System.out.println(sms);
        sms1.sendSms();
        System.out.println(sms1);
        System.out.println(sms == sms1);
        EmailSender emailSender = context.getBean("Email",EmailSender.class);
        EmailSender emailSender1 = context.getBean("Email",EmailSender.class);
        emailSender.sendEmail();
        emailSender1.sendEmail();
        System.out.println(emailSender);
        System.out.println(emailSender1);
        System.out.println(emailSender == emailSender1);
    }
}
/**
 * 1 Создайте класс MessageGenerator, который генерирует уникальные сообщения с
 * временной меткой. Каждый раз, когда бин запрашивается из контекста, создаётся новый
 * экземпляр MessageGenerator. Внедрите этот бин в бины класса EmailSender и SmsSender.
 * Используйте аннотации.
 */