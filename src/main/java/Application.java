import model.Speaker;
import service.SpeakerService;
import service.SpeakerServiceImpl;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        SpeakerService speakerService = new SpeakerServiceImpl();
        final List<Speaker> speakerList = speakerService.findAll();

        System.out.println(speakerList.get(0).getFirstName());
    }
}
