package com.solent.shipping_app.service;

import com.solent.shipping_app.data.models.Booking;
import com.solent.shipping_app.data.models.Ship;
import com.solent.shipping_app.data.payloads.request.BookingRequest;
import com.solent.shipping_app.data.payloads.request.ShipRequest;
import com.solent.shipping_app.data.payloads.response.MessageResponse;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface BookingService {
    MessageResponse createBooking(BookingRequest bookingRequest);
    Optional<Booking> updateBooking(Integer bookingId, BookingRequest bookingRequest);
    void deleteBooking(Integer bookingId);
    Booking getASingleBooking(Integer bookingId);
    List<Booking> getAllBooking();
}
