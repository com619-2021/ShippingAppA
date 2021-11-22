package com.solent.shipping_app.web;

import com.solent.shipping_app.data.models.Booking;
import com.solent.shipping_app.data.models.Ship;
import com.solent.shipping_app.data.payloads.request.BookingRequest;
import com.solent.shipping_app.data.payloads.request.ShipRequest;
import com.solent.shipping_app.data.payloads.response.MessageResponse;
import com.solent.shipping_app.service.BookingService;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/booking")
//Line 19 to 24 is the newly added code for swagger documentation
@ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 400, message = "This is a bad request, please follow the API documentation for the proper request format"),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Due to security constraints, your access request cannot be authorized"),
        @io.swagger.annotations.ApiResponse(code = 500, message = "The server is down. Please bear with us."),
}
)
public class BookingController {

    @Autowired
    BookingService bookingService;

    @GetMapping("/all")
    public ResponseEntity<List<Booking>> getAllBooking() {
        List<Booking> footballers = bookingService.getAllBooking();
        return new ResponseEntity<>(footballers, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Booking> getBookingByID(@PathVariable("id") Integer id) {
        Booking booking = bookingService.getASingleBooking(id);
        return new ResponseEntity<>(booking, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<MessageResponse> addBooking(@RequestBody BookingRequest booking) {
        MessageResponse newBooking = bookingService.createBooking(booking);
        return new ResponseEntity<>(newBooking, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public Optional<Booking> updateBooking(@PathVariable Integer id, @RequestBody BookingRequest booking) {
        return bookingService.updateBooking(id, booking);

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteBooking(@PathVariable("id") Integer id) {
        bookingService.deleteBooking(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}