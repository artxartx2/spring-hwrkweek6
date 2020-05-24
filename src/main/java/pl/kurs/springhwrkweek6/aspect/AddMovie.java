package pl.kurs.week6.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import pl.kurs.week6.service.MailService;

import javax.mail.MessagingException;

@Component
@Aspect
public class AddMovie {

    private MailService mailService;

    public AddMovie(MailService mailService) {
        this.mailService = mailService;
    }

    @After("@annotation(MovieAspect)")
    private void aftefAddMovie() throws MessagingException {
        System.out.println("The new movie was added!");
        mailService.sendMail("artx@post.pl",
                "The new movie was added!",
                "Message from Api application", true);
    }
}
