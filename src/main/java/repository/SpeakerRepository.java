package repository;

import model.Speaker;
import service.SpeakerServiceImpl;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
