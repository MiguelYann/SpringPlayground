package repository;

import model.Speaker;

import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {
        Speaker speaker = new Speaker();
        speaker.setFirstName("Miguel");
        speaker.setLastName("Tsamba");

        return List.of(speaker);
    }
}
