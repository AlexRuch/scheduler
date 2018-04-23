package org.ralex.service.impl;

import org.ralex.entity.EventEntity;
import org.ralex.service.EventService;
import org.springframework.stereotype.Service;

@Service("eventService")
public class EventServiceImpl implements EventService {
    @Override
    public void createEvent() {

    }

    @Override
    public void deleteEvent() {

    }

    @Override
    public void addDetails(String details) {

    }

    @Override
    public void addDetailsImage(String details, String imagePath) {

    }

    @Override
    public void addDetailsFile(String details, String imagePath) {

    }

    @Override
    public void addDetailsImageFile(String details, String imagePath, String filePath) {

    }

    @Override
    public EventEntity getEvent(long eventId) {
        return null;
    }
}
