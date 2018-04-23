package org.ralex.entity;


import javax.persistence.*;

@Entity
public class EventDetailsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long eventDetailId;

    @Column
    private String detail;

    @Column
    private String imagePath;

    @Column
    private String filePath;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private EventEntity eventId;

    public EventEntity getEventId() {
        return eventId;
    }

    public void setEventId(EventEntity eventId) {
        this.eventId = eventId;
    }

    public long getEventDetailId() {
        return eventDetailId;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
