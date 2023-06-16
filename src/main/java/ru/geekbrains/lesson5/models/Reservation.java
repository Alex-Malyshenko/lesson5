package ru.geekbrains.lesson5.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Reservation {
    private final Collection<Reservation> reservations = new ArrayList<>();

    private static int counter = 9000;
    private final int id;

    private Date date;
    private String name;

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    {
        id = ++counter;
    }

    public Reservation(Date date, String name) {
        this.date = date;
        this.name = name;
    }

    public Collection<Reservation> getReservations() {
        return reservations;
    }
}
