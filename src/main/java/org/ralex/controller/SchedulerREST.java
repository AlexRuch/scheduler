package org.ralex.controller;

import org.ralex.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchedulerREST {

    private final EventService eventService;

    @Autowired
    public SchedulerREST(EventService eventService) {
        this.eventService = eventService;
    }



}
