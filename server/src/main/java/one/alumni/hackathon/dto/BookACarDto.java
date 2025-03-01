package one.alumni.hackathon.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import one.alumni.hackathon.entity.enums.BookCarStatus;


import java.text.DateFormat;
import java.util.Date;

@Data
public class BookACarDto {

    private Long id_booking;
    private Date booking_start_date;
    private Date booking_end_date;
    private Long booking_days;
    private double price;

    @Enumerated(EnumType.STRING)
    private BookCarStatus bookCarStatus;
    private Long id_user;
    private Long id_car;
}
