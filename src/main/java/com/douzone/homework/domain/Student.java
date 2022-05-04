package com.douzone.homework.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int music;
    private int art;
    private int ath; // athletic
    private int sum;
    private double avg;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMusic() {
        return music;
    }

    public void setMusic(int music) {
        this.music = music;
    }

    public int getArt() {
        return art;
    }

    public void setArt(int art) {
        this.art = art;
    }

    public int getAth() {
        return ath;
    }

    public void setAth(int ath) {
        this.ath = ath;
    }

    public int getSum() {
        return sum;
    }

    public void setSum() {
        this.sum = music+art+ath;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg() {
        this.avg = (double)sum/3;
    }
}
