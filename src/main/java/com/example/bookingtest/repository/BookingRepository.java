package com.example.bookingtest.repository;

import com.example.bookingtest.models.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;
@Repository
public class BookingRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Booking> getBookings(Date date) {
        String query = "SELECT * FROM booking WHERE booking_date = ?";
        RowMapper<Booking> rowMapper= new BeanPropertyRowMapper<>(Booking.class);
        return jdbcTemplate.query(query,rowMapper, date);
    }
}
