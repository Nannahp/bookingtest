CREATE DATABASE IF NOT EXISTS bookingtest;
USE bookingtest;

DROP TABLE IF EXISTS booking;
CREATE TABLE booking (
                     booking_id INT AUTO_INCREMENT PRIMARY KEY,
                     booking_date DATE NOT NULL,
                     booking_time_start int NOT NULL,
                     booking_time_end int NOT NULL,
                     booking_description VARCHAR(255)
			
);

INSERT INTO booking (booking_date, booking_time_start, booking_time_end, booking_description) 
VALUES ('2024-04-30', 10, 12, 'test1'), ('2024-04-30', 14, 18, 'test2');


SELECT * FROM booking;