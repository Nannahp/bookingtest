package com.example.bookingtest.service;

import com.example.bookingtest.models.Booking;
import com.example.bookingtest.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
@Service
public class BookingService {
    @Autowired
    BookingRepository bookingRepository;

    public List<Booking> getBookings(Date date){

        return bookingRepository.getBookings(date);

    }

    @Autowired
    private EmailService emailService;

   // public void processBooking(Booking booking) {
    public void processBooking() {

        // After processing, send confirmation email
        //String recipientEmail = booking.getUserEmail();
        String recipientEmail =  "nannahofgaard@hotmail.com";
        String subject = "Booking Confirmation";
        //String body = "Dear " + booking.getUserName() + ",\n\nYour booking has been confirmed.";
        String body = "Dear Nanna" + ",\n\nYour booking has been confirmed.";

        emailService.sendConfirmationEmail(recipientEmail, subject, body);
    }
}

