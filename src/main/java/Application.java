import model.Speaker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.SpeakerService;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        SpeakerService speakerService = applicationContext.getBean("speakerService", SpeakerService.class);

        final List<Speaker> speakerList = speakerService.findAll();

        System.out.println(speakerList.get(0).getFirstName());
    }
}
