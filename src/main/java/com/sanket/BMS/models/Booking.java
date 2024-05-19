package com.sanket.BMS.models;

import com.sanket.BMS.models.enums.BookingStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Booking extends BaseModel {
    private String number;
    @ManyToOne
    private User user;
    @Enumerated(EnumType.ORDINAL)
    private BookingStatus status;
    private Date showTime;
    private Double amount;
    @ManyToMany
    private List<ShowSeat> seats;
    @OneToMany
    private List<Payment> payments;

}
