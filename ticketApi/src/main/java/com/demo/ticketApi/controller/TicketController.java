package com.demo.ticketApi.controller;

import com.demo.ticketApi.model.FlightDTO;
import com.demo.ticketApi.model.Ticket;
import com.demo.ticketApi.service.FlightClient;
import com.demo.ticketApi.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {


    @Autowired
    private TicketService ticketService;

    @Autowired
    private FlightClient flightClient;

    @GetMapping("")
    public List<Ticket> getAllTicket() {
        return ticketService.findAllTickets();
    }

    @GetMapping("/flights")
    public List<FlightDTO> getAllFlights() {
        return flightClient.getAllFlights();
    }

    @PostMapping("/add")
    public Ticket addTicket(@RequestBody Ticket ticket) {
        return ticketService.addTicket(ticket);
    }



}

