package com.example.bookingtest.models;

import java.sql.Date;
import java.sql.Time;

public class Booking {
    private int bookingId;
    private String bookingDescription;
    private Date bookingDate;
    private int bookingTimeStart;
    private int bookingTimeEnd;

    public Booking() {
    }

    public String getBookingDescription() {
        return bookingDescription;
    }

    public void setBookingDescription(String bookingDescription) {
        this.bookingDescription = bookingDescription;
    }

    public int getBookingTimeEnd() {
        return bookingTimeEnd;
    }

    public void setBookingTimeEnd(int bookingTimeEnd) {
        this.bookingTimeEnd = bookingTimeEnd;
    }

    public int getBookingTimeStart() {
        return bookingTimeStart;
    }

    public void setBookingTimeStart(int bookingTimeStart) {
        this.bookingTimeStart = bookingTimeStart;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }
}


