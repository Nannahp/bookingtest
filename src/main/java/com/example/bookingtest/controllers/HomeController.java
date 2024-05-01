package com.example.bookingtest.controllers;

import com.example.bookingtest.models.Booking;
import com.example.bookingtest.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.Date;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
BookingService bookingService;

    @GetMapping("/")
    public String home(Model model) {
        // Parse the date string into a java.sql.Date object
        Date date = Date.valueOf("2024-04-30");

        // Call the service method to get bookings for the specified date
        List<Booking> bookings = bookingService.getBookings(date);

        // Add the bookings to the model
        model.addAttribute("bookings", bookings);

        return "home/index";
    }

    @PostMapping("/")
    public String sendEmail(Model model){
        bookingService.processBooking();
        model.addAttribute("email", "email send");
        return "home/index";

    }

}
