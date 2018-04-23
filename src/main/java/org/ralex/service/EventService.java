package org.ralex.service;

import org.ralex.entity.EventEntity;

public interface EventService {

    void createEvent();
    void deleteEvent();
    void addDetails(String details);
    void addDetailsImage(String details, String imagePath);
    void addDetailsFile(String details, String imagePath);
    void addDetailsImageFile(String details, String imagePath, String filePath);
    EventEntity getEvent(long eventId);
}
