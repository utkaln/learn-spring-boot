package com.utkal.learn.springboot.utkallearnspringboot.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.Type;

@Entity(name = "speakers")
public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long speaker_id;
    private String first_name;
    private String last_name;
    private String title;
    private String company;
    private String speaker_bio;
    @Lob
    @Type(type="org.hibernate.type.BinaryType")
    private byte[] speaker_photo;

    @ManyToMany(mappedBy = "speakers")
    private List<Session> sessions;
    
    public Speaker(){

    }
    

    /**
     * @return Long return the speaker_id
     */
    public Long getSpeaker_id() {
        return speaker_id;
    }

    /**
     * @param speaker_id the speaker_id to set
     */
    public void setSpeaker_id(Long speaker_id) {
        this.speaker_id = speaker_id;
    }

    /**
     * @return String return the first_name
     */
    public String getFirst_name() {
        return first_name;
    }

    /**
     * @param first_name the first_name to set
     */
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    /**
     * @return String return the last_name
     */
    public String getLast_name() {
        return last_name;
    }

    /**
     * @param last_name the last_name to set
     */
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    /**
     * @return String return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return String return the company
     */
    public String getCompany() {
        return company;
    }

    /**
     * @param company the company to set
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * @return String return the speaker_bio
     */
    public String getSpeaker_bio() {
        return speaker_bio;
    }

    /**
     * @param speaker_bio the speaker_bio to set
     */
    public void setSpeaker_bio(String speaker_bio) {
        this.speaker_bio = speaker_bio;
    }


    /**
     * @return List<Sessions> return the sessions
     */
    public List<Sessions> getSessions() {
        return sessions;
    }

    /**
     * @param sessions the sessions to set
     */
    public void setSessions(List<Sessions> sessions) {
        this.sessions = sessions;
    }

}