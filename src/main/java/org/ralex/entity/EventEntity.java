package org.ralex.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class EventEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long eventId;

    @Column
    private String eventName;

    @Column
    private String eventDescription;

    @Column
    private Date eventDate;

    @Column
    private String eventStatus;

    @OneToMany(mappedBy = "eventId")
    private List<EventDetailsEntity> eventDetailsEntityList;

    public long getEventId() {
        return eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventStatus() {
        return eventStatus;
    }

    public void setEventStatus(String eventStatus) {
        this.eventStatus = eventStatus;
    }

    public List<EventDetailsEntity> getEventDetailsEntityList() {
        return eventDetailsEntityList;
    }

    public void setEventDetailsEntityList(List<EventDetailsEntity> eventDetailsEntityList) {
        this.eventDetailsEntityList = eventDetailsEntityList;
    }
}
