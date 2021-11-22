package com.solent.shipping_app.service;

import com.solent.shipping_app.data.models.Booking;
import com.solent.shipping_app.data.models.Ship;
import com.solent.shipping_app.data.payloads.request.BookingRequest;
import com.solent.shipping_app.data.payloads.request.ShipRequest;
import com.solent.shipping_app.data.payloads.response.MessageResponse;
import com.solent.shipping_app.data.repository.BookingRepo;
import com.solent.shipping_app.data.repository.ShipRepo;
import com.solent.shipping_app.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingServiceImpl implements BookingService {
    @Autowired
    BookingRepo bookingRepo;


    @Override
    public MessageResponse createBooking(BookingRequest bookingRequest) {
        Booking newBooking = new Booking();
        newBooking.setStartDate(bookingRequest.getStartDate());
        newBooking.setEndDate(bookingRequest.getEndDate());
        newBooking.setServices(bookingRequest.getServices());
        bookingRepo.save(newBooking);
        return new MessageResponse("New Booking created successfully");

    }


    @Override
    public Optional<Booking> updateBooking(Integer bookingID, BookingRequest bookingRequest) throws ResourceNotFoundException {
        Optional<Booking> booking = bookingRepo.findById(bookingID);
        if (booking.isEmpty()) {
            throw new ResourceNotFoundException("Booking", "id", bookingID);
        } else
            booking.get().setStartDate(bookingRequest.getStartDate());
        booking.get().setEndDate(bookingRequest.getEndDate());
        booking.get().setServices(bookingRequest.getServices());
        bookingRepo.save(booking.get());
        return booking;
    }

    @Override
    public Booking getASingleBooking(Integer bookingID) throws ResourceNotFoundException {
        return bookingRepo.findById(bookingID).orElseThrow(() -> new ResourceNotFoundException("Booking", "id", bookingID));
    }

    @Override
    public List<Booking> getAllBooking() {
        return bookingRepo.findAll();
    }

    @Override
    public void deleteBooking(Integer bookingID) throws ResourceNotFoundException {
        if (bookingRepo.getById(bookingID).getId().equals(bookingID)) {
            bookingRepo.deleteById(bookingID);
        } else throw new ResourceNotFoundException("Booking", "id", bookingID);
    }

}

