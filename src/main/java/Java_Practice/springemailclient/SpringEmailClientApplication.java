package Java_Practice.springemailclient;

import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringEmailClientApplication {

    @Autowired
    private EmailSenderService service;

    public static void main(String[] args) {
        SpringApplication.run(SpringEmailClientApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void triggerEmail() {
        service.sendSimpleEmail("dushyant.june6@gmail.com",
                "Hello, this is a test email",
                "test email");
    }

//    @EventListener(ApplicationReadyEvent.class)
//    public void triggerMail() throws MessagingException {
//
//        service.sendEmailWithAttachment("spring.email.to@gmail.com",
//                "This is Email Body with Attachment...",
//                "This email has attachment",
//                "D:\\Downloads\\test-pic.jpg");
//
//    }


}


