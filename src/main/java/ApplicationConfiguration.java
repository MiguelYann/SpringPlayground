import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import repository.HibernateSpeakerRepositoryImpl;
import repository.SpeakerRepository;
import service.SpeakerService;
import service.SpeakerServiceImpl;

@Configuration
public class ApplicationConfiguration {

    @Bean(name = "serviceSpeaker")
    public SpeakerService getSpeakerService() {
        SpeakerServiceImpl speakerService = new SpeakerServiceImpl();
        speakerService.setRepository(getSpeakerRepository());
        return new SpeakerServiceImpl();
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }
}
